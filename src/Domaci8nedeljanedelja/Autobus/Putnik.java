package Domaci8nedeljanedelja.Autobus;

public class Putnik extends Vozac {

    private double novac;

    public Putnik(String ime, String prezime, double novac) {
        super(ime, prezime);
        this.novac = novac;
    }

    public double getNovac() {
        return novac;
    }

    public void setNovac(double novac) {
        this.novac = novac;
    }

    public void dodajNovac(double d){
        this.novac = novac + d;
    }

    public void oduzmiNovac(double d){
        this.novac = novac - d;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append(" ").append(getPrezime());
        return sb.toString();
    }
}
