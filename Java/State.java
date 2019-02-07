public class Context {
	private State state;
	
	public Context() {
		this.state = new DefaultState();
	}
	
	public void changeState(State state) {
		this.state = state;
	}
	
	public void behavior() {
		this.state.behavior();
	}
}

public abstract class State {
	public abstract void behavior();
	
}

public class DefaultState implements State {
	public void behavior() {
		System.out.println("Hello World!")
	}
}

public class CustomState implements State {
	private Integer data = 0;
	
	public void behavior() {
		if (data++ < 9) {
			System.out.print("Na ");
		}
		else {
			System.out.println("Thunder!");
			data = 0;
		}
	}
}