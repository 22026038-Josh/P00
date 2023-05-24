import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 10;
		int b = 6;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		int expected = 16;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 10;
		int b = 6;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		int expected = 4;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testMultiply() {
		int a = 10;
		int b = 6;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		int expected = 60;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testDivide() {
		int a = 10;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		int expected = 5;
		assertEquals(expected,actual);
	}

}
