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
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T>{

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
     kontrolaIme();
     kontrolaOib();     
     //dođu sve ostale kontrole na razini osobe
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
       
    }

    protected void kontrolaOib() throws SkrbinaException{
     if(entitet.getOib()==null || entitet.getOib().isEmpty()){
         throw new SkrbinaException("OIB obavezno");
     }
    
     if(!Oib.isValjan(entitet.getOib())){
         throw new SkrbinaException("OIB nije valjan");
     }
    }

    protected void kontrolaIme() throws SkrbinaException{
       if(entitet.getIme()==null || entitet.getIme().trim().isEmpty()){
         throw new SkrbinaException("Ime obavezno");
     }
    }    
}