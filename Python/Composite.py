import abc

class Component(abc.ABC):
	@abc.abstractmethod
	def operation(self):
		pass;


class Composite(Component):
	def __init__(self):
		self._children = [];
	
	def operation(self):
		print("I'm a Composite!")
		for g in self._children:
			g.operation();
	
	def addChild(self, component):
		self._children.append(component);
	
	def removeChild(self, component):
		if component in self._children:
			self._children.remove(component);
	
	def getChild(self, n):
		if (n < self._children.length):
			return self._children[n];


class Leaf(Component):
	def operation(self):
		print("I'm a Leaf!");