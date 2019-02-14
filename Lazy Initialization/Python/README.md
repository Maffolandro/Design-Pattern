## STATO
- [x] Aggiungere funzione per lazy initialization;
  - Aggiunta variabile contenente i dati per l'inizializzazione;
  - Separato controllo inizializzazione da inizializzazione vera e propria
- [x] Richiamare la lazy initialization all'interno della funzione in cui è necessario;
  - [x] Aggiungere variabile privata per controllare inizializzazione;

#### Cons
- Occorre specificare la lazy initialization per ogni nuova funzione che richiede lo stato interno;

## TEST
- [x] Controllare stato prima e dopo l'inizializzazione;
- [x] Controllare tempi di esecuzione alla prima e alle successive chiamate;
