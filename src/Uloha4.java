//4. Napíšte program Java, ktorý vypíše výsledok nasledujúcich operácií.
//Testovacie údaje:
//a. -5 + 8 * 6
//b. (55+9) % 9
//c. 20 + -3*5 / 8
//d. 5 + 15 / 3 * 2 - 8 % 3
//Očakávaný výstup :
//43
//1
//19
//13

public class Uloha4 {
    public static void main(String[] args) {
        int a = -5 + 8 * 6;
        int b = (55+9) % 9;
        int c = 20 + -3*5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
