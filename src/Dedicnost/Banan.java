package Dedicnost;

public class Banan extends Ovocie {
    private String zrelost;

    public Banan(String nazov, String farba, int vaha, String zrelost) {
        super(nazov, farba, vaha);
        this.zrelost = zrelost;
    }

    public String getZrelost() {
        return zrelost;
    }

    public void setZrelost(String zrelost) {
        this.zrelost = zrelost;
    }
}
