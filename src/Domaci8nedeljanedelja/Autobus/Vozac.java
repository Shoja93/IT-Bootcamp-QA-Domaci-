package Domaci8nedeljanedelja.Autobus;

public class Vozac extends Covek{

    private String zvanje;

    public Vozac(String ime, String prezime) {
        super(ime, prezime);
        this.zvanje = "Sofer";
    }

    public Vozac() {
        this.zvanje = "Sofer";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append(" ").append(getPrezime());
        return sb.toString();
    }
}
