/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.utility;

import com.github.javafaker.Faker;
import hr.skrbina.edunovazavrsnigalerija.controller.ObradaOperater;
import hr.skrbina.edunovazavrsnigalerija.model.Autor;
import hr.skrbina.edunovazavrsnigalerija.model.Djelo;
import hr.skrbina.edunovazavrsnigalerija.model.Izlozba;
import hr.skrbina.edunovazavrsnigalerija.model.Korisnik;
import hr.skrbina.edunovazavrsnigalerija.model.Kustos;
import hr.skrbina.edunovazavrsnigalerija.model.Operater;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Hrvoje
 */
public class PocetniInsert {

    public static void izvedi() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Operater operater = new Operater();
        operater.setIme("Hrvoje");
        operater.setPrezime("Škrbina");
        operater.setUloga("oper");
        operater.setKontakt("hskrbina@egallery.hr");
        operater.setOib(Oib.getOibIiCentrala());
        operater.setLozinka(BCrypt.hashpw("t", BCrypt.gensalt()));

        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (SkrbinaException ex) {
        }

        Autor autor1 = kreirajAutora("Vincent", "van Gogh", "Zundert, Netherlands", "30 March 1853", "vvg@gallery.hr");
        Autor autor2 = kreirajAutora("Pablo", "Picasso", "Malaga, Spain", "25 October 1881", "pp@gallery.hr");
        Autor autor3 = kreirajAutora("Tiziano", "Vecelli / Vecellio", "Pieve di Cadore, Republic of Venice", "c.  1488/1490", "tizi@gallery.hr");
        Autor autor4 = kreirajAutora("Raffaello", "Sanzio da Urbino", "Urbino, Duchy of Urbino", "March 28 / April 6, 1483", "rsdu@gallery.hr");
        Autor autor5 = kreirajAutora("Michelangelo", "Merisi da Caravaggio", "Milan, Duchy of Milan, Spanish Empire", "29 September 1571", "mmdc@gallery.hr");

        Djelo poppyFlowers = kreirajDjelo("Poppy Flowers", "1887", "It was stolen from Cairo's Mohamed Mahmoud Khalil Museum in August 2010 and has yet to be "
                + "found.", 43488705.75, autor1);
        Djelo pigeon = kreirajDjelo("Le Pigeon aux Petits Pois", "1911", "The painting was one of five artworks stolen from the Musée d'Art Moderne de la Ville "
                + "de Paris on 20 May 2010. It has so far never been recovered and its location remains unknown.", 23000000.00, autor2);
        Djelo dAC = kreirajDjelo("Diana and Callisto", "1556–1559", "It portrays the moment in which the goddess Diana discovers that her"
                + " maid Callisto has become pregnant by Jupiter.", 51906839.36, autor3);
        Djelo georgeDragon = kreirajDjelo("St. George and the Dragon", "1505", "The saint wears the blue garter of the English Order of the Garter, reflecting the "
                + "award of this decoration in 1504 to Raphael's patron Guidobaldo da Montefeltro, Duke of Urbino, by King Henry VII of England.", -1.0, autor4);
        Djelo nativity = kreirajDjelo("Nativity with St. Francis and St. Lawrence", "1600", "It has been missing since 1969 when it was stolen from the Oratory of "
                + "Saint Lawrence in Palermo. Investigators believe the painting changed hands among the Sicilian Mafia in the decades following the robbery and may "
                + "still be hidden.", 19818416.19, autor5);

        /*List<Djelo> djela1 = new ArrayList<>();
        djela1.add(0, poppyFlowers);
        autor1.setDjela(djela1);

        List<Djelo> djela2 = new ArrayList<>();
        djela2.add(0, pigeon);
        autor2.setDjela(djela2);

        List<Djelo> djela3 = new ArrayList<>();
        djela3.add(0, dAC);
        autor3.setDjela(djela3);

        List<Djelo> djela4 = new ArrayList<>();
        djela4.add(0, georgeDragon);
        autor4.setDjela(djela4);

        List<Djelo> djela5 = new ArrayList<>();
        djela5.add(0, nativity);
        autor5.setDjela(djela5);
        
        ne razumijem na koji način postaviti da se updatea*/

