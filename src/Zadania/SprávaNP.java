//Napíšte program v jazyku Java, ktorý bude simulovať správu národného parku. Program by mal spĺňať nasledujúce požiadavky:
//Užívateľ by mal byť schopný zadať údaje o národnom parku, vrátane názvu, rozlohy a počtu návštevníkov za rok.
//Program by mal simulovať návštevníkov národného parku, vypočítať a vypísať nasledujúce údaje:
//        Celkový počet návštevníkov za rok.
//        Počet návštevníkov podľa typu terénu krajiny (hory, údolia).
//        Priemerný počet návštevníkov na kilometer štvorcový.
//Vstupy:
//Názov národného parku: Slovenský Raj
//Rozloha národného parku (km2): 1200
//Počet návštevníkov za rok: 130000
//
//Očakávaný výstup:
//Názov národného parku: Slovenský Raj
//Rozloha národného parku: 1200 km2
//Počet návštevníkov za rok: 130000
//Počet návštevníkov podľa typu krajiny:
//  Hory: 97444
//  Údolia: 32556
//Priemerný počet návštevníkov na kilometer štvorcový: 108.0

package Zadania;
import java.util.Scanner;
public class SprávaNP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Názov národného parku: ");
        String nazovParku = scanner.nextLine();

        System.out.print("Rozloha národného parku (km2): ");
        double rozlohaParku = scanner.nextDouble();

        System.out.print("Počet návštevníkov za rok: ");
        int pocetNavstevnikov = scanner.nextInt();

        int pocetNavstevnikovHory = (int) (0.75 * pocetNavstevnikov);
        int pocetNavstevnikovUdolia = pocetNavstevnikov - pocetNavstevnikovHory;
        double priemerNavNaKm = pocetNavstevnikov / rozlohaParku;

        String formatpriemerN = String.format("%.2f", priemerNavNaKm);

        System.out.println("Názov národného parku: " + nazovParku);
        System.out.println("Rozloha národného parku: " + rozlohaParku + " km2");
        System.out.println("Počet návštevníkov za rok: " + pocetNavstevnikov);
        System.out.println("Počet návštevníkov podľa typu krajiny:");
        System.out.println("  Hory: " + pocetNavstevnikovHory);
        System.out.println("  Údolia: " + pocetNavstevnikovUdolia);
        System.out.println("Priemerný počet návštevníkov na kilometer štvorcový: " + formatpriemerN);

        scanner.close();
    }
}
