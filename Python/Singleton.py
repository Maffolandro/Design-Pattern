class Singleton():
	_instance = None; # Riferimento ad unica istanza della classe
	
	# Crea un nuovo oggetto solamente se non esiste ancora, restituisce sempre il valore di __instance
	def __new__(cls, *args, **kwargs):
		if not cls._instance:
			cls._instance = object.__new__(cls, *args, **kwargs);
		return cls._instance;