//Program by sa dal rozšíriť o funkciu, ktorá by počítala celkovú úrodu na farme. Táto funkcia by sa dala implementovať nasledovne:
//Očakávaný výstup:
//Počet plodín: 50
//Typ plodiny: ovocie
//Úroda na jednu plodinu: 75.50 kg
//Celková úroda: 3775 kg

package Zadania;
import java.util.Random;
public class FarmaV2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int pocetPlodin = rand.nextInt(100) + 1;

        String[] typyPlodin = {"ovocie", "zelenina", "obilnina"};
        String typPlodiny = typyPlodin[rand.nextInt(typyPlodin.length)];

        double urodaNaPlodinu = rand.nextDouble() * 100;

        double celkovaUroda = pocetPlodin * urodaNaPlodinu;

        String formatovanaUrodaNaPlodinu = String.format("%.2f", urodaNaPlodinu);
        String formatovanaCelkovaUroda = String.format("%.2f", celkovaUroda);

        System.out.println("Počet plodín: " + pocetPlodin);
        System.out.println("Typ plodiny: " + typPlodiny);
        System.out.println("Úroda na jednu plodinu: " + formatovanaUrodaNaPlodinu + " kg");
        System.out.println("Celková úroda: " + formatovanaCelkovaUroda + " kg");
    }
}
