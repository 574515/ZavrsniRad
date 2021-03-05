/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Kustos;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import java.util.List;

/**
 *
 * @author Hrvoje
 */
public class ObradaKustos extends ObradaOsoba<Kustos> {

    public ObradaKustos() {
    }

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
        super.kontrolaCreate();
        kontrolaMjestoRodjenja();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        super.kontrolaUpdate();
        kontrolaMjestoRodjenja();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {
        kontrolaIzlozba();
    }

    @Override
    public List<Kustos> getPodaci() {
        return session.createQuery("from Kustos").list();
    }

    public List<Kustos> getPodaci(String uvjet) {
        return session.createQuery("from Kustos k where concat(k.ime, ' ', k.prezime, ' ', k.oib) "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }
    
    private void kontrolaIzlozba() throws SkrbinaException {
        if(entitet.getIzlozba() != null) {
            throw new SkrbinaException("Ne može se obrisati kustos sa izložbom!");
        }
    }
    
    protected void kontrolaMjestoRodjenja() throws SkrbinaException {
        if(entitet.getMjesto_Rodjenja() == null) {
            throw new SkrbinaException("Mjesto rođenja je obvezno, ne smije biti prazno!");
        }
    }
}