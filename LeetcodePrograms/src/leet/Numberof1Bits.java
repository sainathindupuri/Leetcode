package leet;

public class Numberof1Bits {

	public static void main(String[] args) {
		int n = 11;
		int bit = 0;
		int count = 0;
		int noOf1Bits = 0;
		while (count < 32) {
			if (n != 0) {
				bit = (n & 1);
				if (bit == 1)
					noOf1Bits++;
				n = n >> 1;
			}
			count++;
		}

		System.out.println(noOf1Bits);

	}

}
