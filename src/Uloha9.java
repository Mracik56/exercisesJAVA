//9. Napíšte Java program, ktorý vypočíta zadané výrazy a vypíše výstup.
//Údaje testu:
//((25,5 * 3,5 - 3,5 * 3,5) / (40,5 - 4,5))
//Očakávaný výstup
//2,138888888888889

import java.text.DecimalFormat;
public class Uloha9 {
    public static void main(String[] args) {
        double vysledok = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

        DecimalFormat df = new DecimalFormat("0.###############");
        String formatovanyVysledok = df.format(vysledok);

        System.out.println(formatovanyVysledok);
    }
}
