//8. Napíšte program, ktorý používateľovi poskytne jeden znak z
//abecedy. Vypíšte samohlásku alebo spoluhlásku v závislosti od vstupu
//používateľa. Ak používateľský vstup nie je písmeno (medzi a, z alebo A, Z),
//alebo ide o reťazec s dĺžkou > 1, vypíšte chybové hlásenie.
//Testovacie údaje
//Zadajte písmeno abecedy: p
//Očakávaný výstup :
//Zadané písmeno je spoluhláskové

package Vetvenia;
import java.util.Scanner;
public class Uloha8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte písmeno abecedy: ");
        String vstup = scanner.next();

        if (vstup.length() != 1 || !Character.isLetter(vstup.charAt(0))) {
            System.out.println("Zadaný vstup není platné písmeno.");
        }
        else {
            char znak = Character.toLowerCase(vstup.charAt(0));

            if (znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u' || znak == 'á' || znak == 'é' || znak == 'í' || znak == 'ó' || znak == 'ú' || znak == 'ô' || znak == 'y' || znak == 'ý') {
                System.out.println("Zadané písmeno je samohláska");
            } else {
                System.out.println("Zadané písmeno je spoluhláska");
            }
        }

        scanner.close();
    }
}
