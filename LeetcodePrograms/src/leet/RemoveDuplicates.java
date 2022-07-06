package leet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int i = 0;
		for (int j = 0; j < nums.length - 1; j++) {
			if (nums[j] != nums[j + 1]) {
				nums[i] = nums[j];
				i++;
			}
		}
		if(i>0) {
			if (nums[i - 1] != nums[nums.length - 1]) {
				nums[i] = nums[nums.length - 1];
			}

		}
		
		System.out.println(nums);

	}

}
