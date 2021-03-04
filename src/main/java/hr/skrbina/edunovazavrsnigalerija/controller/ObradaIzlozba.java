/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Izlozba;
import hr.skrbina.edunovazavrsnigalerija.model.Kustos;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import java.util.List;

/**
 *
 * @author Hrvoje
 */
public class ObradaIzlozba extends Obrada<Izlozba> {

    Kustos kus = new Kustos();
    
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
    
    public List<Izlozba> getPodaci(String uvjet) {
        return session.createQuery("from Izlozba i "
              + " where concat(i.naziv) "
              + " like :uvjet ")
              .setParameter("uvjet", "%"+uvjet+"%")
              .setMaxResults(20)
              .list();
    }

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
        kontrolaNaziv();
        kontrolaDatumPocetka();
        kontrolaDatumZavrsetka();
        kontrolaTema();
        kontrolaKustos();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        kontrolaNaziv();
        kontrolaDatumPocetka();
        kontrolaDatumZavrsetka();
        kontrolaTema();
        kontrolaKustos();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {
    }

    private void kontrolaNaziv() throws SkrbinaException {
        if (entitet.getNaziv().isEmpty()) {
            throw new SkrbinaException("Naziv nije postavljen!");
        }
        if (entitet.getNaziv() == null) {
            throw new SkrbinaException("Naziv nije definiran!");
        }
    }
    
    private void kontrolaDatumPocetka() throws SkrbinaException {
        if (entitet.getDatum_Pocetka() == null) {
            throw new SkrbinaException("Datum početka nije definiran!");
        }
        if (entitet.getDatum_Pocetka().isEmpty()) {
            throw new SkrbinaException("Datum početka ne smije biti prazan!");
        }
    }

    private void kontrolaDatumZavrsetka() throws SkrbinaException {
        if (entitet.getDatum_Zavrsetka()== null) {
            throw new SkrbinaException("Datum završetka nije definiran!");
        }
        if (entitet.getDatum_Zavrsetka().isEmpty()) {
            throw new SkrbinaException("Datum završetka ne smije biti prazan!");
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
        if (entitet.getKustos().getIzlozba() != null) {
            throw new SkrbinaException("Ne možete dodijeliti kustosu više od 1 izložbe.");
        }
    }
}
