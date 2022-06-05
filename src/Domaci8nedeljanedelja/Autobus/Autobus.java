package Domaci8nedeljanedelja.Autobus;

import java.util.ArrayList;

public class Autobus {


    private String naziv;
    private Vozac vozac;
    private double cenaKarte;
    private ArrayList<Putnik> putnik;

    public Autobus(String naziv, Vozac vozac, double cenaKarte, ArrayList<Putnik> putnik) {
        this.naziv = naziv;
        this.vozac = vozac;
        this.cenaKarte = cenaKarte;
        this.putnik = putnik;
    }

    public Autobus() {
        this.putnik = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Vozac getVozac() {
        return vozac;
    }

    public void setVozac(Vozac vozac) {
        this.vozac = vozac;
    }

    public double getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(double cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    public ArrayList<Putnik> getPutnik() {
        return putnik;
    }

    public void setPutnik(ArrayList<Putnik> putnik) {
        this.putnik = putnik;
    }

    public void dodajPutnika(Putnik p){
        putnik.add(p);
    }

    public void dodajPutnika(int i, Putnik p){
        putnik.add(i, p);
    }

    public boolean daLiSuIsti(Putnik p, Putnik p1){
        if(p.getIme().equals(p1.getIme()) && p.getPrezime().equals(p1.getPrezime())
            && p.getNovac() == (p1.getNovac())){
            return true;
        }
        return false;
    }

    public void ukloniPutnika(Putnik p){
        for (Putnik p1 : putnik) {
             if(daLiSuIsti(p1, p)){
                 putnik.remove(p1);
             }
        }
    }

    public void ukloniPutnika(int i){
        if(i >= 0 && i <= putnik.size()){
            putnik.remove(i);
        }
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv: ").append(naziv).append("\n");
        sb.append("Vozac: ").append(vozac).append("\n");
        sb.append("Cena karte je: ").append(cenaKarte).append("\n");
        sb.append("Putnici : ").append(putnik).append("\n");
        return sb.toString();
    }
}
