package leet;

import java.util.Set;
import java.util.TreeSet;

public class HappyNumber {

	public static void main(String[] args) {

		int n = 19;
		Set<Integer> set = new TreeSet<>();
		while (n > 9) {
			int num = n;
			int sum = 0;
			while (num > 0) {
				int digit = num % 10;
				sum = digit * digit + sum;
				num = num / 10;
				if (set.contains(sum))
					System.out.println("false");
				else {
					set.add(sum);
				}
			}
			n = sum;
		}

		if (n == 1 || n == 7)
			System.out.println("true");

		System.out.println("false");

	}

}
