/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija;

import hr.skrbina.edunovazavrsnigalerija.view.Autorizacija;
/*import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;*/

/**
 *
 * @author Hrvoje
 */
public class Start {

    public static void main(String[] args) {
        
       Autorizacija aut = new Autorizacija();
       aut.setLocationRelativeTo(null);
       aut.setVisible(true);        
    }
}