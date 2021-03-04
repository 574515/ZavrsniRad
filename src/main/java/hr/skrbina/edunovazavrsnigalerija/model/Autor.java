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
    private final List<Djelo> djela = new ArrayList<>();
    
    @OneToOne(mappedBy = "autor")
    private Djelo dj = new Djelo();
        
    public List<Djelo> getDjela() {
        return djela;
    }

    public void setDjelo(Djelo dj) {
        this.dj = dj;
    }
    
    public Djelo getDjelo() {
        return dj;
    }
    
    public void setDodajDjela(Djelo djelo) {
        this.djela.add(djelo);
    }    
    
    public void setMakniDjela(Djelo djelo) {
        this.djela.remove(djelo);
    }
}
