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
