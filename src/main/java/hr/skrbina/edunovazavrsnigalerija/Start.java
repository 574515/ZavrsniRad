/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija;

import hr.skrbina.edunovazavrsnigalerija.utility.HibernateUtil;
import hr.skrbina.edunovazavrsnigalerija.utility.PocetniInsert;
import hr.skrbina.edunovazavrsnigalerija.view.SplashScreen;

/**
 *
 * @author Hrvoje
 */
public class Start {

    public static void main(String[] args) {
        SplashScreen s = new SplashScreen();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        
        HibernateUtil.getSessionFactory().openSession();
        PocetniInsert.izvedi();
        PocetniInsert.adminOperater();
    }
}