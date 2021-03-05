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
public class Transakcija extends Entitet {
    
    private Integer cijena;
    private char status;
    
    @OneToOne(mappedBy = "transakcija")
    private Djelo djelo;

    @OneToOne
    private Korisnik korisnik;
    
    public Integer getCijena() {
        return cijena;
    }

    public void setCijena(Integer cijena) {
        this.cijena = cijena;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    public Djelo getDjelo() {
        return djelo;
    }
    
    public void setDjelo(Djelo djelo) {
        this.djelo = djelo;
    }
    
    public Korisnik getKorisnik() {
        return korisnik;
    }
    
    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
}