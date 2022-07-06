package leet;

public class StringToInteger {

	public static void main(String[] args) {
		String s = "  -0012a42";
		s = s.trim();
		String[] arr = s.split(" ");
		String max = String.valueOf(Integer.MAX_VALUE);
		String min = String.valueOf(Integer.MIN_VALUE);
		Double b_max = new Double(max);
		Double b_min = new Double(min);
		String res = "";
		String str = arr[0];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == 0 && (ch == '+' || ch == '-')) {
				res = res + ch;
				continue;
			}

			try {
				int a = Integer.parseInt(str.substring(i, i + 1));
				res = res + a;
			} catch (Exception e) {
				break;
			}
		}
		Double b1 = new Double(0);
		try {
			b1 = new Double(res);
		} catch (Exception e) {
			System.out.println("0");
			// return 0;
		}
		// Double
		if (b1 >= b_max)
			// return Integer.MAX_VALUE;
			System.out.println(Integer.MAX_VALUE);
		else if (b1 <= b_min)
			// return Integer.MIN_VALUE;
			System.out.println(Integer.MIN_VALUE);
		else {
			Integer a = b1.intValue();
			// return a;
			System.out.println(a);
		}

	}

}
