package leet;

public class MissingNumber {

	public static void main(String[] args) {
		int nums[] = { 3, 0, 1 };
		int l = nums.length;
		int sum = l*(l-1)/2;;
		for(int i = 0;i<l;i++) {
			if(nums[i]>=l)
				continue;
			sum = sum - nums[i];
		}
		System.out.println(sum);
	}

}
