package leet;

public class PowerOfThree {

	public boolean isPowerOfThree(int n) {
		int sum = 0;
		int dup = n;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return false;
	}

}
