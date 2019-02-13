import org.junit.*

public class SingletonTest {
	@Test
	public void constructorNotCallable()  {
		assertThrows(new Singleton());
	}
	
	@Test
	public void NotAllowedParameters()  {
		assertThrows(Singleton.getInstance("Error"));
	}
	
	@Test
	public void singleInstance() {
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		assertTrue(a == b);
	}
	
	@Test
	public void instanceNotModifiable() {
		assertThrows(Singleton.instance = "Error");
	}
	
	@Test
	public void acceptInitialParameters() {
		SingletonCounter b = SingletonCounter.getInstance(10);
		assertEquals(b.getVal(), 10);
	}
	
	@Test
	public void acceptUpdatedParameters() {
		SingletonCounter a = SingletonCounter.getInstance();
		a.addVal(5);
		assertEquals(a.getVal(), 5);
		a = SingletonCounter.getInstance(15);
		assertEquals(a.getVal(), 15);
	}
}
