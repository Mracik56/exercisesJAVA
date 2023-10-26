//Napíšte program v jazyku Java, ktorý bude generovať náhodné údaje o úrode na farme. Program by mal generovať nasledujúce údaje:
//Počet plodín: od 1 do 100
//Typ plodiny: ovocie, zelenina alebo obilnina
//Úroda na jednu plodinu: od 0 do 100 kg
//
//Očakávaný výstup:
//Počet plodín: 50
//Typ plodiny: ovocie
//Úroda na jednu plodinu: 75.50 kg

package Zadania;
import java.util.Random;
public class FarmaV1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int pocetPlodin = rand.nextInt(100) + 1;

        String[] typyPlodin = {"ovocie", "zelenina", "obilnina"};
        String typPlodiny = typyPlodin[rand.nextInt(typyPlodin.length)];

        double urodaNaPlodinu = rand.nextDouble() * 100;

        String formatovanaUroda = String.format("%.2f", urodaNaPlodinu);

        System.out.println("Počet plodín: " + pocetPlodin);
        System.out.println("Typ plodiny: " + typPlodiny);
        System.out.println("Úroda na jednu plodinu: " + formatovanaUroda + " kg");
    }
}
