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
        kontrolaIme();
        kontrolaPrezime();
        kontrolaRodjendan();
        kontrolUloge();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        super.kontrolaUpdate();
        kontrolaIme();
        kontrolaPrezime();
        kontrolaRodjendan();
        kontrolUloge();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {
        if (entitet.getKup_Djelo().length() > 0 || entitet.getProd_Djelo().length() > 0) {
            throw new SkrbinaException("Korisnik se ne može obrisati jer ima jedno ili više kupljenih / prodanih djela!");
        }
    }

    @Override
    public List<Korisnik> getPodaci() {
        return session.createQuery("from Korisnik").list();
    }

    public List<Korisnik> getPodaci(String uvjet) {
        return session.createQuery("from Korisnik k where user(k.ime, ' ', k.prezime, ' ', k.oib) "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }
}
