import java.util.Arraylist;

public class Husband {
  
  //// NON MODIFICARE ////
  private boolean initialized = false;
  private Object[] data; // dati per l'inizializzazione dell'istanza
  
  // Costruttore, tiene in memoria i dati per l'inizializzazione
  public void Lazy(Object... args) {
    this.data = args;
  }
  
  private synchronized void callInit() {
    if !(this.initialized) {
      this.initialized = true;
      lazyInit(this.data);
    }
  }
  
  //// MODIFICARE DA QUI IN POI ////
  
  private ArrayList<String> trash;
  
  private void lazyInit(String[] objects) {
    trash = new ArrayList<>(objects);
  }
  
  public void takeOutTrash() {
    callInit();
    if (thrash.length() > 0) {
      System.out.println(trash.pop() + " thrown away.")
    }
    else {
      System.out.println("Already done!")
    }
  }
  
  // Only for testing purpose
  public String getStatus() {
    return this.initialized;
  }
}

public class Example {
  public static void main(String[] args) {
    Husband Mark = new Husband(["Bottle", "Bottle", "Pizza's leftover", "Diaper", "Tin", "Tin", "Rotten apple", "Plastic bag"])
    for (int i=0; i < 10; i++) {
      Husband.takeOutThrash();
    }
  }
}
