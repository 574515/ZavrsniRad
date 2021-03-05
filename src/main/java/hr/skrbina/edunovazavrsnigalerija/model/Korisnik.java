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

/**
 *
 * @author Hrvoje
 */
@Entity
public class Korisnik extends Osoba {
    
    @OneToMany
    private List<Transakcija> transakcija = new ArrayList<>();
    
    public void setTransakcija(List<Transakcija> transakcija) {
        this.transakcija = transakcija;
    }
    
    public List<Transakcija> getTransakcija() {
        return transakcija;
    }
}
