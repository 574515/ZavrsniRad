/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.utility;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Hrvoje
 */
public class DatumIVrijeme {
    
    public static LocalDate generirajDatum() {
        // dohvaćam trenutno vrijeme
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        long minDay = LocalDate.of(1970, 1, 1).toEpochDay();
        // postavljam limit za korisnika na 18 godina (18+)
        long maxDay = LocalDate.of(year - 18, month, day).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        return randomDate;
    }

    public static Time generirajVrijeme() {
        final Random random = new Random();
        final int millisInDay = 24 * 60 * 60 * 1000;
        Time time = new Time((long) random.nextInt(millisInDay));
        return time;
    }
}
