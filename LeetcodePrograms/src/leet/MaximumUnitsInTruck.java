package leet;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumUnitsInTruck {

	public static void main(String[] args) {
		int[][] boxTypes = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };
		int truckSize = 10;
		// sorting acc to number of units per box
		int maxUnits = 0;
		Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
		for (int i = 0; i < boxTypes.length; i++) {
			if (boxTypes[i][0] <= truckSize) {
				maxUnits = maxUnits + boxTypes[i][0] * boxTypes[i][1];
				truckSize = truckSize - boxTypes[i][0];
			} else {
				maxUnits = maxUnits + truckSize * boxTypes[i][1];
				truckSize = truckSize - truckSize;
			}

			if (truckSize == 0)
				break;
		}

		System.out.println("max units" + maxUnits);
	}

}
