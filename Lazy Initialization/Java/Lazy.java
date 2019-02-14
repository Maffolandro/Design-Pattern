public class Lazy {
  
  //// NON MODIFICARE ////
  private boolean initialized = false;
  private Object[] data; // dati per l'inizializzazione dell'istanza
  
  // Costruttore, tiene in memoria i dati per l'inizializzazione
  public void Lazy(Object... args) {
    this.data = args;
  }
  
  private void callInit() {
    if !(this.initialized) {
      this.initialized = true;
      lazyInit(this.data);
    }
  }
  
  //// MODIFICARE DA QUI IN POI ////
  
  // Inserire qui eventuali variabili
  
  private void lazyInit(Object... args) {
    // Gestire qui inizializzazione
  }
  
  public void wakeup() {
    callInit();
    // Inserire logica funzione
  }
}
