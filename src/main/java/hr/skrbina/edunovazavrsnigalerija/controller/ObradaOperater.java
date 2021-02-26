/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Operater;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Hrvoje
 */
public class ObradaOperater extends ObradaOsoba<Operater> {

    public Operater autoriziraj(String email, char[] lozinka) {

        Operater operater = (Operater) session.createQuery(
                "from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();

        if (operater == null) {
            return null;
        }

        return BCrypt.checkpw(new String(lozinka), operater.getLozinka())
                ? operater : null;
    }

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
        super.kontrolaCreate();
        kontrolaUloga();
        kontrolaOibBazaKreiraj();
        kontrolaLozinka();
        kontrolaUlogaOdabran();

    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        super.kontrolaUpdate();
        kontrolaOibBazaPromjeni();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {

    }

    @Override
    public List<Operater> getPodaci() {
        return session.createQuery("from Operater").list();
    }

    private void kontrolaUloga() throws SkrbinaException {
        if (entitet.getUloga() == null) {
            throw new SkrbinaException("Uloga je obavezna, ne može biti prazna!");
        }

    }

    private void kontrolaLozinka() throws SkrbinaException {
        if (entitet.getLozinka().isEmpty() || entitet.getLozinka() == null) {
            throw new SkrbinaException("Lozinka je obavezna, ne može biti prazna!");
        }
    }

    private void kontrolaOibBazaKreiraj() throws SkrbinaException {
        List<Operater> lista = session.createQuery(""
                + " from Operater o "
                + " where o.oib=:oib "
        )
                .setParameter("oib", entitet.getOib())
                .list();
        if (lista.size() > 0) {
            throw new SkrbinaException("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", unesite drugi OIB!");
        }

    }

    private void kontrolaOibBazaPromjeni() throws SkrbinaException {
        List<Operater> lista = session.createQuery(""
                + " from Operater o "
                + " where o.oib=:oib and o.id!=:id"
        )
                .setParameter("oib", entitet.getOib())
                .setParameter("id", entitet.getId())
                .list();
        if (lista.size() > 0) {
            throw new SkrbinaException("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", unesite drugi OIB!");
        }

    }

    private void kontrolaUlogaOdabran() throws SkrbinaException {
        if (entitet.getUloga() == null) {
            throw new SkrbinaException("Potrebno je odabrati ulogu iz padajućeg izbornika!");
        }
    }
}
