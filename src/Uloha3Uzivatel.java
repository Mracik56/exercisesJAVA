import java.util.Scanner;
public class Uloha3Uzivatel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte delenec: ");
        double delenec = scanner.nextDouble();

        System.out.println("Zadajte deliteľa: ");
        double delitel = scanner.nextDouble();

        scanner.close();

        double vysledok = delenec / delitel;
            System.out.println("Výsledok delenia je: " + vysledok);
    }
}
