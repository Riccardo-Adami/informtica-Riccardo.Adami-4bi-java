import java.util.Scanner;

public class MainTelefilm {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci il nome del telefilm: ");
        String nome = tastiera.nextLine();

        System.out.print("Inserisci il genere del telefilm: ");
        String genere = tastiera.nextLine();

        System.out.print("La produzione è terminata? (true/false): ");
        boolean finito = tastiera.nextBoolean();

        System.out.print("Quante stagioni ha il telefilm? ");
        int numStagioni = tastiera.nextInt();
        tastiera.nextLine(); 

        Stagione[] stagioni = new Stagione[numStagioni];

        for (int i = 0; i < numStagioni; i++) {
            System.out.println("\nDati Stagione " + (i + 1));
            System.out.print("Numero stagione: ");
            int nStagione = tastiera.nextInt();

            System.out.print("Numero episodi: ");
            int nEp = tastiera.nextInt();
            tastiera.nextLine(); 

            System.out.print("Nome sceneggiatore: ");
            String sceneggiatore = tastiera.nextLine();

            System.out.print("Trama: ");
            String trama = tastiera.nextLine();

            stagioni[i] = new Stagione(nEp, sceneggiatore, trama, nStagione);
        }

        Telefilm t1 = new Telefilm(nome, genere, finito, stagioni);


        System.out.println("\nTELEFILM CREATO");
        System.out.println(t1.toString());


        System.out.println("\nMedia episodi per stagione: " + t1.mediaEpisodiPerStagione());

        System.out.print("\nInserisci il nome dello sceneggiatore da cercare: ");
        String cercaNome = tastiera.nextLine();
        if (t1.cercaSceneggiatore(cercaNome)) {
            System.out.println("Lo sceneggiatore " + cercaNome + " è presente");
        } else {
            System.out.println("Lo sceneggiatore " + cercaNome + " on è presente.");
        }

        CollezioneTelefilm collezione = new CollezioneTelefilm(5);
        collezione.aggiungiTelefilm(t1);

        tastiera.close();
    }
}