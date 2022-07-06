package leet;

public class FirstLast {

	public static int[] nums = { 5, 7, 8, 8, 10 };

	public static void main(String[] args) {
		int target = 8;
		int start = binarySearch(nums, 0, nums.length - 1, target);
		int end = start;
		if (start > 0) {
			while (nums[start - 1] == nums[start] && start > 0)
				start--;
		}
		if (end < nums.length) {
			while (nums[end + 1] == nums[end] && end < nums.length)
				end++;
		}

		System.out.println("start and end is " + start + "  " + end);

	}

	public static int binarySearch(int[] arr, int l, int r, int target) {
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == target)
				return mid;
			else if (target < arr[mid])
				return binarySearch(arr, l, mid - 1, target);
			else
				return binarySearch(arr, mid + 1, r, target);
		}
		return -1;

	}

}