        autor1.setDjelo(poppyFlowers);
        autor2.setDjelo(pigeon);
        autor3.setDjelo(dAC);
        autor4.setDjelo(georgeDragon);
        autor5.setDjelo(nativity);
        session.beginTransaction();
        session.save(poppyFlowers);
        session.save(pigeon);
        session.save(dAC);
        session.save(georgeDragon);
        session.save(nativity);
        session.save(autor1);
        session.save(autor2);
        session.save(autor3);
        session.save(autor4);
        session.save(autor5);
        session.save(operater);

        Faker faker = new Faker();

        Korisnik korisnik;
        List<Korisnik> prviKorisnici = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            korisnik = new Korisnik();
            korisnik.setIme(faker.name().firstName());
            korisnik.setPrezime(faker.name().lastName());
            korisnik.setMjesto_Rodjenja(faker.address().fullAddress());
            korisnik.setRodjendan(faker.date().birthday(18, 80).toString());
            korisnik.setKontakt(faker.phoneNumber().phoneNumber());
            korisnik.setOib(Oib.getOibIiCentrala());
            korisnik.setIBAN(Iban.getIbanIiCentrala());
            korisnik.setUlogaGalerija("korisnik");
            session.save(korisnik);
            prviKorisnici.add(korisnik);
        }

        session.getTransaction().commit();

        session.beginTransaction();
        Kustos kustos1 = kreirajKustos();
        Kustos kustos2 = kreirajKustos();
        Izlozba izlozba1 = kreirajIzlozba("Prva izložba", "22.03.2021.", "22.04.2021.", "First One", kustos1);
        Izlozba izlozba2 = kreirajIzlozba("Druga izložba", "02.06.2022.", "02.08.2022.", "Second One", kustos2);
        kustos1.setIzlozba(izlozba1);
        kustos2.setIzlozba(izlozba2);
        session.save(kustos1);
        session.save(kustos2);
        session.save(izlozba1);
        session.save(izlozba2);
        session.getTransaction().commit();
    }

    public static void adminOperater() {

        Operater operater = new Operater();
        operater.setIme("Exclusive");
        operater.setPrezime("Operater");
        operater.setUloga("oper");
        operater.setKontakt("oper@ge.hr");
        operater.setOib(Oib.getOibIiCentrala());
        operater.setLozinka(BCrypt.hashpw("e", BCrypt.gensalt()));

        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (SkrbinaException ex) {
        }

    }

    private static Djelo kreirajDjelo(String naziv, String datum, String opis, Double cijena, Autor autor) {
        Djelo djelo = new Djelo();
        djelo.setNaziv(naziv);
        djelo.setDatum(datum);
        djelo.setOpis(opis);
        djelo.setCijena(cijena);
        djelo.setAutor(autor);
        return djelo;
    }

    private static Autor kreirajAutora(String ime, String prezime, String mjestoRodenja, String rodjendan, String email) {
        Autor autor = new Autor();
        autor.setIme(ime);
        autor.setPrezime(prezime);
        autor.setMjesto_Rodjenja(mjestoRodenja);
        autor.setRodjendan(rodjendan);
        autor.setIBAN(Iban.getIbanIiCentrala());
        autor.setKontakt(email);
        autor.setOib(Oib.getOibIiCentrala());
        return autor;
    }

    private static Izlozba kreirajIzlozba(String naziv, String dp, String dz, String tema, Kustos kustos) {
        Izlozba izlozba = new Izlozba();
        izlozba.setNaziv(naziv);
        izlozba.setDatum_Pocetka(dp);
        izlozba.setDatum_Zavrsetka(dz);
        izlozba.setTema(tema);
        izlozba.setKustos(kustos);
        return izlozba;
    }

    private static Kustos kreirajKustos() {
        Faker faker = new Faker();
        Kustos kustos = new Kustos();
        kustos.setIme(faker.name().firstName());
        kustos.setPrezime(faker.name().lastName());
        kustos.setMjesto_Rodjenja(faker.address().fullAddress());
        kustos.setRodjendan(faker.date().birthday(30, 50).toString());
        kustos.setKontakt(faker.phoneNumber().phoneNumber());
        kustos.setOib(Oib.getOibIiCentrala());
        kustos.setIBAN(Iban.getIbanIiCentrala());
        return kustos;
    }
}
