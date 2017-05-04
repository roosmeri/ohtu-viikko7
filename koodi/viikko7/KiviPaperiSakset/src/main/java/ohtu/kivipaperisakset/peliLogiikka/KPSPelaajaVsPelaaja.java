package ohtu.kivipaperisakset.peliLogiikka;

import ohtu.kivipaperisakset.peliLogiikka.Tuomari;
import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPS {

    public void pelaa() {

        String ekanSiirto = super.ekanSiirto();
        String tokanSiirto = tokanSiirto();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            super.tuomariToimii(ekanSiirto, tokanSiirto);

            ekanSiirto = super.ekanSiirto();
            tokanSiirto = super.tokanSiirto();
        }
        loppu();
    }

}
