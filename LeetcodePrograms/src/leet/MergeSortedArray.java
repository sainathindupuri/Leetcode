package leet;

import java.util.Set;
import java.util.TreeSet;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		int a = m - 1;
		
		int b = n - 1;
		int i = nums1.length - 1;
		while (i >= 0 && b >= 0) {
			if (a < 0) {
				nums1[i] = nums2[b];
				b--;
			} else {
				if (nums2[b] >= nums1[a]) {
					nums1[i] = nums2[b];
					b--;
				} else {
					nums1[i] = nums1[a];
					a--;
				}
			}

			i--;
		}

		System.out.println(nums1);
	}

}
