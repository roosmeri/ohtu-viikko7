/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset.peliLogiikka;

import java.util.Scanner;

/**
 *
 * @author Viliina
 */
public class KPS {

    public final Tuomari tuomari = new Tuomari();
    public final Scanner scanner = new Scanner(System.in);
    public AI tekoaly;

    public String ekanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = scanner.nextLine();
        return ekanSiirto;
    }

    public void pelaa() {
    }

    public boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    public String tokanSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        String tokanSiirto = scanner.nextLine();
        return tokanSiirto;
    }

    public void loppu() {
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    public void tuomariToimii(String ekanSiirto, String tokanSiirto) {
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        System.out.println(tuomari);
        System.out.println();
    }

}
