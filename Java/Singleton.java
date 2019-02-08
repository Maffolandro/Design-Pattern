public class Singleton {
	// Istanza di riferimento
	private static Singleton instance = null;
	
	// Funzione per ottenere l'istanza
	public static synchronized get_instance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	// Costruttore privato per impedire l'istanziazione diretta
	private Singleton() {};
}