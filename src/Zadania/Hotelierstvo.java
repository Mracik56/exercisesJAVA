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

        System.out.print("Typ izby (jednolôžková/dvojlôžková/apartmán): ");
        String typIzby = scanner.nextLine();

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

        if (typIzby.equals("jednolôžková")) {
            cena = (cenaJED * pocetNoci) * pocetIzieb;
        }
        else if (typIzby.equals("dvojlôžková")) {
            cena = (cenaDVJ * pocetNoci) * pocetIzieb;
        }
        else if (typIzby.equals("apartmán")) {
            cena = (cenaAP * pocetNoci) * pocetIzieb;
        }
        else {
            System.out.print("Zadali ste zlý typ izby!!!");
        }


        System.out.println("Typ izby: " + typIzby);
        System.out.println("Počet izieb: " + pocetIzieb);
        System.out.println("Dátum príchodu: " + datumPrichodu);
        System.out.println("Dátum odchodu: " + datumOdchodu);
        System.out.println("Počet osôb: " + pocetOsob);
        System.out.println("Celková cena: " + cena);

        scanner.close();
    }
}
