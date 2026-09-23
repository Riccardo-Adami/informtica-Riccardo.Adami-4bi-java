    public class CollezioneTelefilm {
    private Telefilm[] elenco;
    private int numTelefilm;

    public CollezioneTelefilm() throws Exception {
        this.elenco = new Telefilm[10];
        this.numTelefilm = 0;
    }

    public CollezioneTelefilm(int capacita) throws Exception {
        this.elenco = new Telefilm[capacita];
        this.numTelefilm = 0;
    }

    public Telefilm[] getElenco() {
        return elenco;
    }

    public void setElenco(Telefilm[] elenco) {
        this.elenco = elenco;
    }

    public int getNumTelefilm() {
        return numTelefilm;
    }

    // Aggiunge se c'è spazio
    public void aggiungiTelefilm(Telefilm t) throws Exception {
        if (numTelefilm < elenco.length) {
            elenco[numTelefilm] = t;
            numTelefilm++;
        } else {
            throw new Exception("Collezione piena");
        }
    }

    // ordina in base a nome 
    public void ordinaPerNome() {
        for (int i = 0; i < numTelefilm - 1; i++) {
            for (int j = 0; j < numTelefilm - 1 - i; j++) {
                if (elenco[j].getNomeFilm().compareToIgnoreCase(elenco[j + 1].getNomeFilm()) > 0) {
                    Telefilm temp = elenco[j];
                    elenco[j] = elenco[j + 1];
                    elenco[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        String risultato = "CollezioneTelefilm:\n";
        for (int i = 0; i < numTelefilm; i++) {
            risultato += "- " + elenco[i].toString() + "\n";
        }
        return risultato;
    }
}