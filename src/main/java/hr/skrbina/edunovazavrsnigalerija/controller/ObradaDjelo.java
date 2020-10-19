/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Djelo;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import java.util.List;

/**
 *
 * @author Hrvoje
 */
public class ObradaDjelo extends Obrada<Djelo>{
    
    public ObradaDjelo(Djelo djelo){
        super(djelo);
    }
    
    public ObradaDjelo(){
        super();
    }
    
    @Override
    public List<Djelo> getPodaci() {
       return session.createQuery("from Djelo").list();
    }

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
       kontrolaNaziv();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {
        
    }

    private void kontrolaNaziv() throws SkrbinaException {
       if (entitet.getNaziv() == null) {
            throw new SkrbinaException(" Naziv nije definiran! ");
        }
        if (entitet.getNaziv().isEmpty()) {
            throw new SkrbinaException(" Morate unijeti naziv! ");
        }
        if (entitet.getNaziv().length() > 50) {
            throw new SkrbinaException(" Naziv ne smije sadržavati više od 50 znakova. ");
        }
    } 
    
}