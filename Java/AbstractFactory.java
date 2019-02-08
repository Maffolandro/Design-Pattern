interface AbstractFactory {
	public ProductA createProductA();
	public ProductB createProductB();
}

interface ProductA {
	public void greetings();
}

interface ProductB {
	public void audience();
}

//----------------------------

public class Client {
	
	private ProductA a;
	private ProductB b;
	
	public Client(ProductA a, ProductB b) {
		this.a = a;
		this.b = b;
	}
	
	public static void main(String[] args) {
		a.greetings();
		System.out.print(", ");
		b.audience();
		System.out.print("!");
	}
}

public class Hello implements ProductA {
	public void greetings() {
		System.out.print("Hello")
	}
}

public class World implements ProductB {
	public void audience() {
		System.out.print("World")
	}
}

public class ToMe implements ProductB {
	public void audience() {
		System.out.print("To me")
	}
}

public class HappyFactory implements AbstractFactory {
	public ProductA createProductA() {
		return new Hello();
	}
	
	public ProductB createProductB() {
		return new World();
	}
}

public class GrumpyFactory implements AbstractFactory {
	public ProductA createProductA() {
		return new Hello();
	}
	
	public ProductB createProductB() {
		return new ToMe();
	}
}