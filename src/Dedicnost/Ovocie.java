package Dedicnost;

public class Ovocie {
    private String nazov;
    private String farba;
    private int vaha;

    public Ovocie(String nazov, String farba, int vaha) {
        this.nazov = nazov;
        this.farba = farba;
        this.vaha = vaha;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public int getVaha() {
        return vaha;
    }

    public void setVaha(int vaha) {
        this.vaha = vaha;
    }
}
