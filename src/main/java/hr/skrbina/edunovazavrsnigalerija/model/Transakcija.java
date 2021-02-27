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
public class Transakcija extends Entitet {
    
    private Integer cijena;
    private String status;
    
    @OneToOne
    private String djelo;

    public Integer getCijena() {
        return cijena;
    }

    public void setCijena(Integer cijena) {
        this.cijena = cijena;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDjelo() {
        return djelo;
    }

    public void setDjelo(String djelo) {
        this.djelo = djelo;
    }    
}