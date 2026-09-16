import java.util.Arrays;

public class Telefilm {
 
 /*
 il nome del telefilm;
il genere del telefilm;
se la produzione del telefilm è in corso oppure è terminata;
l'insieme delle stagioni da cui è composto.
 */

    private String nomeFilm;
    private String genereTeleFilm;
    private boolean finito;
    private Stagione[] stagioni;

    // Costruttore della classe Telefilm
    public Telefilm(String nomeFilm, String genereTeleFilm, boolean finito, Stagione[] stagioni) {
        this.nomeFilm = nomeFilm;
        this.genereTeleFilm = genereTeleFilm;
        this.finito = finito;
        this.stagioni = stagioni;       
    }
    // costruttore default
    public Telefilm() { 
        this.nomeFilm = "";
        this.genereTeleFilm = "";
        this.finito = false;
        this.stagioni = new Stagione[0]; // Inizializza l'array delle stagioni come vuoto
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
