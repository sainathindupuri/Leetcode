package leet;

import java.util.Iterator;
import java.util.LinkedList;

public class Solution {
	public static void main(String[] args) {
		int[][] nums = {{0,1},{1,1}};
		LinkedList<Integer> list= new LinkedList<>();
		Iterator itr = list.iterator();
		int max = 0;
		int count = 0;
		print2D(nums);
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums[i].length; j++) {
				count = 0;
				if (nums[i][j] == 1) {
					count++;
					nums[i][j] = 0;
					System.out.println();
					print2D(nums);
					count = countAllSorounding(nums, i, j, count);
				}
//				System.out.println("count is " + count);
//				System.out.println("matrix is " + nums);
				if (count > max) {
					max = count;
				}
			}
			
		}
		System.out.println("max area is " + max);

	}

	private static int countAllSorounding(int[][] nums, int i, int j, int count) {
		if (i + 1 < nums.length) {
			if (nums[i + 1][j] == 1) {
				count++;
				nums[i + 1][j] = 0;
				System.out.println();
				print2D(nums);
				count = countAllSorounding(nums, i + 1, j, count);
			}
		}
		if (i - 1 < nums.length && i - 1 >= 0) {
			if (nums[i - 1][j] == 1) {
				count++;
				nums[i - 1][j] = 0;
				System.out.println();
				print2D(nums);
				count = countAllSorounding(nums, i - 1, j, count);
			}
		}
		if (j - 1 < nums[i].length && j - 1 >= 0) {
			if (nums[i][j - 1] == 1) {
				count++;
				nums[i][j - 1] = 0;
				System.out.println();
				print2D(nums);
				count = countAllSorounding(nums, i, j - 1, count);
			}
		}
		if (j + 1 < nums[i].length) {
			if (nums[i][j + 1] == 1) {
				count++;
				nums[i][j + 1] = 0;
				System.out.println();
				print2D(nums);
				count = countAllSorounding(nums, i, j + 1, count);
			}
		}
		return count;

	}
	
	public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {
        	// Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
 
            
        
    }

}