package leet;

public class SortColors {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		int[] freq = { 0, 0, 0 };
		int ptr = 0;
		for (int a : nums) {
			freq[a]++;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < freq[i]; j++) {
				nums[ptr] = i;
				ptr++;
			}

		}

		System.out.println(nums);

	}

}
