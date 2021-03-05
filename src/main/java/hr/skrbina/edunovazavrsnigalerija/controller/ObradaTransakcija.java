/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Transakcija;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import java.util.List;

/**
 *
 * @author Hrvoje
 */
public class ObradaTransakcija extends Obrada<Transakcija>  {
    
    public ObradaTransakcija(Transakcija transakcija){
        super(transakcija);
    }
    
    public ObradaTransakcija(){
        super();
    }

    @Override
    public List<Transakcija> getPodaci() {
        return session.createQuery("from Transakcija").list();
    }

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
        //kontrolaDjelo();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        //kontrolaDjelo();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {}
    
}
