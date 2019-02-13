/* Class holding a number, which can get increased by (with addVal) or set to a specific value (during initialization).
 * Call getVal to get the value.
 */

public class SingletonCounter {
	/* #### Metodi per la definizione del Singleton ####
	 * #### NON MODIFICARE ####
	 */
	private static SingletonCounter instance = new SingletonCounter(); // Istanza della classe
	
	// Fornire "costruttore alternativo" che genera l'istanza se non presente, poi la richiama
	public static synchronized getInstance(Object... args) {
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
	
	// main per vedere il funzionamento della classe
	public static void main(String[] args) {
		System.out.println("Richiamo l'istanza passandole il valore 10.");
		SingletonCounter.getInstance(10);
		System.out.println("Aggiungo 10 al valore presente.");
		SingletonCounter.addval(10);
		System.out.println("Richiamo l'istanza (azzerandone implicitamente il valore).");
		SingletonCounter.getInstance();
		System.out.println("Aggiungo 15 al valore presente.");
		SingletonCounter.addval(15);
		System.out.println("Valore di Counter: " + SingletonCounter.getval());
	}

}

//////// TEST ////////

