public class GiocaNumeri {
    public static void main(String[] args) {
        System.out.println("=== INIZIO GIOCO ===");

        // Creo il gestore del gioco
        GestoreGioco gestore = new GestoreGioco();

        // Creo due giocatori, associandoli allo stesso gestore
        Giocatore g1 = new Giocatore("Mario", gestore);
        Giocatore g2 = new Giocatore("Bros", gestore);

        // Avvio i thread (non usare run() direttamente)
        g1.start();
        g2.start();

        // Attendo che i thread terminino
        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.out.println("Errore durante l'attesa dei thread.");
        }

        System.out.println("=== FINE GIOCO ===");
    }
}
