package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	
	public static void main(String[] args) {
		//int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] intervals = {{2,3},{4,5},{6,7},{8,9},{1,10}};
		//int[][] intervals = {{1,4},{0,4}};
		List<int[]> list = new ArrayList<>();
		int j = 0;
		Arrays.sort(intervals, new Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		        return Integer.compare( b[1], a[1]);
		    }
		});
		for(int i = 0; i< intervals.length; i++) {
			if(list.size() == 0 )
				list.add(intervals[i]);
			else {
				for(j = 0; j<list.size();j++) {
					if(intervals[i][0] <= list.get(j)[1] || list.get(j)[0] >= intervals[i][1]) {
						list.get(j)[1] = intervals[i][1] >= list.get(j)[1] ? intervals[i][1]: list.get(j)[1];
						list.get(j)[0] = intervals[i][0] <= list.get(j)[0] ? intervals[i][0]: list.get(j)[0];
						break;
					}
				}
				if(j == list.size())
					list.add(intervals[i]);;
			}
		}
		int[][] nums = new int[list.size()][2];
		list.toArray(nums);
		System.out.println(nums.length);
	}

}
