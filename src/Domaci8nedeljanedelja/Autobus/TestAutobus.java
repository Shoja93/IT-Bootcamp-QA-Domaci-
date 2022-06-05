package Domaci8nedeljanedelja.Autobus;

import Domaci8nedeljanedelja.Autobus.Autobus;
import Domaci8nedeljanedelja.Autobus.Covek;
import Domaci8nedeljanedelja.Autobus.Putnik;
import Domaci8nedeljanedelja.Autobus.Vozac;

import java.util.ArrayList;

public class TestAutobus {
    public static void main(String[] args) {
        Vozac vozac = new Vozac("Nikola", "Sojic");
        Putnik putnik = new Putnik("Dusan", "Markovic", 150);
        Putnik putnik2 = new Putnik("Marko", "Markovic", 200);

        ArrayList<Putnik> putnici = new ArrayList<>();
        putnici.add(putnik);
        putnici.add(putnik2);

        Autobus bus = new Autobus("Lasta", vozac, 120, putnici);

        System.out.println(bus);
    }
}
