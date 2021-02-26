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
    public ObradaIzlozba(Izlozba izlozba){
        super(izlozba);
    }
    
    public ObradaIzlozba(){
        super();
    }
    
    @Override
    public List<Izlozba> getPodaci() {
       return session.createQuery("from Izlozba").list();
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
       if (entitet.getDatum_Pocetka() == null) {
            throw new SkrbinaException("Datum početka nije definiran! ");
        }
        if (entitet.getDatum_Pocetka().isEmpty()) {
            throw new SkrbinaException(" Morate unijeti naziv! ");
        }
        if (entitet.getDatum_Pocetka().length() > 50) {
            throw new SkrbinaException(" Naziv ne smije sadržavati više od 50 znakova. ");
        }
    } 
}
