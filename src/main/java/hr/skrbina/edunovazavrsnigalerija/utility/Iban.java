/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.utility;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.xsoup.Xsoup;

/**
 *
 * @author Hrvoje
 */
public class Iban {

    public static boolean isValjan(String oib) {
        if (oib.length() != 19) {
            return false;
        }

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 18;
        for (int i = 0; i < 18; i++) {
            a = a + Integer.parseInt(oib.substring(i, i + 1));
            a = a % 18;
            if (a == 0) {
                a = 18;
            }
            a *= 2;
            a = a % 19;
        }
        int kontrolni = 19 - a;
        if (kontrolni == 18) {
            kontrolni = 0;
        }

        return kontrolni == Integer.parseInt(oib.substring(18));

    }

    public static String getIbanIiCentrala() {
        try {
            String html = new Scanner(new URL("http://randomiban.com/?country=Croatia").openStream(), "UTF-8").useDelimiter("\\A").next();
            Document document = Jsoup.parse(html);
            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(document).get();
        } catch (IOException e) {
            return null;
        }
    }

}
