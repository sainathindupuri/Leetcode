package leet;

import java.util.ArrayList;
import java.util.List;

public class IntersectionArrays2 {

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 2, 1 };
		int nums2[] = { 2, 2 };
		int ret[] = new int[1001];
		int l1 = nums1.length;
		int l2 = nums2.length;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < l1; i++) {
			ret[nums1[i]]++;
		}
		for (int i = 0; i < l2; i++) {
			if (ret[nums2[i]] > 0) {
				list.add(nums2[i]);
				ret[nums2[i]]--;
			}

		}
		System.out.println(list);
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}

	}

}
