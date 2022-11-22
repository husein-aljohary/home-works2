import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private CalculatorExample2 c;
	@Before
	public void setUp() {
		
		c=new CalculatorExample2();
	}
	
	@Test
	public void testadd() {
		assertEquals(c.add(2, 1),3);
	}
	
	@Test
	public void testsubtract() {
		assertEquals(c.subtract(2, 1),1);
	}
	
	@Test
	public void testmultiply() {
		assertEquals(c.multiply(2, 5),10);
	}
	
	@Test
	public void testdivide() {
		assertEquals(c.divide(6, 3),2);
	}
	
	@Test
	public void testsummation() {
		assertEquals(c.summation(2),3);
	}
	
	@Test
	public void tesisPostive() {
		assertEquals(c.isPostive(1),true);
		assertEquals(c.isPostive(0),true);
		assertEquals(c.isPostive(-1),false);
	}
	
	@Test
	public void testcompare() {
		assertEquals(c.compare(2, 1),1);
		assertEquals(c.compare(1, 1),0);
		assertEquals(c.compare(1, 2),-1);
	}
	

}
