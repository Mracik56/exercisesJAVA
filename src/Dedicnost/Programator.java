package Dedicnost;


class Programator extends Zamestnanec2 {
    int bonus = 300;
    public static void main(String args[]){
        Programator p = new Programator();
        System.out.println("Vyplata programatora je: "+p.vyplata);
        System.out.println("Bonus pre programatora je: "+p.bonus);
    }
}
