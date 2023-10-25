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
