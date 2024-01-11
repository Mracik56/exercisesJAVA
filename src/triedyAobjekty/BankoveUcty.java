package triedyAobjekty;

public class BankoveUcty {
    public static void main(String[] args) {
        BankovyUcet u1 = new BankovyUcet();
        BankovyUcet u2 = new BankovyUcet();
        BankovyUcet u3 = new BankovyUcet();
        u1.naplnUcet(412954, "Janka", 1000);
        u2.naplnUcet(965256, "Marek", 2000);
        u3.naplnUcet(498466, "Pavol", 3000);

        u1.kontrolujZostatok();
        u2.kontrolujZostatok();
        u3.kontrolujZostatok();

        u2.vloz(300);
        u2.kontrolujZostatok();



    }
}
