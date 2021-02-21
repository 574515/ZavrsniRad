/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Osoba;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import hr.skrbina.edunovazavrsnigalerija.utility.Oib;
import java.util.List;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author Hrvoje
 * @param <T>
 */
public class ObradaOsoba<T extends Osoba> extends Obrada<T> {

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOib();
        kontrolaKontakt();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOib();
        kontrolaKontakt();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {
    }

    protected void kontrolaIme() throws SkrbinaException {
        if (entitet.getIme().isEmpty() || entitet.getIme() == null) {
            throw new SkrbinaException("Ime je obavezno, ne može biti prazno!");
        }
        if (!entitet.getIme().matches(("^[a-zA-ZÆÐƎƏƐƔĲŊŒẞÞǷȜæðǝəɛɣĳŋœĸſßþƿȝĄƁÇĐƊĘĦĮƘŁØƠŞȘŢȚŦŲƯY̨Ƴąɓçđɗęħįƙłøơşșţțŧųưy̨ƴÁÀÂÄǍĂĀÃÅǺĄÆǼǢƁĆĊĈČÇĎḌĐƊÐÉÈĖÊËĚĔĒĘẸƎƏƐĠĜǦĞĢƔáàâäǎăāãåǻąæǽǣɓćċĉčçďḍđɗðéèėêëěĕēęẹǝəɛġĝǧğģɣĤḤĦIÍÌİÎÏǏĬĪĨĮỊĲĴĶƘĹĻŁĽĿʼNŃN̈ŇÑŅŊÓÒÔÖǑŎŌÕŐỌØǾƠŒĥḥħıíìiîïǐĭīĩįịĳĵķƙĸĺļłľŀŉńn̈ňñņŋóòôöǒŏōõőọøǿơœŔŘŖŚŜŠŞȘṢẞŤŢṬŦÞÚÙÛÜǓŬŪŨŰŮŲỤƯẂẀŴẄǷÝỲŶŸȲỸƳŹŻŽẒŕřŗſśŝšşșṣßťţṭŧþúùûüǔŭūũűůųụưẃẁŵẅƿýỳŷÿȳỹƴźżžẓ\\s-,.\\']+$"))) {
            throw new SkrbinaException("Ime nije ispravno! Dozvoljen je unos samo slova.");
        }
    }

    protected void kontrolaPrezime() throws SkrbinaException {
        if (entitet.getPrezime().isEmpty() || entitet.getPrezime() == null) {
            throw new SkrbinaException("Prezime je obavezno, ne može biti prazno!");
        }
        if (!entitet.getPrezime().matches(("^[a-zA-ZÆÐƎƏƐƔĲŊŒẞÞǷȜæðǝəɛɣĳŋœĸſßþƿȝĄƁÇĐƊĘĦĮƘŁØƠŞȘŢȚŦŲƯY̨Ƴąɓçđɗęħįƙłøơşșţțŧųưy̨ƴÁÀÂÄǍĂĀÃÅǺĄÆǼǢƁĆĊĈČÇĎḌĐƊÐÉÈĖÊËĚĔĒĘẸƎƏƐĠĜǦĞĢƔáàâäǎăāãåǻąæǽǣɓćċĉčçďḍđɗðéèėêëěĕēęẹǝəɛġĝǧğģɣĤḤĦIÍÌİÎÏǏĬĪĨĮỊĲĴĶƘĹĻŁĽĿʼNŃN̈ŇÑŅŊÓÒÔÖǑŎŌÕŐỌØǾƠŒĥḥħıíìiîïǐĭīĩįịĳĵķƙĸĺļłľŀŉńn̈ňñņŋóòôöǒŏōõőọøǿơœŔŘŖŚŜŠŞȘṢẞŤŢṬŦÞÚÙÛÜǓŬŪŨŰŮŲỤƯẂẀŴẄǷÝỲŶŸȲỸƳŹŻŽẒŕřŗſśŝšşșṣßťţṭŧþúùûüǔŭūũűůųụưẃẁŵẅƿýỳŷÿȳỹƴźżžẓ\\s-,.\\']+$"))) {
            throw new SkrbinaException("Prezime nije ispravno! Dozvoljen je unos samo slova.");
        }
    }

    protected void kontrolaOib() throws SkrbinaException {
        if (entitet.getOib() == null) {
            throw new SkrbinaException("OIB ne može biti prazan!");
        } else if (!Oib.isValjan(entitet.getOib())) {
            throw new SkrbinaException("Neispravan unos OIB-a!");
        }
    }

    protected void kontrolaKontakt() throws SkrbinaException {
        if (entitet.getKontakt().isEmpty()) {
            throw new SkrbinaException("Email ne smije biti prazan!");
        }
        if (entitet.getKontakt().length() >= 50) {
            throw new SkrbinaException("Email je predugačak!");
        }
        try {
            InternetAddress emailAddr = new InternetAddress(entitet.getKontakt());
            emailAddr.validate();
        } catch (AddressException e) {
            throw new SkrbinaException("Email nije u ispravnom formatu!");
        }
    }

    @Override
    public List<T> getPodaci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
