/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.view;

import hr.skrbina.edunovazavrsnigalerija.model.Operater;

/**
 *
 * @author Hrvoje
 */
public class Aplikacija {

    public static final String NASLOV_APP = "Galerija Exclusive";
    public static Operater operater;

    public static boolean isAdmin() {
        if (operater == null || operater.getUloga() == null) {
            return false;
        }
        return operater.getUloga().equals("admin");
    }
}