package Domaci8nedeljanedelja.Planinar;

public class GlavanKlasa {

    public static int ukupnaClanairna(Planinar[] niz){
        int suma = 0;
        for (int i = 0; i <niz.length ; i++) {
            suma += niz[i].clanarina();
        }
        return suma;
    }

    public static void main(String[] args) {
        Planina zlatibor = new Planina("Zlatibor", "Srbija", 4500);

        Planinar pl1 = new RekreativniPlaninar(1,"Nikola", "Sojic", 10,"Zlatiborski",3000);
        Planinar pl2 = new RekreativniPlaninar(2, "Marko", "Markovic", 15,"Jablanicki", 2000);
        Planinar pl3 = new RekreativniPlaninar(3, "Nemanja", "Nikolic",20,"Backi",1500 );

        Planinar pl4 = new Alpinista(4,"Dragan", "Draganovic", 10);
        Planinar pl5 = new Alpinista(5, "Milos", "Milosevic", 4);
        Planinar pl6 = new Alpinista(6,"Uros", "Urosevic", 3);

        Planinar [] niz = {pl1, pl2, pl3, pl4, pl5, pl6};

        for (int i = 0; i <niz.length ; i++) {
            System.out.println(niz[i]);
            System.out.println();
        }
        System.out.println("Ukupna zbir svih clanarina je: "+ ukupnaClanairna(niz));


    }
}
