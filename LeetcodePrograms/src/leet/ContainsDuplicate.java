package leet;

import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		Set<Integer> set = new TreeSet<>();
		for(int i = 0;i<nums.length;i++) {
			if(set.contains(nums[i]))
				System.out.println(false);
			else
				set.add(nums[i]);
		}
		
		System.out.println(true);
	}

}
