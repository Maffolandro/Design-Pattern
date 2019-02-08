class Lazy():
	def __init__(self, *data):
		self._data = data;
		self._initialized = False;

	def lazyInit(self):
		self.var = " ".join(self._data);
		self._initialized = True;
	
	def callMe(self):
		if not self._initialized:
			lazyInit();
		print(self.var);