public class Uloha6 {
    public static void main(String[] args) {
        int cislo1 = 125;
        int cislo2 = 24;

        int scitanie = cislo1 + cislo2;
        int nasobenie = cislo1 * cislo2;
        int odcitanie = cislo1 - cislo2;
        int delenie = cislo1 / cislo2;
        int modulo = cislo1 % cislo2;

        System.out.println(cislo1 + " + " + cislo2 + " = " + scitanie);
        System.out.println(cislo1 + " - " + cislo2 + " = " + odcitanie);
        System.out.println(cislo1 + " x " + cislo2 + " = " + nasobenie);
        System.out.println(cislo1 + " / " + cislo2 + " = " + delenie);
        System.out.println(cislo1 + " mod " + cislo2 + " = " + modulo);
    }
}
