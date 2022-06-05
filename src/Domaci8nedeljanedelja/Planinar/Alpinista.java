package Domaci8nedeljanedelja.Planinar;

public class Alpinista extends Planinar {

    public int poena;

    public Alpinista(int id, String ime, String prezime, int poena) {
        super(id, ime, prezime);
        this.poena = poena;
    }


    public int getPoena() {
        return poena;
    }

    public void setPoena(int poena) {
        this.poena = poena;
    }

    @Override
    public String stampaj() {
        return null;
    }

    @Override
    public double clanarina() {
       return 1500 - (50 * getPoena());
    }

    @Override
    public String uspesanUspon(Planina planina) {
        if(planina.getVisina() <= 4000 ){
            return "Uspeo je da se popne";
        }
        return "Nije uspeo da se popne";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alpinista, id : ").append(getId()).append("\n");
        sb.append("ime: ").append(getIme()).append(" ").append(getPrezime()).append("\n");
        sb.append("Broj poena: ").append(getPoena()).append("\n");
        sb.append(uspesanUspon(new Planina()));
        return sb.toString();
    }
}
