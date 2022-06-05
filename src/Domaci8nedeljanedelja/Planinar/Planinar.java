package Domaci8nedeljanedelja.Planinar;

public abstract class Planinar {

    private int id;
    private String ime;
    private String prezime;

    public Planinar(int id, String ime, String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public Planinar() {
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public abstract String stampaj();

    public abstract double clanarina();

    public abstract String uspesanUspon(Planina planina);

}
