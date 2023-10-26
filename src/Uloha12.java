//12. Napíšte Java program, ktorý použije tri čísla ako vstup na výpočet a výpis priemeru čísel.

import java.util.Scanner;
public class Uloha12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte prvé číslo: ");
        double cislo1 = scanner.nextDouble();

        System.out.print("Zadajte druhé číslo: ");
        double cislo2 = scanner.nextDouble();

        System.out.print("Zadajte tretie číslo: ");
        double cislo3 = scanner.nextDouble();

        double priemer = (cislo1 + cislo2 + cislo3) / 3.0;

        System.out.println("Priemer čísel je: " + priemer);

        scanner.close();
    }
}
