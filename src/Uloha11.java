//11. Napíšte Java program na výpočet a výpis plochy a obvodu kruhu.
//Testovacie údaje:
//Polomer = 7,5
//Očakávaný výstupný
//obvod je = 47,12388980384689
//Oblasť je = 176,71458676442586

import java.text.DecimalFormat;
public class Uloha11 {
    public static void main(String[] args) {
        double polomer = 7.5;

        double obvod = 2 * Math.PI * polomer;

        double plocha = Math.PI * polomer * polomer;

        DecimalFormat df = new DecimalFormat("0.###############");

        String formatovanyObvod = df.format(obvod);
        String formatovanaPlocha = df.format(plocha);

        System.out.println("Obvod je = " + formatovanyObvod);
        System.out.println("Oblasť je = " + formatovanaPlocha);
    }
}
