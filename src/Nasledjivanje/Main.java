package Nasledjivanje;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SastojakRecepta jaja = new SastojakRecepta("Jaje", 12.5, 10);
        SastojakRecepta mleko = new SastojakRecepta("Mleko", 1.5, 1000);
        SastojakRecepta sir = new SastojakRecepta("Margarin", 1.9, 200);
        SastojakRecepta brasno = new SastojakRecepta("Brasno", 0.075, 300);
        double c = brasno.ukupnaCena(brasno.getCenaSastojka(), brasno.getKolicinaSastojka());
        System.out.println(c);

        ArrayList<SastojakRecepta> sastojci = new ArrayList<>();
        sastojci.add(brasno);
        sastojci.add(mleko);
        sastojci.add(sir);
        sastojci.add(jaja);
        sastojci.remove(mleko);

        Recept torta = new Recept("Trota",4 ,sastojci);
        System.out.println(torta);
        System.out.println("------------------");

        SastojakRecepta spagete = new SastojakRecepta("Spagete", 15.4, 100);
        SastojakRecepta pavlaka = new SastojakRecepta("Pavlaka za kuvanje", 20.8, 2);
        SastojakRecepta beliLuk = new SastojakRecepta("Beli luk", 56,1);
        SastojakRecepta meso = new SastojakRecepta("Curece meso", 256.5, 0.5);
        SastojakRecepta maslac = new SastojakRecepta("Maslac", 78.9, 0.6);
        SastojakRecepta biber = new SastojakRecepta("Biber", 49.6, 2);
        SastojakRecepta so = new SastojakRecepta("So", 12, 5);

        ArrayList<SastojakRecepta> sastojci2 = new ArrayList<>();
        sastojci2.add(spagete);
        sastojci2.add(pavlaka);
        sastojci2.add(beliLuk);
        sastojci2.add(meso);
        sastojci2.add(maslac);
        sastojci2.add(jaja);
        sastojci2.add(biber);
        sastojci2.add(so);

        Recept rucak = new Recept("Spagete u belom sosu", 3,sastojci2);
        System.out.println(rucak);
        System.out.println("---------------");

        rucak.skaliran(rucak, 30);
        System.out.println(rucak);
        System.out.println("----------------------");

        Recept rucak1 = new Recept("Pasulj", 4,sastojci2);
        Recept rucak2 = new Recept("Gulas", 1,sastojci2);
        Recept rucak3 = new Recept("Riblja Corba", 3,sastojci2);
        Recept rucak4 = new Recept("Makarone", 2,sastojci2);

        ArrayList<Recept> lista = new ArrayList<>();
        lista.add(rucak);
        lista.add(rucak1);
        lista.add(rucak2);
        lista.add(rucak3);
        lista.add(rucak4);

    }
}
