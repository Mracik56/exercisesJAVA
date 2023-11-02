//1. Napíšte program, tak aby ste získali od používateľa číslo a následne zistili
//či je kladné alebo záporné.
//Vstupné číslo testovacích údajov : 35
//Očakávaný výstup :
//Číslo je kladné

package Vetvenia;
import java.util.Scanner;
public class Uloha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadaj číslo: ");
        int cislo = scanner.nextInt();

        if (cislo > 0) {
            System.out.println("Číslo je kladné");
        } else if (cislo < 0) {
            System.out.println("Číslo je záporné");
        } else {
            System.out.println("Číslo je nula");
        }

        scanner.close();
    }
}
