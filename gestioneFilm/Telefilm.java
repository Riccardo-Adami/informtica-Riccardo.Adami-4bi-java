import java.util.Arrays;

public class Telefilm {
    private String nomeFilm;
    private String genereTeleFilm;
    private boolean finito;
    private Stagione[] stagioni;

    public Telefilm() {
        this.nomeFilm = "";
        this.genereTeleFilm = "";
        this.finito = false;
        this.stagioni = new Stagione[0];
    }

    public Telefilm(String nomeFilm, String genereTeleFilm, boolean finito, Stagione[] stagioni) {
        this.nomeFilm = nomeFilm;
        this.genereTeleFilm = genereTeleFilm;
        this.finito = finito;
        this.stagioni = stagioni;
    }

    public String getNomeFilm() {
        return nomeFilm;
    }

    public void setNomeFilm(String nomeFilm) {
        this.nomeFilm = nomeFilm;
    }

    public String getGenereTeleFilm() {
        return genereTeleFilm;
    }

    public void setGenereTeleFilm(String genereTeleFilm) {
        this.genereTeleFilm = genereTeleFilm;
    }

    public boolean isFinito() {
        return finito;
    }

    public void setFinito(boolean finito) {
        this.finito = finito;
    }

    public Stagione[] getStagioni() {
        return stagioni;
    }

    public void setStagioni(Stagione[] stagioni) {
        this.stagioni = stagioni;
    }

    public double mediaEpisodiPerStagione() {
        if (stagioni == null || stagioni.length == 0) {
            return 0.0;
        }

        int totaleEpisodi = 0;
        for (Stagione s : stagioni) {
            totaleEpisodi += s.getnEp();
        }
        return (double) totaleEpisodi / stagioni.length;
    }

    public boolean cercaSceneggiatore(String nomeSceneggiatore) {
        if (stagioni != null) {
            for (Stagione s : stagioni) {
                if (s.getNomeSceneggiatore().equalsIgnoreCase(nomeSceneggiatore)) {
                    return true;
                }
            }
        }
        return false;
    }

    // buuble sort
    public void ordinaStagioni() {
        if (stagioni == null) return;

        for (int i = 0; i < stagioni.length - 1; i++) {
            for (int j = 0; j < stagioni.length - 1 - i; j++) {
                if (stagioni[j].getnStagione() > stagioni[j + 1].getnStagione()) {
                    Stagione temp = stagioni[j];
                    stagioni[j] = stagioni[j + 1];
                    stagioni[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Telefilm{" +
                "nomeFilm='" + nomeFilm + '\'' +
                ", genereTeleFilm='" + genereTeleFilm + '\'' +
                ", finito=" + finito +
                ", stagioni=" + Arrays.toString(stagioni) +
                '}';
    }
}