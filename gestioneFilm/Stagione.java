public class Stagione {

    /*
     * numero di episodi;
     * nome dello sceneggiatore;
     * trama;
     * numero della stagione (se è la prima il numero è 1, se è la seconda il numero
      è 2...).
     */

    private int nEp;
    private String nome;
    private String trama;
    private int nStagione;

    public Stagione(int nep, String nome, String trama, int nstagione) {
        this.nEp = nep;
        this.nome = nome;
        this.trama = trama;
        this.nStagione = nstagione;
    }

    public Stagione() {
        this.nEp = 0;
        this.nome = "";
        this.trama = "";
        this.nStagione = 0;
    }

    public int getnEp() {
        return nEp;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTrama() {
        return trama;
    }

    public int getnStagione() {
        return this.nStagione;
    }

    public void setnEp(int nEp) {
        this.nEp = nEp;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    public void setnStagione(int nStagione) {
        this.nStagione = nStagione;
    }

    public void saluita(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Stagione [nEp=" + nEp + ", nome=" + nome + ", trama=" + trama + ", nStagione=" + nStagione + "]";
    }
}