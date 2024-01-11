package triedyAobjekty;

public class Zamestnanec {
    private int ID;
    private String meno;
    private float vyplata;

    /*public void inc_zam(int ID, String meno, float vyplata) {
        this.ID = ID;
        this.meno = meno;
        this.vyplata = vyplata;

    }*/

    Zamestnanec(int i, String m, float v){
        ID = i;
        meno = m;
        vyplata = v;
    }

    public void vypis() {
        System.out.print(ID + " ");
        System.out.print(meno + " ");
        System.out.println(vyplata);
    }

    public int getID() {
        return ID;
    }

    public String getMeno() {
        return meno;
    }

    public float getVyplata() {
        return vyplata;
    }
}
