package leet;

public class MajorityElement {

	public static void main(String[] args) {

		int[] nums = { 6, 6, 6, 7, 7 };
		int maj = nums[0];
		int majCount = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == maj)
				majCount++;
			else {
				majCount--;
				if (majCount == 0) {
					maj = nums[i];
					majCount = 1;
				}

			}
		}

		System.out.println("Majority Element = " + maj);

	}

}
