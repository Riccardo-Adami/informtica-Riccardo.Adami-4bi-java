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

    public Stagione(int nep, String nome, String trama, int nstagione) throws Exception {
        this.nEp = setnEp(nep);
        this.nome = setNome(nome);
        this.trama = setTrama(trama);
        this.nStagione = setnStagione(nstagione);
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

    public void setnEp(int nEp) throws Exception {
        if (nEp <= 0) throw new IllegalArgumentException("Error: Il numero di episodi deve essere maggiore di 0");
        this.nEp = nEp;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Error: Il nome dello sceneggiatore non può essere vuoto");
        this.nome = nome;
    }

    public void setTrama(String trama) throws Exception {
        if (trama == null || trama.trim().isEmpty()) throw new IllegalArgumentException("Error: La trama non può essere vuota");
        this.trama = trama;
    }

    public void setnStagione(int nStagione) throws Exception {
        if (nStagione <= 0) throw new IllegalArgumentException("Error: Il numero della stagione deve essere maggiore di 0");
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