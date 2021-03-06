package main;

/**
 * @author kdussau
 *
 */
public class CalculatorImpl implements Calculator {

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
	        }
		boolean resEstNegatif = false;
		int res = 0;
		if ( a < 0) {
			resEstNegatif = !resEstNegatif;
			a = -a;
		}
		if ( b < 0) {
			resEstNegatif = !resEstNegatif;
			b = -b;
		}
		while (a > 0) {
		        a = substract(a, b);
			res++;
		}
		if (resEstNegatif) {
			res = -res;
	        }
		return res;
	}


	@Override
	public int add(int a, int b) {
		int res = a;
		if (b > 0) {
			while(b-- != 0) {
	                        res++;
	                }
	        }
		else if (b < 0) {
			while(b++ != 0) {
	                        res--;
	                }
	        }
		return res;
	}


	@Override
	public int substract(int a, int b) {
		int res = a - b;
		return res;
	}

}
