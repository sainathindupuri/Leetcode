package leet;

public class ExcelSheetCol {

	public static void main(String[] args) {

		String columnTitle = "ZY";
		int l = columnTitle.length() - 1;
		int low = 0;
		for (int i = l; i >= 0; i--) {
			low = (int) (low + Math.pow(26, i));
		}
		System.out.println("val is " + low);
		for (int i = l; i >= 0; i--) {
			low = (int) (low + Math.pow(26, l - i) * (columnTitle.charAt(i) - 'A'));
			System.out.println("low in for" + (columnTitle.charAt(i) - 'A'));
		}

		System.out.println("low is " + low);
	}

}
