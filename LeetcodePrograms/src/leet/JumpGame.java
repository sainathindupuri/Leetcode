package leet;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGame {

	public static void main(String[] args) {
		//int[] nums = { 2, 3, 1, 1, 4 };
		 int[] nums = {3,2,1,0,4};
		JumpGame ob = new JumpGame();
		System.out.println("bool is " + ob.canJump(nums));
	}

	public boolean canJump(int[] nums) {
		int dest = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if(nums[i]>= dest - i)
				dest = i;
		}
		return dest == 0;
	}

//	public boolean canJump(int[] nums) {
//		if (nums.length == 1)
//			return true;
//		Queue<Integer> q = new LinkedList<Integer>();
//		q.add(0);
//		int i = 0;
//		while (!q.isEmpty()) {
//			i = q.poll();
//			int j = nums[i];
//			if (j == nums.length - 1)
//				return true;
//			else {
//				while (j > 0) {
//					if(i+j ==  nums.length - 1)
//						return true; 
//					else if(i+j < nums.length - 1)
//					{
//						q.add(i+j);						
//					}					
//					j = j - 1;
//				}
//			}
//		}
//		return false;
//	}

}
