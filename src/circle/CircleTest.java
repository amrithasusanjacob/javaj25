package circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {
	// 1. Create a Junit file  - DONE
		// 2. Write test case in Junit file 
		// 3. Run yout test case
		// 4. See what passed & failed
		
		
		
		// @Test -> 
		// Tells Junit to run the function as a test case
		// & report back if the test case passed or failed
		@Test
		public void testConstructor() {
			circleprg c = new circleprg(5);
			
			double expectedRadius = 5;
			double actualRadius = c.getRadius();
			
			//	assertEquals(x,y,0.01);
			// x = expected output
			// y = actual output
			// 0.01 = just use 0.01
			// OPTION 1: WRite it like ths:
			// 		assertEquals(5, c.getRadius(), 0.01);	
			assertEquals(expectedRadius, actualRadius, 0.1);
			
		}
		
		@Test
		public void testAreaFunction() {
			circleprg c = new circleprg(5);
			assertEquals(78.5, c.getArea(), 0.1);
			
		}
		
		
		@Test
		public void testCircumFunction() {
			circleprg c = new circleprg(5);
			double expected = Math.PI*2*5;
			assertEquals(expected, c.getCircumference(), 0.01);
		}
		
		
		
		@Test
		public void testDiameterFunction() {
			circleprg c = new circleprg(5);
			assertEquals(10, c.getDiameter(), 0.1);
		}
		
}
