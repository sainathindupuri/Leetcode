package leet;

public class Solution2 {
	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		int count = 0;
		String prefix = "";
		for (int i = 0; i < strs[0].length(); i++) {
			// char ch = ;
			for (int j = 1; j < strs.length; j++) {
				System.out.println("cond " + (i < strs[j].length()));
				if (i < strs[j].length()) {
					if (strs[0].charAt(i) != strs[j].charAt(i)) {
						System.out.println("unequal lcf = " + prefix);
						break;
					}
				} else {
					System.out.println("coming in ");
					System.out.println("lcf = " + prefix);
					break;
				}

			}
			prefix = prefix + strs[0].charAt(i);
		}
		// System.out.println("lcf = " + prefix);

	}

}
