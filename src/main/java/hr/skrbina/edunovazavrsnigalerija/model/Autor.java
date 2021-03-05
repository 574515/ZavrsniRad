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
public class Autor extends Osoba {

    @OneToMany(mappedBy = "autor")
    private List<Djelo> djela = new ArrayList<>();
        @OneToOne(mappedBy = "autor")
        private Djelo djelo = new Djelo();
    
    public List<Djelo> getDjela() {
        return djela;
    }

    public void setDjela(List<Djelo> djela) {
        this.djela = djela;
    }
    
    public Djelo getDjelo() {
        return djelo;
    }
    
    public void setDjelo(Djelo djelo) {
        this.djelo = djelo;
    }
}
