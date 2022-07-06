package leet;

import java.util.HashMap;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 3, 4, 2 };
		int max = -1;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = nums2.length - 1; i >= 0; i--) {
			if (max == -1) {
				map.put(nums2[i], -1);
				max = nums2[i];
			} else if (nums2[i + 1] > nums2[i]) {
				map.put(nums2[i], nums2[i + 1]);
				max = nums2[i + 1];
			} else if (max > nums2[i]) {
				map.put(nums2[i], max);
			} else {
				map.put(nums2[i], -1);
			}
		}
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = map.get(nums1[i]);
		}
		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}

	}
}
