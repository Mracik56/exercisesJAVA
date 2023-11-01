//Napíšte program v jazyku Java, ktorý bude simulovať jazdu automobilu. Program by mal spĺňať nasledujúce požiadavky:
//Vstupné údaje (zadá užívateľ):
//Značka automobilu: Škoda
//Model automobilu: Oktávia
//Spotreba litrov na 100 km: 6
//Objem nádrže (litre): 40
//Vzdialenosť cesty: 1000
//Očakávaný výstup:
//Značka automobilu: Škoda
//Model automobilu: Oktávia
//Spotreba: 6l/100 km
//Objem nádrže: 40 litrov
//Vzdialenosť cesty: 1000 kilometrov
//Celková spotreba paliva: 60.0 litrov
//Počet natankovaní: 2

package Zadania;
import java.util.Scanner;
public class Automobily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Značka automobilu: ");
        String znacka = scanner.nextLine();

        System.out.print("Model automobilu: ");
        String model = scanner.nextLine();

        System.out.print("Spotreba litrov na 100 km: ");
        double spotreba = scanner.nextDouble();

        System.out.print("Objem nádrže (litre): ");
        double objemNadrze = scanner.nextDouble();

        System.out.print("Vzdialenosť cesty (kilometre): ");
        double vzdialenostCesty = scanner.nextDouble();

        double celkovaSpotreba = (vzdialenostCesty / 100.0) * spotreba;

        int pocetTankovani = (int) Math.ceil(celkovaSpotreba / objemNadrze);

        System.out.println("Značka automobilu: " + znacka);
        System.out.println("Model automobilu: " + model);
        System.out.println("Spotreba: " + spotreba + "l/100 km");
        System.out.println("Objem nádrže: " + objemNadrze + " litrov");
        System.out.println("Vzdialenosť cesty: " + vzdialenostCesty + " kilometrov");
        System.out.println("Celková spotreba paliva: " + celkovaSpotreba + " litrov");
        System.out.println("Počet natankovaní: " + pocetTankovani);

        scanner.close();
    }
}
