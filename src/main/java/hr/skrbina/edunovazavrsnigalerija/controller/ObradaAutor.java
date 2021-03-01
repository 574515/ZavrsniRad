/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Autor;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import java.util.List;

/**
 *
 * @author Hrvoje
 */
public class ObradaAutor extends ObradaOsoba<Autor> {

    public ObradaAutor() {
        super();
    }

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
    }

    @Override
    public List<Autor> getPodaci() {
        return session.createQuery("from Autor").list();
    }

    public List<Autor> getPodaci(String uvjet) {
        return session.createQuery("from Autor a where author(a.ime, ' '  , a.prezime, ' ', a.oib) "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }
}
