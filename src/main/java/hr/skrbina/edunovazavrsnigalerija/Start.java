/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija;

import hr.skrbina.edunovazavrsnigalerija.utility.PocetniInsert;
import hr.skrbina.edunovazavrsnigalerija.view.SplashScreen;

/**
 *
 * @author Hrvoje
 */
public class Start {

    public static void main(String[] args) {
        SplashScreen ss = new SplashScreen();
        ss.setVisible(true);
        ss.setLocationRelativeTo(null);
        PocetniInsert.izvedi();
        PocetniInsert.adminOperater();
    }
}
