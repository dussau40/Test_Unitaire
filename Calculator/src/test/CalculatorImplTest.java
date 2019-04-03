package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;
import main.CalculatorImpl;

class CalculatorImplTest {

	/*
	 * @Test
	public final void testMultiply() {
		fail("Not yet implemented"); // TODO
	}
	*/

	@Test
	public final void testDivide() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5; 
	        b  = 5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a et b positif");
	        }
		a = 0; 
	        b  = 5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a nul");
	        }
		a = -5; 
	        b  = 5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a negatif");
	        }
		a = 5; 
	        b  = -5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("b negatif");
	        }
		a = -5; 
	        b  = -5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a et b negatif");
	        }
	}


	@Test
	public final void testAdd() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5; 
	        b  = 5; 
	        res = a + b;
		assertTrue("a et b positif", calc.add(a, b) == res);
		a = 0; 
	        b  = 5; 
	        res = a + b;
		assertTrue("a nul", calc.add(a, b) == res);
		a = 5; 
	        b  = 0; 
	        res = a + b;
		assertTrue("b nul", calc.add(a, b) == res);
		a = 0; 
	        b  = 0; 
	        res = a + b;
		assertTrue("a et b nuls", calc.add(a, b) == res);
		a = -5; 
	        b  = 5; 
	        res = a+ b;
		assertTrue("a negatif", calc.add(a, b) == res);
		a = 5; 
	        b  = -5; 
	        res = a + b;
		assertTrue("b negatif", calc.add(a, b) == res);
		a = -5; 
	        b  = -5; 
	        res = a + b;
		assertTrue("a et b negatif", calc.add(a, b) == res);
	}




	@Test
	public final void testSubstract() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5; 
	        b  = 5; 
	        res = a - b;
		assertTrue("a et b positif", calc.substract(a, b) == res);
		a = 0; 
	        b  = 5; 
	        res = a - b;
		assertTrue("a nul", calc.substract(a, b) == res);
		a = 5; 
	        b  = 0; 
	        res = a - b;
		assertTrue("b nul", calc.substract(a, b) == res);
		a = 0; 
	        b  = 0; 
	        res = a - b;
		assertTrue("a et b nuls", calc.substract(a, b) == res);
		a = -5; 
	        b  = 5; 
	        res = a - b;
		assertTrue("a negatif", calc.substract(a, b) == res);
		a = 5; 
	        b  = -5; 
	        res = a - b;
		assertTrue("b negatif", calc.substract(a, b) == res);
		a = -5; 
	        b  = -5; 
	        res = a - b;
		assertTrue("a et b negatif", calc.substract(a, b) == res);
	}
	
/*
	@Test (expected = ArithmeticException.class)
	public final void testDivideByZero() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 0; b  = 0; res = 0;
		assertTrue("a et b nuls", calc.divide(a, b) == res);
		a = 5; b  = 0; res = 0;
		assertTrue("b nul", calc.divide(a, b) == res);
	}*/
}
