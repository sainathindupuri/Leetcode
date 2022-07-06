package leet;

public class GCDString {

	public static void main(String[] args) {
		String str1 = "ABABAB";
		String str2 = "ABAB";
		String gcd = gcdOfStrings(str1, str2);
		System.out.println("gcd is "+gcd);
	}

	public static String gcdOfStrings(String str1, String str2) {
		if (str1.equals(str2))
			return str1;
		if (str1.length() == str2.length() && !str1.equals(str2))
			return "";
		String str = "";
		if (str1.length() > str2.length())
			if (str1.substring(0, str2.length()).equals(str2))
				str = gcdOfStrings(str1.substring(str2.length(), str1.length()), str2);
			else
				return "";
		if (str1.length() < str2.length())
			if (str2.substring(0, str1.length()).equals(str1))
				str = gcdOfStrings(str2.substring(str1.length(), str2.length()), str1);
			else
				return "";

		return str;
	}

}
