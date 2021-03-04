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
                " from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();
        if (operater == null) {
            return null;
        }
        return BCrypt.checkpw(new String(lozinka), operater.getLozinka())
                ? operater : null;
    }
    

    @Override
    public List<Operater> getPodaci() {
        return session.createQuery("from Operater").list();
    }
    
    public List<Operater> getPodaci(String uvjet) {
        return session.createQuery("from Operater k where concat(k.ime, ' ', k.prezime, ' ', k.oib) "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
        super.kontrolaCreate();
        kontrolaOibBazaKreiraj();
        kontrolaLozinka();
        kontrolaUloga();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        super.kontrolaUpdate();
        kontrolaOibBazaPromjeni();
        kontrolaLozinka();
        kontrolaUloga();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {
    }

    private void kontrolaLozinka() throws SkrbinaException {
        if (entitet.getLozinka().isEmpty()) {
            throw new SkrbinaException("Lozinka je obavezna, ne smije biti prazna!");
        }
        if (entitet.getLozinka() == null) {
            throw new SkrbinaException("Lozinka nije definirana!");
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
            throw new SkrbinaException("OIB je dodjeljen, unesite drugi OIB!");
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
            throw new SkrbinaException("OIB je dodjeljen, unesite drugi OIB!");
        }
    }
    
    private void kontrolaUloga() throws SkrbinaException {
        if(entitet.getUloga().isEmpty() || entitet.getUloga() == null) {
            throw new SkrbinaException("Morate unijetu ulogu: \"admin\" ili \"oper\".");
        }
        if (entitet.getUloga().equals("oper") == false && entitet.getUloga().equals("admin") == false) {            
            throw new SkrbinaException(entitet.getUloga() + " nije podržano. Uloge su: \"admin\" ili \"oper\".");
        }
    }
}
