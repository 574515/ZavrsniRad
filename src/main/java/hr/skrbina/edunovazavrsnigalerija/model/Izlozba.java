/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.model;

import java.util.Date;
import javax.persistence.OneToOne;

/**
 *
 * @author Hrvoje
 */
public class Izlozba extends Entitet {
    
    private Date datum_Pocetka;
    private Date datum_Zavrsetka;
    private String tema;
    
    @OneToOne
    private Kustos kustos;

    public Date getDatum_Pocetka() {
        return datum_Pocetka;
    }

    public void setDatum_Pocetka(Date datum_Pocetka) {
        this.datum_Pocetka = datum_Pocetka;
    }

    public Date getDatum_Zavrsetka() {
        return datum_Zavrsetka;
    }

    public void setDatum_Zavrsetka(Date datum_Zavrsetka) {
        this.datum_Zavrsetka = datum_Zavrsetka;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Kustos getKustos() {
        return kustos;
    }

    public void setKustos(Kustos kustos) {
        this.kustos = kustos;
    }
    
}