import java.util.Scanner;

public class Giocatore extends Thread {
    private final String nome;
    private final GestoreGioco gestore;
    private static final Scanner input = new Scanner(System.in);

    public Giocatore(String nome, GestoreGioco gestore) {
        this.nome = nome;
        this.gestore = gestore;
    }

    public void comunica() {
        System.out.println("Sono il giocatore " + nome);
    }

    public void gioca() {
        System.out.print(nome + ", inserisci un numero: ");
        int numeroScelto = input.nextInt();

        boolean haVinto = gestore.verifica(nome, numeroScelto);
        if (haVinto) {
            System.out.println(nome + " ha vinto la partita!");
        }
    }

    @Override
    public void run() {
        comunica();
        gioca();
    }
}
