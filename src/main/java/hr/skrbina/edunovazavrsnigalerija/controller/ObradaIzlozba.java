/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Izlozba;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import java.util.List;

/**
 *
 * @author Hrvoje
 */
public class ObradaIzlozba extends Obrada<Izlozba> {

    public ObradaIzlozba(Izlozba izlozba) {
        super(izlozba);
    }

    public ObradaIzlozba() {
        super();
    }

    @Override
    public List<Izlozba> getPodaci() {
        return session.createQuery("from Izlozba").list();
    }

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
        kontrolaDatumPocetka();
        kontrolaDatumZavrsetka();
        kontrolaTema();
        kontrolaKustos();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        kontrolaDatumPocetka();
        kontrolaDatumZavrsetka();
        kontrolaTema();
        kontrolaKustos();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {
    }

    private void kontrolaDatumPocetka() throws SkrbinaException {
        if (entitet.getDatum_Pocetka() == null) {
            throw new SkrbinaException("Datum početka nije definiran! ");
        }
        if (entitet.getDatum_Pocetka().isEmpty()) {
            throw new SkrbinaException("Morate unijeti datum početka!");
        }
    }

    private void kontrolaDatumZavrsetka() throws SkrbinaException {
        if (entitet.getDatum_Pocetka() == null) {
            throw new SkrbinaException("Datum završetka nije definiran!");
        }
        if (entitet.getDatum_Pocetka().isEmpty()) {
            throw new SkrbinaException("Morate unijeti datum završetka!");
        }
    }

    private void kontrolaTema() throws SkrbinaException {
        if (entitet.getTema() == null) {
            throw new SkrbinaException("Tema nije definirana!");
        }
        if (entitet.getTema().isEmpty()) {
            throw new SkrbinaException("Morate unijeti temu!");
        }
    }

    private void kontrolaKustos() throws SkrbinaException {
        if (entitet.getKustos() == null) {
            throw new SkrbinaException("Kustos nije definiran / dodijeljen!");
        }
    }
}
