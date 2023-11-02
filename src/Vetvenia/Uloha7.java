//7. Napíšte program na zistenie počtu dní v mesiaci.
//Testovacie dáta
//Zadaj číslo mesiaca: 2
//Zadaj rok: 2022
//Očakávaný výstup :
//Február 2022 má 29 dní

package Vetvenia;
import java.util.Scanner;
public class Uloha7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadaj číslo mesiaca: ");
        int mesiac = scanner.nextInt();

        System.out.print("Zadaj rok: ");
        int rok = scanner.nextInt();

        String[] nazvyMesiacov = {"Január", "Február", "Marec", "Apríl", "Máj", "Jún", "Júl", "August", "September", "Október", "November", "December"
        };

        int pocetDni = 0;

        switch (mesiac) {
            case 1, 3, 5, 7, 8, 10, 12:
                pocetDni = 31;
                break;
            case 4, 6, 9, 11:
                pocetDni = 30;
                break;
            case 2:
                if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
                    pocetDni = 29;
                } else {
                    pocetDni = 28;
                }
                break;
            default:
                System.out.println("Neplatný mesiac.");
                break;
        }

        System.out.println(nazvyMesiacov[mesiac-1] + " " + rok + " má " + pocetDni + " dní");

        scanner.close();
    }
}
