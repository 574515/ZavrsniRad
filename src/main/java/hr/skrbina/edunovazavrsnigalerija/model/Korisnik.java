/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.model;

import javax.persistence.OneToOne;

/**
 *
 * @author Hrvoje
 */
public class Korisnik extends Entitet {
    
    private Integer kup_Djelo;
    private Integer prod_Djelo;
    
    @OneToOne
    private Transakcija trans;
    
    @OneToOne
    private Osoba osoba;

    public Integer getKup_Djelo() {
        return kup_Djelo;
    }

    public void setKup_Djelo(Integer kup_Djelo) {
        this.kup_Djelo = kup_Djelo;
    }

    public Integer getProd_Djelo() {
        return prod_Djelo;
    }

    public void setProd_Djelo(Integer prod_Djelo) {
        this.prod_Djelo = prod_Djelo;
    }

    public Transakcija getTrans() {
        return trans;
    }

    public void setTrans(Transakcija trans) {
        this.trans = trans;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
    
}