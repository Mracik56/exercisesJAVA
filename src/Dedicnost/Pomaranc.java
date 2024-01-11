package Dedicnost;

public class Pomaranc extends Ovocie{
    private String povod;

    public Pomaranc(String nazov, String farba, int vaha, String povod) {
        super(nazov, farba, vaha);
        this.povod = povod;
    }

    public String getPovod() {
        return povod;
    }

    public void setPovod(String povod) {
        this.povod = povod;
    }
}
