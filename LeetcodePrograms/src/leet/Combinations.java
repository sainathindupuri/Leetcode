package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Combinations {
	public static List<String> combimationsFormed = new ArrayList<>();

	public static String digits = "23";
	public static HashMap<Character, List<String>> map = new HashMap<>();

	public static void main(String[] args) {
		map.put('2', new ArrayList<>(Arrays.asList("a", "b", "c")));
		map.put('3', new ArrayList<>(Arrays.asList("d", "e", "f")));
		map.put('4', new ArrayList<>(Arrays.asList("g", "h", "i")));
		map.put('5', new ArrayList<>(Arrays.asList("j", "k", "l")));
		map.put('6', new ArrayList<>(Arrays.asList("m", "n", "o")));
		map.put('7', new ArrayList<>(Arrays.asList("p", "q", "r", "s")));
		map.put('8', new ArrayList<>(Arrays.asList("t", "u", "v")));
		map.put('9', new ArrayList<>(Arrays.asList("w", "x", "y", "z")));
		backTrack("", 0);
		System.out.println("lists formed = " + combimationsFormed);
	}

	public static void backTrack(String formedString, int level) {
		System.out.println("lists formed = " + combimationsFormed);
		if (formedString.length() == digits.length()) {
			combimationsFormed.add(formedString);
			return;
		}
		List<String> possibleLetters = map.get(digits.charAt(level));
		possibleLetters.forEach(str -> {
			backTrack(formedString + str, level + 1);
		});

	}

}
