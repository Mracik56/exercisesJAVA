import java.text.DecimalFormat;
public class Uloha10 {
    public static void main(String[] args) {
        double vysledok = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));

        // Formátovanie výsledku na 16 desatinných miest
        DecimalFormat df = new DecimalFormat("0.####################");
        String formatovanyVysledok = df.format(vysledok);

        System.out.println(formatovanyVysledok);
    }
}
