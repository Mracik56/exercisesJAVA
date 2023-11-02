//3. Vezmite od používateľa tri čísla a vypíšte najväčšie číslo.
//Testovacie údaje
//Zadajte 1. číslo: 25
//Zadajte 2. číslo: 78
//Zadajte 3. číslo: 87
//Očakávaný výstup :
//Najväčšie číslo: 87

package Vetvenia;
import java.util.Scanner;
public class Uloha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte 1. číslo: ");
        double cislo1 = scanner.nextDouble();

        System.out.print("Zadajte 2. číslo: ");
        double cislo2 = scanner.nextDouble();

        System.out.print("Zadajte 3. číslo: ");
        double cislo3 = scanner.nextDouble();

        double nejvetsieCislo = cislo1;

        if (cislo2 > nejvetsieCislo) {
            nejvetsieCislo = cislo2;
        }

        if (cislo3 > nejvetsieCislo) {
            nejvetsieCislo = cislo3;
        }

        System.out.println("Najväčšie číslo: " + nejvetsieCislo);

        scanner.close();
    }
}
