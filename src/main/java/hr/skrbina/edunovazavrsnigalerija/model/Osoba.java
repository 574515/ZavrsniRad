/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.model;

import javax.persistence.MappedSuperclass;
/**
 *
 * @author Hrvoje
 */
@MappedSuperclass
public class Osoba extends Entitet {
 
    private String ime;
    private String prezime;
    private String rodjendan;
    private String oib;
    private String mjesto_Rodjenja;
    private String IBAN;
    private String kontakt;
    private String ulogaGalerija;
    
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getRodjendan() {
        return rodjendan;
    }

    public void setRodjendan(String rodjendan) {
        this.rodjendan = rodjendan;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getMjesto_Rodjenja() {
        return mjesto_Rodjenja;
    }

    public void setMjesto_Rodjenja(String mjesto_Rodjenja) {
        this.mjesto_Rodjenja = mjesto_Rodjenja;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }
    
    public String getImePrezime() {
        return getIme() + " " + getPrezime();
    }
    
    public void setImePrezime(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
    
    public String getUlogaGalerija() {
        return ulogaGalerija;
    }
    
    public void setUlogaGalerija(String ulg) {
        this.ulogaGalerija = ulg;
    }
}