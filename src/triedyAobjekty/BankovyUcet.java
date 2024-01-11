package triedyAobjekty;

public class BankovyUcet {
    private int cislo_u;
    private String meno;
    private float mnozstvo;


    public void naplnUcet(int cislo_u, String meno, float mnozstvo){
        this.cislo_u = cislo_u;
        this.meno = meno;
        this.mnozstvo = mnozstvo;

    }

    public void kontrolujZostatok(){
        System.out.print(cislo_u + " ");
        System.out.print(meno + " ");
        System.out.println(mnozstvo);
    }

    public void vloz(float ciastka){
        mnozstvo = mnozstvo + ciastka;
    }

    public void vyber(float ciastka2){
        if (ciastka2 > mnozstvo) {
            System.out.println("Chyba");
        }
        else {
            mnozstvo = mnozstvo - ciastka2;
        }

    }


    public int getCislo_u() {
        return cislo_u;
    }

    public String getMeno() {
        return meno;
    }

    public float getMnozstvo() {
        return mnozstvo;
    }
}
