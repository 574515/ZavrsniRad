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
public class Autor extends Entitet {
    
    @OneToOne
    private Osoba autor;

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }
    
}