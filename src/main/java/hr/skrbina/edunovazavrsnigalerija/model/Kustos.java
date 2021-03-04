/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Hrvoje
 */
@Entity
public class Kustos extends Osoba {

    @OneToOne(mappedBy = "kustos")
    private Izlozba izlozba;
    
    public Izlozba getIzlozba() {
        return izlozba;
    }

    public void setIzlozba(Izlozba izlozba) {
        this.izlozba = izlozba;
    }    
}