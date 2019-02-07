class Context():
	_state = None;
	
	def __init__(self):
		self.state = DefaultState();
	
	def changeState(state):
		_state = state;
	
	def behavior():
		_state.behavior();
	

class State():
	@abs.abstractmethod
	def behavior(self):
		pass;


class DefaultState(State):
	def behavior(self):
		print("Hello World!");


class CustomState(State):
	_data = 0;
	
	def behavior(self):
		if (data++ < 9):
			print("Na");
		else:
			print("Thunder!\n");
			data = 0;
