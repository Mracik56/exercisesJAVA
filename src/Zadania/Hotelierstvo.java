//Napíšte program v jazyku Java, ktorý bude simulovať rezerváciu izby v hoteli. Program by mal spĺňať nasledujúce požiadavky:
//Užívateľ by mal byť schopný zadať údaje o rezervácii, vrátane typu izby, počtu izieb, dátumu príchodu a odchodu a počtu osôb.
//Program by mal vypočítať celkovú cenu rezervácie.
//Program by mal vytlačiť potvrdenie rezervácie.
//Výstup:
//Typ izby: jednolôžková
//Počet izieb: 1
//Dátum príchodu: 2023-10-12
//Dátum odchodu: 2023-10-14
//Počet osôb: 1
//Celková cena: 150

package Zadania;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Hotelierstvo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cenaJED = 50;
        double cenaDVJ = 75;
        double cenaAP = 100;
        double cena = 0;
        double celkovaCena = 0;
        boolean pokracovat = false;


        System.out.print("Počet izieb: ");
        int pocetIzieb = scanner.nextInt();

        System.out.print("Dátum príchodu (yyyy-MM-dd): ");
        String datumPrichoduStr = scanner.next();
        LocalDate datumPrichodu = LocalDate.parse(datumPrichoduStr);

        System.out.print("Dátum odchodu (yyyy-MM-dd): ");
        String datumOdchoduStr = scanner.next();
        LocalDate datumOdchodu = LocalDate.parse(datumOdchoduStr);

        System.out.print("Počet osôb: ");
        int pocetOsob = scanner.nextInt();

        long pocetNoci = ChronoUnit.DAYS.between(datumPrichodu, datumOdchodu);


        String typIzby = null;
        for (int i = 1; i <= pocetIzieb; i++) {
            System.out.print("Typ izby (jednolôžková/dvojlôžková/apartmán): ");
            typIzby = scanner.nextLine();

            while (pokracovat == false) {

                if (typIzby.equals("jednolôžková")) {
                    cena = cenaJED * pocetNoci;
                    pokracovat = true;
                } else if (typIzby.equals("dvojlôžková")) {
                    cena = cenaDVJ * pocetNoci;
                    pokracovat = true;
                } else if (typIzby.equals("apartmán")) {
                    cena = cenaAP * pocetNoci;
                    pokracovat = true;
                } else {
                    System.out.print("Zadali ste zlý typ izby!!!");
                }
            }
            pokracovat = false;
            celkovaCena = celkovaCena + cena;
        }


        System.out.println("Typ izby: " + typIzby);
        System.out.println("Počet izieb: " + pocetIzieb);
        System.out.println("Dátum príchodu: " + datumPrichodu);
        System.out.println("Dátum odchodu: " + datumOdchodu);
        System.out.println("Počet osôb: " + pocetOsob);
        System.out.println("Celková cena: " + celkovaCena);

        scanner.close();
    }
}
