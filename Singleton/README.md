Pattern per la creazione di una classe che può avere un'unica istanza.

****Pros
- Certezza della possibilità di creare al più un'unica istanza della classe;
- Possibilità di richiamare l'istanza globalmente;

****Cons
- Possono generare dipendenze nascoste se usati come variabili globali;

**JAVA
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

**PYTHON
- [ ] Prevenire l'istanziazione di più istanze;
  - [ ] Mantenere variabile statica "_instance" contenente l'eventuale istanza;
  - [ ] Sovrascrivere __new__(), se "_instance" è null creare un'istanza e memorizzarla in "_instance", poi restituire "_instance";
- [ ] Gestire parametri passati al costruttore;
  - [ ] Definire __init__() per impostare i valori di "_instance";

****Cons
- Design Pattern non evidente
- ?Come funzionano eventuali sottoclassi?
