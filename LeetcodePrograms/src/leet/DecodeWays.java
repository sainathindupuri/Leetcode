package leet;

import java.util.HashMap;

public class DecodeWays {

	HashMap<String, Integer> map = new HashMap<>();

	int count = 0;

	public static void main(String[] args) {

		DecodeWays dw = new DecodeWays();
		dw.decodeWays("27");
		System.out.println(dw.count);

	}

	public void decodeWays(String str) {
		if (str == "") {
			count++;
			return;
		}
			
		if (str.length() <= 2 && str.charAt(0) == '0')
			return;
		else if (str.length() < 2) {
			count++;
			return;
		} else if (str.length() >= 2) {
			int val = Integer.parseInt(str.substring(0, 2));
			if (val<10)
				return;
			else if (val == 10) {
				decodeWays(str.substring(2));
			} else if(val > 10 && val <=26) {
				decodeWays(str.substring(1));
				decodeWays(str.substring(2));
			} else if(val > 26) {
				decodeWays(str.substring(1));
			}

		}

		return;
	}

}
