package Dedicnost;

public class Jablko extends Ovocie{
    private String odroda;

    public Jablko(String nazov, String farba, int vaha, String odroda) {
        super(nazov, farba, vaha);
        this.odroda = odroda;
    }

    public String getOdroda() {
        return odroda;
    }

    public void setOdroda(String odroda) {
        this.odroda = odroda;
    }
}
