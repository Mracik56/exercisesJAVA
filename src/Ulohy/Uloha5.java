package Ulohy;//5. Napíšte Java program, ktorý použije dve čísla ako vstup a zobrazí súčin dvoch čísel.
//Údaje testu:
//Zadajte prvé číslo: 25
//Zadajte druhé číslo: 5
//Očakávaný výstup :
//25 x 5 = 125

public class Uloha5 {
    public static void main(String[] args) {
        int cislo1 = 25;
        int cislo2 = 5;
        int vysledok = cislo1 * cislo2;

        System.out.println(cislo1 + " x " + cislo2 + " = " + vysledok);
    }
}
