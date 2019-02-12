## STATO
- [ ] Prevenire l'istanziazione di più istanze;
  - [ ] Mantenere variabile statica "_instance" contenente l'eventuale istanza;
  - [ ] Sovrascrivere __new__(), se "_instance" è null creare un'istanza e memorizzarla in "_instance", poi restituire "_instance";
- [ ] Gestire parametri passati al costruttore;
  - [ ] Definire __init__() per impostare i valori di "_instance";

#### Cons
- Design Pattern non evidente
- ?Come funzionano eventuali sottoclassi?

## TEST
- [ ] Controllare l'esistenza di al più un'unica istanza;
- [ ] Controllare il comportamento con parametri;
- [ ] COntrollare ereditarietà;
