package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.peliLogiikka.KPSTekoaly;
import ohtu.kivipaperisakset.peliLogiikka.KPSPelaajaVsPelaaja;
import ohtu.kivipaperisakset.peliLogiikka.KPSParempiTekoaly;
import java.util.Scanner;
import ohtu.kivipaperisakset.peliLogiikka.KPS;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PelinRakentaja pr = new PelinRakentaja();

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetetaan");

            String vastaus = scanner.nextLine();
            System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            KPS peli = new KPS();
            if (vastaus.endsWith("a")) {
                peli = pr.kaksinpeli();
            } else if (vastaus.endsWith("b")) {
                peli = pr.yksinpeli();
            } else if (vastaus.endsWith("c")) {
                peli = pr.pahaYksinpeli();
            } else {
                break;
            }
            peli.pelaa();

        }

    }
}
