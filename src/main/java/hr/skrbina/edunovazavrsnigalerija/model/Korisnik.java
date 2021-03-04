/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Hrvoje
 */
@Entity
public class Korisnik extends Osoba {

    @OneToOne
    private Transakcija trans;

    @OneToMany
    private final List<Djelo> kup_Djela = new ArrayList<>();

    @OneToMany
    private final List<Djelo> prod_Djelo = new ArrayList<>();

    public List<Djelo> getKupDjela() {
        return kup_Djela;
    }
        
    public void setKupDjelo(Djelo djelo) {
        this.kup_Djela.add(djelo);
    }

    public void setProdDjelo(Djelo djelo) {
        this.prod_Djelo.add(djelo);
    }
    
    public List<Djelo> getProdDjela() {
        return prod_Djelo;
    }

    public Transakcija getTrans() {
        return trans;
    }

    public void setTrans(Transakcija trans) {
        this.trans = trans;
    }
}
