package ohtu.kivipaperisakset.peliLogiikka;

import ohtu.kivipaperisakset.peliLogiikka.Tuomari;
import ohtu.kivipaperisakset.peliLogiikka.Tekoaly;
import java.util.Scanner;

public class KPSTekoaly extends KPS{

    
    public void pelaa() {
        tekoaly = new Tekoaly();

        String ekanSiirto = super.ekanSiirto();
        String tokanSiirto;

        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);


        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomariToimii(ekanSiirto, tokanSiirto);

            ekanSiirto = super.ekanSiirto();

            tokanSiirto = tekoaly.annaSiirto();
            System.out.println("Tietokone valitsi: " + tokanSiirto);
            tekoaly.asetaSiirto(ekanSiirto);

        }

        loppu();
    }


}