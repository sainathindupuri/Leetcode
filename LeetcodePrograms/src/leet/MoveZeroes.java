package leet;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		int i = 0;
		int j = i;
		int temp = 0;
		while (i < nums.length) {
			j = i + 1;
			inner: if (nums[i] == 0) {
				// swap with next non zero
				while (j < nums.length) {
					if (nums[j] != 0) {
						temp = nums[j];
						nums[j] = nums[i];
						nums[i] = temp;
						break inner;
					}
					j++;
				}
			}
			i++;
			if (j > nums.length)
				break;
		}
		for (int k = 0; k < nums.length; k++)
			System.out.println(nums[k]);

	}

}
