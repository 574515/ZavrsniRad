/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.model.Osoba;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import hr.skrbina.edunovazavrsnigalerija.utility.Oib;

/**
 *
 * @author Hrvoje
 * @param <T>
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {

    @Override
    protected void kontrolaCreate() throws SkrbinaException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaRodjendan();
        kontrolaOib();
        kontrolaKontakt();
        kontrolUloge();
    }

    @Override
    protected void kontrolaUpdate() throws SkrbinaException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaRodjendan();
        kontrolaOib();
        kontrolaKontakt();
        kontrolUloge();
    }

    @Override
    protected void kontrolaDelete() throws SkrbinaException {}

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
    
    protected void kontrolaRodjendan() throws SkrbinaException {
        if (entitet.getRodjendan() == null) {
            throw new SkrbinaException("Datum rođenja ne smije biti prazan!");
        }
    }

    protected void kontrolaOib() throws SkrbinaException {
        if (entitet.getOib() == null) {
            throw new SkrbinaException ("OIB ne može biti prazan!");

        } else if (!Oib.isValjan(entitet.getOib())) {
            throw new SkrbinaException("Neispravan unos OIB-a!");
        }
    }

    protected void kontrolaKontakt() throws SkrbinaException {
        if (entitet.getKontakt().isEmpty()) {
            throw new SkrbinaException("Kontakt ne smije biti prazan!");
        }
        if (entitet.getKontakt().length() >= 100) {
            throw new SkrbinaException("Kontakt je predugačak!");
        }
    }
    
    protected void kontrolUloge() throws SkrbinaException {
        if (entitet.getUlogaGalerija().isEmpty()) {
            throw new SkrbinaException("Uloga mora biti postavljena");
        }
        if (!entitet.getUlogaGalerija().equals("autor") || !entitet.getUlogaGalerija().equals("korisnik") || !entitet.getUlogaGalerija().equals("kustos")) {
            throw new SkrbinaException("Nepoznata uloga. Dozvoljene uloge: \"autor\", \"korisnik\", \"kustos\".");
        }
    }
}
