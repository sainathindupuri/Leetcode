package leet;

public class CountAndSay {

	public static void main(String[] args) {
		CountAndSay obj = new CountAndSay();
		System.out.println(obj.countAndSay(6));

	}

	public String countAndSay(int n) {
		if (n == 1)
			return "1";
		if (n == 2)
			return "11";
		String prevRes = countAndSay(n - 1);
		String res = "";
		int count = 0;
		for (int i = 0; i < prevRes.length() - 1; i++) {
			if (prevRes.charAt(i) == prevRes.charAt(i + 1)) {
				count++;
			} else {
				res = res + Integer.toString(count + 1) + prevRes.charAt(i);
				count = 0;
			}

		}
		if (prevRes.charAt(prevRes.length() - 1) == prevRes.charAt(prevRes.length() - 1 - 1)) {
			res = res + Integer.toString(count + 1) + prevRes.charAt(prevRes.length() - 1);
		} else {
			res = res + Integer.toString(1) + prevRes.charAt(prevRes.length() - 1);
		}

		return res;

	}

}
