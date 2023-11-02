//5. Napíšte program, ktorý načíta číslo od používateľa medzi 1 a 7 a zobrazí
//názov dňa v týždni.
//Testovacie údaje
//Vstupné číslo: 3
//Očakávaný výstup :
//Streda

package Vetvenia;
import java.util.Scanner;
public class Uloha5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vstupné číslo (1-7): ");
        int cislo = scanner.nextInt();

        String den = "";

        switch (cislo) {
            case 1:
                den = "Pondelok";
                break;
            case 2:
                den = "Utorok";
                break;
            case 3:
                den = "Streda";
                break;
            case 4:
                den = "Štvrtok";
                break;
            case 5:
                den = "Piatok";
                break;
            case 6:
                den = "Sobota";
                break;
            case 7:
                den = "Nedeľa";
                break;
            default:
                System.out.println("Neplatný vstup, zadejte číslo od 1 do 7.");
                break;
        }

        System.out.println(den);

        scanner.close();
    }
}
