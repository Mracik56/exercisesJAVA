package Dedicnost;

public class TestOvocie {
    public static void main(String[] args) {
        Banan banan = new Banan("Banan", "žltá", 2, "Zrelý");
        Jablko jablko = new Jablko("Jablko", "červená", 3, "Gala");
        Pomaranc pomaranc = new Pomaranc("Pomaranč", "oranžová", 5, "Španielsko");

        System.out.println("Banan - Názov: " + banan.getNazov() + ", Farba: " + banan.getFarba() + ", Váha: " + banan.getVaha() + ", Zrelosť: " + banan.getZrelost());
        System.out.println("Jablko - Názov: " + jablko.getNazov() + ", Farba: " + jablko.getFarba() + ", Váha: " + jablko.getVaha() + ", Odroda: " + jablko.getOdroda());
        System.out.println("Pomaranč - Názov: " + pomaranc.getNazov() + ", Farba: " + pomaranc.getFarba() + ", Váha: " + pomaranc.getVaha() + ", Pôvod: " + pomaranc.getPovod());
    }
}
