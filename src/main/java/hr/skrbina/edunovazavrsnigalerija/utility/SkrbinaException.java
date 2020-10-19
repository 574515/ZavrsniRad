/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.utility;

/**
 *
 * @author Hrvoje
 */
public class SkrbinaException extends Exception{
    
    private String poruka;
    
    private String komponenta;

    public SkrbinaException(String poruka) {
        this.poruka=poruka;
        this.komponenta="";
    }
    
     public SkrbinaException(String komponenta, String poruka) {
        this(poruka);
        this.komponenta=komponenta;
    }

    public String getPoruka() {
        return poruka;
    }

    public String getKomponenta() {
        return komponenta;
    }

    public void setKomponenta(String komponenta) {
        this.komponenta = komponenta;
    }  
    
}