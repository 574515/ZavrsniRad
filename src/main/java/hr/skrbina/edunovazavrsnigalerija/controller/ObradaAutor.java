/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Autor;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import java.util.List;

/**
 *
 * @author Hrvoje
 */
public class ObradaAutor extends ObradaOsoba<Autor> {
    
    public ObradaAutor() {
        super();
    }

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
        super.kontrolaCreate();
        kontrolaMjestoRodjenja();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        super.kontrolaUpdate();
        kontrolaMjestoRodjenja();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {
        kontrolaDjela();
    }

    @Override
    public List<Autor> getPodaci() {
        return session.createQuery("from Autor").list();
    }

    public List<Autor> getPodaci(String uvjet) {
        return session.createQuery("from Autor a "
              + " where concat(a.ime, ' ', a.prezime, ' ', a.oib) "
              + " like :uvjet ")
              .setParameter("uvjet", "%"+uvjet+"%")
              .setMaxResults(20)
              .list();
    }
    
    protected void kontrolaDjela() throws SkrbinaException {
        if(entitet.getDjela().size() > 0) {
            throw new SkrbinaException("Autor sa djelima se ne može obrisati!");
        }
    }
    
    protected void kontrolaMjestoRodjenja() throws SkrbinaException {
        if(entitet.getMjesto_Rodjenja() == null) {
            throw new SkrbinaException("Mjesto rođenja je obvezno, ne smije biti prazno!");
        }
        if (!entitet.getMjesto_Rodjenja().matches(("^[a-zA-ZÆÐƎƏƐƔĲŊŒẞÞǷȜæðǝəɛɣĳŋœĸſßþƿȝĄƁÇĐƊĘĦĮƘŁØƠŞȘŢȚŦŲƯY̨Ƴąɓçđɗęħįƙłøơşșţțŧųưy̨ƴÁÀÂÄǍĂĀÃÅǺĄÆǼǢƁĆĊĈČÇĎḌĐƊÐÉÈĖÊËĚĔĒĘẸƎƏƐĠĜǦĞĢƔáàâäǎăāãåǻąæǽǣɓćċĉčçďḍđɗðéèėêëěĕēęẹǝəɛġĝǧğģɣĤḤĦIÍÌİÎÏǏĬĪĨĮỊĲĴĶƘĹĻŁĽĿʼNŃN̈ŇÑŅŊÓÒÔÖǑŎŌÕŐỌØǾƠŒĥḥħıíìiîïǐĭīĩįịĳĵķƙĸĺļłľŀŉńn̈ňñņŋóòôöǒŏōõőọøǿơœŔŘŖŚŜŠŞȘṢẞŤŢṬŦÞÚÙÛÜǓŬŪŨŰŮŲỤƯẂẀŴẄǷÝỲŶŸȲỸƳŹŻŽẒŕřŗſśŝšşșṣßťţṭŧþúùûüǔŭūũűůųụưẃẁŵẅƿýỳŷÿȳỹƴźżžẓ\\s-,.\\']+$"))) {
            throw new SkrbinaException("Prezime nije ispravno! Dozvoljen je unos samo slova.");
        }
    }

}
