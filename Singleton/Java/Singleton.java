public class Singleton {
	/* #### Metodi per la definizione del Singleton ####
	 * #### NON MODIFICARE ####
	 */
	private static Singleton instance = new Singleton(); // Istanza della classe
	
	// Fornire "costruttore alternativo" che genera l'istanza se non presente, poi la richiama
	public static synchronized getInstance(Object... args) {
		initialize(args);
		return instance;
	};
	
	// Prevenire chiamate esterne dal costruttore standard
	private Singleton() {};

	/* #### Fine metodi per la definizione del Singleton ####
	 * #### MODIFICABILE DA QUI IN POI ####
	 */
	
	// Definire initialize se il costruttore alternativo deve accettare parametri
	private static void initialize() {
		//
		//
	};
	
	// #### Inserire qui variabili e logica per il Singleton ####
	//
	//
}
