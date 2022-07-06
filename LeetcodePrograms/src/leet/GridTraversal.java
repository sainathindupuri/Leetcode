package leet;

import java.util.HashMap;

public class GridTraversal {
	HashMap<String, Integer> map = new HashMap<String, Integer>();

	public static void main(String[] args) {
		GridTraversal obj = new GridTraversal();
		int ways = obj.noOfWays(3, 7);
		System.out.println("no of ways are " + ways);
	}

	public int noOfWays(int m, int n) {
		String s = m + "," + n;
		if (map.containsKey(s))
			return map.get(s);
		else if (m == 0 || n == 0)
			return 0;
		else if (m == 1 || n == 1)
			return 1;
		map.put(s, noOfWays(m - 1, n) + noOfWays(m, n - 1));
		return map.get(s);
	}

}
