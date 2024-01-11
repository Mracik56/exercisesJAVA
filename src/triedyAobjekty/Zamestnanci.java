package triedyAobjekty;

public class Zamestnanci {
    public static void main(String[] args) {
        Zamestnanec s1 = new Zamestnanec(1,"Janko",1000.50F);
        Zamestnanec s2 = new Zamestnanec(2,"Marienka",500F);
        Zamestnanec s3 = new Zamestnanec(3,"Jozko",3500F);
       /* s1.inc_zam(1,"Janko",1000.50F);
        s2.inc_zam(2,"Marienka",500F);
        s3.inc_zam(3,"Jozko",3500F);*/
        s1.vypis();
        s2.vypis();
        s3.vypis();
    }
}
