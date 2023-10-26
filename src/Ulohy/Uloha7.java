package Ulohy;//7. Napíšte Java program, ktorý vezme číslo ako vstup a vypíše svoju tabuľku
//násobenia až do 10.
//Testovacie údaje:
//Zadajte číslo: 8
//Očakávaný výstup :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
// .
//8 x 10 = 80

import java.util.Scanner;

public class Uloha7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte číslo: ");
        int cislo = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int vysledok = cislo * i;
            System.out.println(cislo + " x " + i + " = " + vysledok);
        }

        scanner.close();
    }
}
