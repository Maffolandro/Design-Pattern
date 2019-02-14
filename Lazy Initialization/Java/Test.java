import org.junit.*

public class Test {
  @Test
  void checkBeforeCall() {
    Husband mark = new Husband([]);
    assertFalse(mark.getStatus())
  }
  
  @Test
  void checkAfterCall() {
    Husband mark = new Husband(["something"]);
    mark.takeOutGarage();
    assertTrue(mark.getStatus());
  }
  
  @Test
  void checkTiming() {
    Husband mark = new Husband(["apple", "apple", "apple", "apple"])
    
    long initTime;
    
    for (int i=0; i < 4; i++) {
      long start = System.nanoTime();
      mark.takeOutGarbage();
      long end = System.nanoTime();
      if (i=0) {initTime = end-start}
      else {
        assertTrue((end-start) < initTime);
      }
    }
  }
}
