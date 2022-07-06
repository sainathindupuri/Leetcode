package leet;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		int n = 5;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0)
				list.add(i, "FizzBuzz");
			else if ((i + 1) % 5 == 0)
				list.add(i, "Buzz");
			else if ((i + 1) % 3 == 0)
				list.add(i, "Fizz");
			else
				list.add("" + (i + 1));
		}
		System.out.println(list);
	}

}
