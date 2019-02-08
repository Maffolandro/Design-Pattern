interface Component {
	public void operation();
}

public class Composite implements Component {
	private Component[] children = new Component[]();
	
	public void operation() {
		System.out.println("I'm a Composite!");
		for (Component child : children) {
			child.operation();
		}
	}
	
	public void addChild(Component child) {
		children.add(child);
	}
	
	public void removeChild(Component child) {
		if (child in children) {
			children.remove(child);
		}
	}
	
	public Component getChild(int n) {
		if (n < children.length()) {
			return children.get(n);
		}
	}
}


public class Leaf implements Component {
	public void operation() {
		System.out.println("I'm a Leaf!")
	}
}