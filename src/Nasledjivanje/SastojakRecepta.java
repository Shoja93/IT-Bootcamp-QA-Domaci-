package Nasledjivanje;

public class SastojakRecepta extends Sastojak{

    private double kolicinaSastojka;

    public SastojakRecepta(String nazivSastojka, double cenaSastojka, double kolicinaSastojka) {
        super(nazivSastojka, cenaSastojka);
        this.kolicinaSastojka = kolicinaSastojka;
    }

    public SastojakRecepta() {

    }

    public double getKolicinaSastojka() {
        return kolicinaSastojka;
    }

    public void setKolicinaSastojka(double kolicinaSastojka) {
        this.kolicinaSastojka = kolicinaSastojka;
    }

    public double ukupnaCena(double cenaSastojka, double kolicinaSastojka){
        double x = cenaSastojka * kolicinaSastojka;
        return x;
    }
}
