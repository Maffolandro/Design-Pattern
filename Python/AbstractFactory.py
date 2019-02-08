import abc;

### DEFINING INTERFACES ###

class AbstractFactory():
	@abc.abstractMethod
	def createProductA(self):
		pass;
	
	@abc.abstractMethod
	def createProductB(self):
		pass;

class ProductA():
	@abc.abstractMethod
	def greetings(self):
		pass;

class ProductB():
	@abc.abstractMethod
	def audience(self):
		pass;


#--------MAIN--------------

class Client():
	def __new__(self, a, b):
		self.a = a;
		self.b = b;
	
	#?????
	def main(self, String[] args) {
		a.greetings();
		print(", ");
		b.audience();
		print("!");

### PRODUCTS ###

class Hello(ProductA):
	def greetings(self):
		print("Hello");

class World(ProductB):
	def audience(self):
		print("World");

class ToMe(ProductB):
	def audience(self):
		print("To me");

### Factories ###

class HappyFactory(AbstractFactory):
	def createProductA(self):
		return Hello();
	
	def createProductB(self):
		return World();


class GrumpyFactory(AbstractFactory):
	def createProductA():
		return Hello();
	
	def createProductB():
		return ToMe();