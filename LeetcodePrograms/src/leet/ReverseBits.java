package leet;

public class ReverseBits {

	public static void main(String[] args) {
		int n = 43261596;
		int rev = 0;
		int count = 0;
		while (count < 32) {
			rev = rev << 1;
			if (n != 0) {
				rev = (n & 1) | rev;
				n = n >> 1;
			}
			count++;
		}

		System.out.println(rev);

	}

}
