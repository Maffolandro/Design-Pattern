/* Class holding a number, which can get increased by (with addVal) or set to a specific value (during initialization).
 * Call getVal to get the value.
 */

from DesignPatterns import Singleton

public class Counter extends Singleton {
	private static int val;
	
	private static void initialize(int amount) {
		val = amount;
	}
	
	private static void initialize() {
		val = 0;
	}
	
	public static void addVal(int amount) { 
		val += amount;
	}
	
	public static void getVal() {
		System.out.println(val);
	}
}

//////// TEST ////////

public class SingletonExample {
	public static void main(String[] args) {
		Counter.getInstance(10); // set to 10
		Counter.addval(10); // add 10
		Counter.getInstance(); // set to 0
		Counter.addval(15);  // add 15
		System.out.println("Valore di Counter: " + Counter.getval()); // Should be 15
	}
}
