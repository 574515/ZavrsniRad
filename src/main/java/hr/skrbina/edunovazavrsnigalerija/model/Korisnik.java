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
public class Korisnik extends Osoba {
    
    private String kup_Djelo;
    private String prod_Djelo;
    
    @OneToOne
    private Transakcija trans;
    
    public String getKup_Djelo() {
        return kup_Djelo;
    }

    public void setKup_Djelo(String kup_Djelo) {
        this.kup_Djelo = kup_Djelo;
    }

    public String getProd_Djelo() {
        return prod_Djelo;
    }

    public void setProd_Djelo(String prod_Djelo) {
        this.prod_Djelo = prod_Djelo;
    }

    public Transakcija getTrans() {
        return trans;
    }

    public void setTrans(Transakcija trans) {
        this.trans = trans;
    }    
}