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
public class Autor extends Osoba {

    @OneToOne(mappedBy = "autor")
    private Osoba osoba;

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
}
