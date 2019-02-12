**Stato

- [x] Prevenire chiamate esterne dal costruttore standard (ogni chiamata genera un'istanza);
  - [x] Rendere privato il costruttore
- [x] Fornire "costruttore alternativo" che genera la prima istanza o, se già presente, la richiama;
  - [x] Mantenere variabile statica "instance" contenente l'eventuale istanza;
  - [x] Definire metodo getInstance() che richiama il costruttore memorizzando l'istanza su "instance" se "instance" è nulla, e che restituisce "instance";
- [x] Se il "costruttore alternativo" accetta parametri, gestirli direttamente li;
  - [x] Gestire parametri di getInstance() dopo la memorizzazione dell'istanza;

****Cons
- Occorre ricordarsi di non bypassare il costruttore alternativo con altri metodi;
- ?Come funzionano eventuali sottoclassi?

**Test
- [ ] Controllare che il costruttore standard non possa essere richiamato;
- [ ] Controllare comportamento costruttore alternativo;
  - [ ] Salvare due riferimenti e controllare che si riferiscano alla stessa istanza;
  - [ ] Controllare che non sia possibile modificare il riferimento all'istanza nella classe;
- [ ] Controllare gestione parametri;
  - [ ] Chiamare costruttore alternativo con parametri, verificare stato istanza;
  - [ ] Richiamare costruttore alternativo con parametri, verificare stato istanza;
- [ ] Controllare comportamento sottoclassi;
