package leet;

import java.util.HashMap;

public class FiboDp {

	HashMap<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		FiboDp dp = new FiboDp();
		int val = dp.fib(45);

		System.out.println("fib value is " + val);
	}

	public int fib(int n) {
		if (map.containsKey(n))
			return map.get(n);
		if (n <= 2)
			return 1;
		map.put(n, fib(n - 1) + fib(n - 2));
		return map.get(n);
	}

}
