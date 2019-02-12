public class Singleton {
	private static Singleton instance = null; // Istanza della classe
	
	// Fornire "costruttore alternativo" che genera l'istanza se non presente, poi la richiama
	public static synchronized getInstance(Object... args) {
		if (instance == null) {
			instance = new Singleton();
		}
		initialize(args);
		return instance;
	};
	
	// Sovrascrivere se il costruttore alternativo deve accettare parametri
	private static void initialize() {
		//
		//
	};
	
	// Prevenire chiamate esterne dal costruttore standard
	private Singleton() {};
}
