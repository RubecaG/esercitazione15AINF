GIOCA NUMERI (Thread)
Questo progetto realizza un semplice gioco in Java basato sull’uso dei thread e della sincronizzazione.
Il programma simula due giocatori che tentano di indovinare un numero vincente generato casualmente dal sistema.
Lo scopo principale del progetto è prendere confidenza con l’esecuzione concorrente, la gestione dei thread e l’accesso controllato a risorse condivise.

Descrizione generale
All’avvio del programma viene creato un gestore di gioco che genera un numero casuale compreso tra 1 e 30. Questo numero rappresenta il numero vincente della partita e rimane invariato per tutta l’esecuzione.
Successivamente vengono creati due giocatori, ciascuno eseguito come thread separato. Ogni giocatore sceglie in modo casuale un numero e lo confronta con il numero vincente tramite il gestore del gioco.
Il programma termina dopo che entrambi i giocatori hanno effettuato il proprio tentativo.

Gestione dei thread
La classe Giocatore estende la classe Thread.
Ogni istanza rappresenta un giocatore indipendente che esegue il proprio codice in parallelo agli altri.
Per evitare problemi di concorrenza, l’accesso alla fase di gioco è protetto tramite un oggetto di lock condiviso. In questo modo solo un thread alla volta può scegliere il numero ed effettuare la verifica, garantendo un’esecuzione ordinata e senza conflitti.
È stata inserita una breve pausa durante la scelta del numero per simulare il tempo di “pensiero” del giocatore.

Struttura del programma
Il progetto è composto da tre classi principali:
GestoreGioco: si occupa di generare il numero vincente e di verificare i numeri scelti dai giocatori.


Giocatore: rappresenta un giocatore ed estende Thread, gestendo la logica di gioco in modo concorrente.


GiocaNumeri: contiene il metodo main ed è responsabile dell’avvio del gioco e della gestione dei thread.


