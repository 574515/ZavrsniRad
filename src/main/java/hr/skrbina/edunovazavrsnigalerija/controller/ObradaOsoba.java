/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Osoba;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import hr.skrbina.edunovazavrsnigalerija.utility.Oib;

/**
 *
 * @author Hrvoje
 * @param <T>
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {

    @Override
    protected void kontrolaCreate() throws SkrbinaException {        
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOib();
        kontrolaKontakt();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {        
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOib();
        kontrolaKontakt();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {}

    protected void kontrolaIme() throws SkrbinaException {
        if (entitet.getIme() == null) {
            throw new SkrbinaException("Ime nije definirano!");
        }
        if (entitet.getIme().isEmpty()) {
            throw new SkrbinaException("Ime je obvezno, ne smije biti prazno!");
        }
    }

    protected void kontrolaPrezime() throws SkrbinaException {
        if (entitet.getPrezime() == null) {
            throw new SkrbinaException("Prezime nije definirano!");
        }
        if (entitet.getPrezime().isEmpty()) {
            throw new SkrbinaException("Prezime je obvezno, ne smije biti prazno!");
        }
    }

    protected void kontrolaOib() throws SkrbinaException {
        if (entitet.getOib() == null) {
            throw new SkrbinaException ("OIB ne smije biti prazan!");

        } else if (!Oib.isValjan(entitet.getOib())) {
            throw new SkrbinaException("Neispravan unos OIB-a!");
        }
    }

    protected void kontrolaKontakt() throws SkrbinaException {
        if (entitet.getKontakt().isEmpty()) {
            throw new SkrbinaException("Kontakt ne smije biti prazan!");
        }
        if (entitet.getKontakt().length() >= 100) {
            throw new SkrbinaException("Kontakt je predugačak!");
        }
    }
}
