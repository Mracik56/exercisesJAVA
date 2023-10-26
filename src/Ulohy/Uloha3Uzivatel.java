package Ulohy;//3. Napíšte program Java na delenie čísla a vypísanie na obrazovku.
//Vytvorte variantu s načítaním údajov od užívateľa a variantu s pevne zadanými vstupmi.
//Údaje testu:
//50/3
//Očakávaný výstup :
//16

import java.util.Scanner;
public class Uloha3Uzivatel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte delenec: ");
        double delenec = scanner.nextDouble();

        System.out.println("Zadajte deliteľa: ");
        double delitel = scanner.nextDouble();

        scanner.close();

        double vysledok = delenec / delitel;
            System.out.println("Výsledok delenia je: " + vysledok);
    }
}
