public class GiocaNumeri {
    public static void main(String[] args) {
        System.out.println("=== INIZIO GIOCO ===");

        GestoreGioco gestore = new GestoreGioco();

        Giocatore g1 = new Giocatore("Mario", gestore);
        Giocatore g2 = new Giocatore("Bros", gestore);

        g1.start();
        g2.start();

        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.out.println("Errore durante l'attesa dei thread.");
            Thread.currentThread().interrupt();
        }

        System.out.println("=== FINE GIOCO ===");
    }
}
