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
public class Izlozba extends Entitet {
    
    private String datum_Pocetka;
    private String datum_Zavrsetka;
    private String tema;
    
    @OneToOne
    private Kustos kustos;

    public String getDatum_Pocetka() {
        return datum_Pocetka;
    }

    public void setDatum_Pocetka(String datum_Pocetka) {
        this.datum_Pocetka = datum_Pocetka;
    }

    public String getDatum_Zavrsetka() {
        return datum_Zavrsetka;
    }

    public void setDatum_Zavrsetka(String datum_Zavrsetka) {
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