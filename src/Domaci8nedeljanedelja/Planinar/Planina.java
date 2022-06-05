package Domaci8nedeljanedelja.Planinar;

public class Planina {

    private String ime;
    private String drzava;
    private int visina;

    public Planina(String ime, String drzava, int visina) {
        this.ime = ime;
        this.drzava = drzava;
        this.visina = visina;
    }

    public Planina() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }


}
