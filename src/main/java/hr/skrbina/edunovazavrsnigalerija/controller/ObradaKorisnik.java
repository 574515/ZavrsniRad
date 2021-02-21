/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Korisnik;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import java.util.List;

/**
 *
 * @author Hrvoje
 */
public class ObradaKorisnik extends ObradaOsoba<Korisnik> {
    
    public ObradaKorisnik() {}
    
    @Override
    protected void kontrolaCreate() throws SkrbinaException {
        super.kontrolaCreate();
        kontrolaOibBazaKreiraj();
        kontrolaKontaktBroj();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        super.kontrolaUpdate();
        kontrolaOibBazaPromjeni();
        kontrolaKontaktBroj();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {
        if (entitet.getKup_Djelo() > 0 || entitet.getProd_Djelo() > 0) {
            throw new SkrbinaException("Korisnik se ne može obrisati jer ima jedno ili više kupljenih / prodanih djela!");
        }
    }

    private void kontrolaKontaktBroj() throws SkrbinaException {
        if (entitet.getKontakt().isEmpty()) {
            throw new SkrbinaException("Kontakt broj ne smije biti prazan!");
        }
        if (!entitet.getKontakt().matches("[0-9]+")) {
            throw new SkrbinaException("Kontakt broj nije valjan!");
        }
        if (entitet.getKontakt().length()> 14) {
            throw new SkrbinaException("Kontakt broj nije valjan!");
        }
        if (entitet.getKontakt().length()< 9) {
            throw new SkrbinaException("Kontakt broj nije valjan!");
        }
    }

    @Override
    public List<Korisnik> getPodaci() {
        return session.createQuery("from Korisnik").list();
    }

    public List<Korisnik> getPodaci(String uvjet) {
        return session.createQuery("from Korisnik k "
                + " where user(k.ime, ' ', k.prezime, ' ', k.oib) "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }

    private void kontrolaOibBazaKreiraj() throws SkrbinaException {
        List<Korisnik> lista = session.createQuery(""
                + " from Korisnik k "
                + " where k.oib=:oib "
        )
                .setParameter("oib", entitet.getOsoba().getOib())
                .list();
        if (lista.size() > 0) {
            throw new SkrbinaException("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", unesite drugi OIB!");
        }
    }

    private void kontrolaOibBazaPromjeni() throws SkrbinaException {
        List<Korisnik> lista = session.createQuery(""
                + " from Korisnik k "
                + " where k.oib=:oib and k.id!=:id"
        )
                .setParameter("oib", entitet.getOib())
                .setParameter("id", entitet.getId())
                .list();
        if (lista.size() > 0) {
            throw new SkrbinaException("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", unesite drugi OIB!");
        }
    }
}
