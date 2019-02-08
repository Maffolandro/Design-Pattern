import java.util.ArrayList;

interface Component {
	public void operation();
}

class Composite implements Component {
	private ArrayList<Component> children = new ArrayList<Component>();
	
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


class Leaf implements Component {
	public void operation() {
		System.out.println("I'm a Leaf!")
	}
}