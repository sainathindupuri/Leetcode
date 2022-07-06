package leet;

public class DivideTwoIntegers {

	int count = 0;

	public static void main(String[] args) {
		DivideTwoIntegers ob = new DivideTwoIntegers();
		int a = 10;
		int b = 3;
		ob.divide(Math.abs(a), Math.abs(b));

	}

	public void divide(int dividend, int divisor) {
		dividend = dividend - divisor;
		if (dividend < 0)
			return;
		count++;
		divide(dividend, divisor);

	}

}
