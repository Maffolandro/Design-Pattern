public class Lazy {
  private boolean initialized = false;
  private Object[] data;
  
  public void Lazy(Object... args) {
    this.data = args;
  }
  
  private void callInit() {
    if !initialized {
      initialized = true;
      lazyInit(this.data);
    }
  }
  
  private void lazyInit(Object... args) {
    // Gestire qui inizializzazione
  }
  
  public void wakeup() {
    callInit();
    System.out.println(this.initialized);
  }
}
