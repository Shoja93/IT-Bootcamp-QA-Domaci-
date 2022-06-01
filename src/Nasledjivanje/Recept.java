package Nasledjivanje;

import java.util.ArrayList;

public class Recept extends SastojakRecepta {

    private String nazivRecepta;
    private int tezinaRecepta;
    private ArrayList<SastojakRecepta> sastojci;


    public Recept(String nazivRecepta, int tezinaRecepta, ArrayList<SastojakRecepta> sastojci) {
        super();
        this.nazivRecepta = nazivRecepta;
        this.tezinaRecepta = tezinaRecepta;
        if(sastojci == null)
            this.sastojci = new ArrayList<>();
        else
            this.sastojci = sastojci;
    }

    public Recept() {
        sastojci = new ArrayList<>();
    }

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        this.nazivRecepta = nazivRecepta;
    }

    public int getTezinaRecepta() {
        return tezinaRecepta;
    }

    public void setTezinaRecepta(int tezinaRecepta) {
        this.tezinaRecepta = tezinaRecepta;
    }

    public ArrayList<SastojakRecepta> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<SastojakRecepta> sastojci) {
        this.sastojci = sastojci;
    }

    public void dodajSastojak(SastojakRecepta s){
        sastojci.add(s);
    }

    public void dodajSastojak(SastojakRecepta s, int i){
        sastojci.add(i, s);
    }

    public String tezinaRecepta(int tezinaRecepta){
        if(tezinaRecepta < 1 || tezinaRecepta > 5){
            return "Pogresna vrednost za tezinu recepta.";
        }
        else if(tezinaRecepta == 1){
            return "Pocetni";
        }
        else if(tezinaRecepta == 2){
            return "Lak";
        }
        else if(tezinaRecepta == 3){
            return "Srednji";
        }
        else if(tezinaRecepta == 4){
            return "Tezak";
        }
        else{
            return "Majstorski";
        }
    }

    private boolean daLiSuIsti(SastojakRecepta s1, SastojakRecepta s2){
        if(s1.getNazivSastojka().equals(s2.getNazivSastojka())){
            return true;
        }
        else {
            return false;
        }
    }

    public void ukloniSastojak(SastojakRecepta sastojak){
        for (SastojakRecepta s : sastojci) {
            if (daLiSuIsti(s,sastojak)){
                sastojci.remove(s);
                return;
            }
        }
    }

    public double ukupanaCenaRecepta(){
        double suma = 0;
        for (SastojakRecepta s : sastojci) {
            suma += ukupnaCena(s.getCenaSastojka(),s.getKolicinaSastojka());
        }
        return suma;
    }

    public Recept skaliran(Recept rec, double x){
        double d;
        for (SastojakRecepta s: sastojci ) {
           d = s.getKolicinaSastojka() - (s.getKolicinaSastojka() * (x / 100));
           s.setKolicinaSastojka(d);
        }
        return rec;
    }

    public static ArrayList<Recept> filtrifajRecepte(ArrayList<Recept> recepti, int tezinarecepta){
        ArrayList<Recept> noviRecept = new ArrayList<>();
        for (Recept s : recepti) {
            if(s.getTezinaRecepta() == tezinarecepta){
                noviRecept.add(s);
            }
        }
        return noviRecept;
    }

    public static ArrayList<Recept> filtrifajRecepte(ArrayList<Recept> recepti, int[] tezinarecepta){
        ArrayList<Recept> noviRecept = new ArrayList<>();
        for (Recept s : recepti) {
            for (int i = 0; i < tezinarecepta.length ; i++) {
                if(s.getTezinaRecepta() == tezinarecepta[i]){
                    noviRecept.add(s);
                }
            }
        }
        return noviRecept;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nazivRecepta).append("\n");
        sb.append("Tezina: ").append(tezinaRecepta(tezinaRecepta)).append(" nivo").append("\n");
        sb.append("Sastojci: ").append(getSastojci()).append("\n");
        sb.append(ukupanaCenaRecepta()).append("\n");
        return sb.toString();
    }


}
