public class GestoreGioco {
    private final int numeroVincente;

    public GestoreGioco() {
        // Numero vincente casuale tra 1 e 30
        this.numeroVincente = (int) (Math.random() * 30) + 1;
        System.out.println("[DEBUG] Numero vincente: " + numeroVincente);
    }

    public boolean verifica(String nomeGiocatore, int numeroScelto) {
        if (numeroScelto == numeroVincente) {
            System.out.println(nomeGiocatore + " ha indovinato il numero vincente: " + numeroVincente);
            return true;
        } else {
            System.out.println(nomeGiocatore + " ha scelto " + numeroScelto + " (sbagliato)");
            return false;
        }
    }

    public int getNumeroVincente() {
        return numeroVincente;
    }
}
