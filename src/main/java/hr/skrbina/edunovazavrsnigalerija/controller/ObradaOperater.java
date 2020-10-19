/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Operater;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Hrvoje
 */
public class ObradaOperater extends Obrada <Operater>{

    public Operater autoriziraj(String email, char[] lozinka) {
        Operater operater = (Operater) session.createQuery(
                " from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();
        if (operater == null) {
            return null;
        }
        return BCrypt.checkpw(new String(lozinka), operater.getLozinka())
                ? operater : null;
    }
    
    @Override
    public List<Operater> getPodaci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
        kontrolaIme();
        kontrolaPrezime();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void kontrolaIme() throws SkrbinaException {
        if(entitet.getIme() == null){
            throw new SkrbinaException(" Ime nije definirano! ");
        }
        if(entitet.getIme().isEmpty()){
            throw new SkrbinaException(" Unesite ime! ");
        }
        if(entitet.getIme().length() > 50){
            throw new SkrbinaException(" Ime mora imati manje od 50 znakova! ");
        }
    }

    private void kontrolaPrezime() throws SkrbinaException {
        if(entitet.getPrezime() == null){
            throw new SkrbinaException(" Prezime nije definirano! ");
        }
        if(entitet.getPrezime().isEmpty()){
            throw new SkrbinaException(" Unesite prezime! ");
        }
        if(entitet.getPrezime().length() > 50){
            throw new SkrbinaException(" Prezime mora imati manje od 50 znakova! ");
        }
    }    
}