package Nasledjivanje;

public class Sastojak {

    private String nazivSastojka;
    private double cenaSastojka;

    public Sastojak(String nazivSastojka, double cenaSastojka) {
        this.nazivSastojka = nazivSastojka;
        this.cenaSastojka = cenaSastojka;
    }

    public Sastojak() {
        this.nazivSastojka = "";
        this.cenaSastojka = 0;
    }

    public Sastojak(String nazivSastojka) {

    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }

    public double getCenaSastojka() {
        return cenaSastojka;
    }

    public void setCenaSastojka(double cenaSastojka) {
        this.cenaSastojka = cenaSastojka;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nazivSastojka).append(" ");
        return sb.toString();
    }
}
