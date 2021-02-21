/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.model;

/**
 *
 * @author Hrvoje
 */
public class Operater extends Osoba {

    private String lozinka;

    public static enum Uloga {
        Operater,
        Administrator
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @Override
    public String toString() {
        return getImePrezime() + " (" + getUloga() + ")";
    }
}
