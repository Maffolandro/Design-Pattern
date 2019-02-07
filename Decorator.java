// Interfaccia per l'oggetto base
public interface Component() {
	// Metodo comune, da implementare
	void operation();
}

// Classe astratta per decoratore
public abstract class Decorator implements Component {
	protected Component parent;
	
	public Decorator(Component parent) {
		this.parent = parent;
	}
	
	// Metodo comune, ereditato
	public void operation() {
		parent.operation();
	}
}

// Applicazione di classe base
public class ConcreteComponent implements Component {
	@Override
	public void operation() {
		System.out.println("Sono la classe base");
	}
	
	// Aggiungere qui altri metodi per la classe base
}

// Applicazione di decoratore
public class ConcreteDecorator implements Decorator {
	// Non dimenticare il costruttore!
	public ConcreteDecorator(Component parent) {
		super(parent);
	}
	
	// Reimplementazione non necessaria 
	@Override
	public void operation() {
		System.out.println("Sono un decoratore. La classe che decoro diceva:");
		this.parent.operation();
	}
	
	// Aggiungere qui altri metodi per il decoratore
}