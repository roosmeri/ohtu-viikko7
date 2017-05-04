package ohtu.kivipaperisakset.peliLogiikka;

import ohtu.kivipaperisakset.peliLogiikka.Tuomari;
import ohtu.kivipaperisakset.peliLogiikka.TekoalyParannettu;
import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPS {

    public void pelaa() {
        TekoalyParannettu tekoaly = new TekoalyParannettu(20);

        String ekanSiirto = ekanSiirto();
        String tokanSiirto;

        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            super.tuomariToimii(ekanSiirto, tokanSiirto);

            ekanSiirto = ekanSiirto();

            tokanSiirto = tekoaly.annaSiirto();
            System.out.println("Tietokone valitsi: " + tokanSiirto);
            tekoaly.asetaSiirto(ekanSiirto);

        }
        loppu();
    }

}
