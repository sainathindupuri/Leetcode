package leet;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		int numRows = 5;
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			if (i == 0) {
				list.add(0, new ArrayList<Integer>());
				list.get(0).add(1);
			} else if (i == 1) {
				list.add(1, new ArrayList<Integer>());
				list.get(1).add(1);
				list.get(1).add(1);
			} else {
				List<Integer> sub = new ArrayList<>();
				sub.add(1);

				for (int j = 1; j < i; j++) {
					sub.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
				}
				sub.add(1);
				list.add(i, sub);
			}

		}
		System.out.println(list);
	}

}
