public class Giocatore extends Thread {
    private final String nome;
    private final GestoreGioco gestore;
    private static final Object lock = new Object(); // oggetto condiviso per la sincronizzazione

    public Giocatore(String nome, GestoreGioco gestore) {
        this.nome = nome;
        this.gestore = gestore;
    }

    public void comunica() {
        System.out.println("Sono il giocatore " + nome);
    }

    public void gioca() {
        synchronized (lock) {
            System.out.println(nome + " sta scegliendo un numero...");

            try {
                Thread.sleep(500); // piccola pausa per simulare il pensiero
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            int numeroScelto = (int) (Math.random() * 30) + 1;
            System.out.println(nome + " ha scelto il numero: " + numeroScelto);

            boolean haVinto = gestore.verifica(nome, numeroScelto);
            if (haVinto) {
                System.out.println(nome + " ha vinto la partita!");
            }
        }
    }

    @Override
    public void run() {
        comunica();
        gioca();
    }
}
