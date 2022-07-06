package leet;

public class SearchRotated {

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		int i = 0;
		int j = nums.length-1;
		while (nums[i] > nums[j]) {
			i++;
		}
		int index = 0;
		System.out.println("i is "+nums[i]);
		index =  binarySearch(nums, 0,6, target);
//		if(target >= nums[i] && target <=nums[j])
//			index =  binarySearch(nums, i,j, target);
//		else
//			index =  binarySearch(nums, 0, i-1 , target);
//		
		System.out.println("index "+index);

	}

	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

}
