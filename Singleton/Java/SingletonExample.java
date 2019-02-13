/* Class holding a number, which can get increased by (with addVal) or set to a specific value (during initialization).
 * Call getVal to get the value.
 */

public class SingletonCounter {
	/* #### Metodi per la definizione del Singleton ####
	 * #### NON MODIFICARE ####
	 */
	private static Singleton instance = null; // Istanza della classe
	
	// Fornire "costruttore alternativo" che genera l'istanza se non presente, poi la richiama
	public static synchronized getInstance(Object... args) {
		if (instance == null) {
			instance = new Singleton();
		}
		initialize(args);
		return instance;
	};
	
	// Prevenire chiamate esterne dal costruttore standard
	private SingletonCounter() {};

	/* #### Fine metodi per la definizione del Singleton ####
	 */
	
	// Definire initialize se il costruttore alternativo deve accettare parametri
	private static void initialize() {
		val = amount;
	};
	
	// #### Inserire qui variabili e logica per il Singleton ####
	private static int val;
	
	private static void initialize() {
		val = 0;
	}
	
	public static void addVal(int amount) { 
		val += amount;
	}
	
	public static void getVal() {
		System.out.println(val);
	}
}

//////// TEST ////////

public class SingletonExample {
	public static void main(String[] args) {
		SingletonCounter.getInstance(10); // set to 10
		SingletonCounter.addval(10); // add 10
		SingletonCounter.getInstance(); // set to 0
		SingletonCounter.addval(15);  // add 15
		System.out.println("Valore di Counter: " + SingletonCounter.getval()); // Should be 15
	}
}
