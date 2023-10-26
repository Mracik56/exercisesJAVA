//13. Napíšte Java program na výpis plochy a obvodu obdĺžnika
//Údaje testu:
//Šírka = 5,5 Výška = 8,5
//Očakávaná výstupná
//plocha je 5,6 * 8,5 = 47,60
//Obvod je 2 * (5,6 + 8,5) = 28,20

import java.text.DecimalFormat;
public class Uloha13 {
    public static void main(String[] args) {
        double sirka = 5.5;
        double vyska = 8.5;

        double plocha = sirka * vyska;

        double obvod = 2 * (sirka + vyska);

        DecimalFormat df = new DecimalFormat("0.00");

        String formatovanaPlocha = df.format(plocha);
        String formatovanyObvod = df.format(obvod);

        System.out.println("Plocha je " + sirka + " * " + vyska + " = " + formatovanaPlocha);
        System.out.println("Obvod je 2 * (" + sirka + " + " + vyska + ") = " + formatovanyObvod);
    }
}
