package leet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
	public static void main(String[] args) {
		Integer[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		//Integer[][] mat = { { 6,9,7 } };
		int num = mat[0].length * mat.length;
		List<Integer> list = new ArrayList<>();
		int upRow = 0;
		int downRow = mat.length - 1;
		int firstCol = 0;
		int lastCol = mat[0].length - 1;
		while (list.size() < num) {
			System.out.println("list is " + list);
			if (upRow == downRow && firstCol == lastCol) {
				list.add(mat[upRow][lastCol]);
			}
			if (list.size() == num)
				break;
			for (int i = firstCol; i <= lastCol; i++) {
				list.add(mat[upRow][i]);
			}
			upRow++;
			System.out.println("1 list is " + list);
			if (list.size() == num)
				break;
			for (int i = upRow; i <= downRow; i++) {
				list.add(mat[i][lastCol]);
			}
			lastCol--;
			System.out.println("2 list is " + list);
			if (list.size() == num)
				break;
			for (int i = lastCol; i >= firstCol; i--) {
				list.add(mat[downRow][i]);
			}
			downRow--;
			System.out.println("3 list is " + list);
			if (list.size() == num)
				break;
			for (int i = downRow; i >= upRow; i--) {
				list.add(mat[i][firstCol]);
			}
			firstCol++;
		}

		System.out.println("final list is : " + list);
	}

}
