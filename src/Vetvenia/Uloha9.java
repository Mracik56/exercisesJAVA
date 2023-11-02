//9. Napíšte program, ktorý získa od užívateľa rok a vypíšte, či je tento rok
//priestupný alebo nie. Rok je priestupný ak je deliteľný 4 ale nie 100. Rok je tiež
//priestupný ak je deliteľný 400.
//Zadanie testovacích údajov
//Zadaj rok: 2022
//Očakávaný výstup :
//Rok 2022 je priestupný rok

package Vetvenia;
import java.util.Scanner;
public class Uloha9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadaj rok: ");
        int rok = scanner.nextInt();

        if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
            System.out.println("Rok " + rok + " je priestupný rok");
        } else {
            System.out.println("Rok " + rok + " nie je priestupný rok");
        }

        scanner.close();

    }
}
