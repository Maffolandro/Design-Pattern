import abc;

# Interfaccia per l'oggetto base
class Component(abc.ABC):
	# Metodo comune, da implementare
	# Si può instanziare ???
	# def __new__(self):
	# 	### controllo se sottoclasse o meno?
	# 	pass;
	@abc.abstractmethod
	def operation(self):
		pass


# Classe astratta per decoratore
class Decorator(Component):
	
	# Serve rendere astratto il costruttore per non renderla instanziabile?
	# @abc.abstractmethod
	# def __init__(self, parent):
	#	pass
	
	def __init__(self, parent):
		self._parent = parent;
	
	# Metodo comune, ereditato
	# Inutile ridefinirlo astratto?
	@abc.abstractmethod
	def operation(self):
		self._parent.operation();


# Applicazione di classe base
class ConcreteComponent(Component):
	def operation(self):
		print("Sono la classe base");
	
	# Aggiungere qui altri metodi per la classe base


# Applicazione di decoratore
class ConcreteDecorator(Decorator):
	# Non dimenticare il costruttore!
	def ConcreteDecorator(self, parent):
		super().__init__(parent);
	
	# Reimplementazione non necessaria 
	def operation(self):
		print("Sono un decoratore. La classe che decoro diceva:");
		self._parent.operation();
	
	# Aggiungere qui altri metodi per il decoratore
