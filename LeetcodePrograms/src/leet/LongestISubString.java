package leet;

import java.util.HashMap;

public class LongestISubString {

	public static void main(String[] args) {
		String str = "aab";
		HashMap<Character, Integer> map = new HashMap<>();
		int i = 0;
		int j = 0;
		int max = 0;
		int c = 0;
		while (j < str.length()) {
			if (map.containsKey(str.charAt(j))) {
				int end = map.get(str.charAt(j));
				map = removeFrom(i, end, map, str);				
				if (c > max)
					max = c;
				i = end + 1;
				c = j - i ;
				
			} else {
				map.put(str.charAt(j), j);
				c++;
				if (j + 1 == str.length())
					break;
				j++;
			}
		}
		System.out.println("max is " + max);

	}

	private static HashMap<Character, Integer> removeFrom(int i, int j, HashMap<Character, Integer> map, String str) {
		while (i <= j) {
			map.remove(str.charAt(i));
			i++;
		}
		return map;
	}

}
