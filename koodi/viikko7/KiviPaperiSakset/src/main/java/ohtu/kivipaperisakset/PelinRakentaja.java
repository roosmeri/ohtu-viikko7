package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.peliLogiikka.KPS;
import ohtu.kivipaperisakset.peliLogiikka.KPSParempiTekoaly;
import ohtu.kivipaperisakset.peliLogiikka.KPSPelaajaVsPelaaja;
import ohtu.kivipaperisakset.peliLogiikka.KPSTekoaly;

public class PelinRakentaja {

    public PelinRakentaja() {
    }

    public static KPS kaksinpeli() {
        return new KPSPelaajaVsPelaaja();
    }

    public static KPS yksinpeli() {
        return new KPSTekoaly();
    }

    public static KPS pahaYksinpeli() {
        return new KPSParempiTekoaly();
    }

}
