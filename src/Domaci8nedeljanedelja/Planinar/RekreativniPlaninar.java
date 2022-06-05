package Domaci8nedeljanedelja.Planinar;

public class RekreativniPlaninar extends Planinar {

    private int tezinaOpreme;
    private String okrug;
    private int maxUspon;

    public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme, String okrug, int maxUspon) {
        super(id, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maxUspon = maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

    public int otezanje(int maxUspon, int tezinaOpreme) {
        for (int i = 0; i <= tezinaOpreme; i++) {
            maxUspon -= i * 50;
        }
        return maxUspon;
    }

    @Override
    public String stampaj() {
        return null;
    }

    @Override
    public double clanarina() {
        return 1000.0;
    }

    @Override
    public String uspesanUspon(Planina planina) {
        if(otezanje(maxUspon, tezinaOpreme) > planina.getVisina() ){
            return "Uspeo je da se popne";
        }
            return "Nije uspeo da se popne";

    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
        sb.append("Rekreativac, id : ").append(getId()).append("\n");
        sb.append("\time: ").append(getIme()).append(" ").append(getPrezime()).append("\n");
        sb.append("Okrug: ").append(getOkrug()).append("\n");
        return sb.toString();
    }
}


