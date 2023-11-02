//6. Napíšte program, ktorý načíta dve čísla s desatinnou čiarkou a otestuje, či
//sú rovnaké až na tri desatinné miesta.
//Testovacie údaje
//Zadaj 1. číslo: 25.586
//Zadaj 2. číslo: 25.589
//Očakávaný výstup :
//Sú odlišné

package Vetvenia;
import java.util.Scanner;
public class Uloha6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte 1. číslo: ");
        double cislo1 = scanner.nextDouble();

        System.out.print("Zadajte 2. číslo: ");
        double cislo2 = scanner.nextDouble();

        cislo1 = Math.round(cislo1 * 1000.0) / 1000.0;
        cislo2 = Math.round(cislo2 * 1000.0) / 1000.0;

        if (cislo1 == cislo2) {
            System.out.println("Sú rovnaké");
        } else {
            System.out.println("Sú odlišné");
        }

        scanner.close();
    }
}
