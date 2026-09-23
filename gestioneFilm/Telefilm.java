import java.util.Arrays;

public class Telefilm {
    private String nomeFilm;
    private String genereTeleFilm;
    private boolean finito;
    private Stagione[] stagioni;

    public Telefilm() throws Exception {
        this("", "", false, new Stagione[0]);
    }

    public Telefilm(String nomeFilm, String genereTeleFilm, boolean finito, Stagione[] stagioni) throws Exception {
        setNomeFilm(nomeFilm);
        setGenereTeleFilm(genereTeleFilm);
        setFinito(finito);
        setStagioni(stagioni);
    }

    public String getNomeFilm() {
        return nomeFilm;
    }

    public void setNomeFilm(String nomeFilm) throws Exception {
        if (nomeFilm == null || nomeFilm.trim().isEmpty()) throw new IllegalArgumentException("Error: Il nome del film non può essere vuoto");
        this.nomeFilm = nomeFilm;
    }

    public String getGenereTeleFilm() {
        return genereTeleFilm;
    }

    public void setGenereTeleFilm(String genereTeleFilm) throws Exception {
        if (genereTeleFilm == null || genereTeleFilm.trim().isEmpty()) throw new IllegalArgumentException("Error: Il genere del telefilm non può essere vuoto");
        this.genereTeleFilm = genereTeleFilm;
    }

    public boolean isFinito() {
        return finito;
    }

    public void setFinito(boolean finito) throws Exception {
        this.finito = finito;
    }

    public Stagione[] getStagioni() {
        return stagioni;
    }

    public void setStagioni(Stagione[] stagioni) throws Exception {
        if (stagioni == null) throw new IllegalArgumentException("Error: L'array delle stagioni non può essere vuoto"); 
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
            for (Stagione s : stagioni) { // molto più comodo di indicizzare
                if (s.getNome().equalsIgnoreCase(nomeSceneggiatore)) {
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
                    swap(j, j + 1);
                }
            }
        }
    }

    public void swap(int i, int j) {
        if (stagioni == null || i < 0 || j < 0 || i >= stagioni.length || j >= stagioni.length) {
            throw new IndexOutOfBoundsException("Indice fuori dai limiti dell'array delle stagioni");
        }
        Stagione temp = stagioni[i];
        stagioni[i] = stagioni[j];
        stagioni[j] = temp;
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