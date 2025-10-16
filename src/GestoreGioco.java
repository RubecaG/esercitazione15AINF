public class GestoreGioco {
    private final int numeroVincente;

    public GestoreGioco() {
        // Numero da indovinare
        this.numeroVincente = 19;
    }

    // Metodo che controlla se il numero scelto è vincente
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



