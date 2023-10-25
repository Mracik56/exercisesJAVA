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
