package leet;

public class SetMatrixZeros {

	public static void main(String[] args) {

		// int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		int[][] matrix = { { 1, 0, 3 } };
		boolean row = false;
		boolean col = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == 0 && matrix[i][j] == 0) {
					col = true;
				}
				if (j == 0 && matrix[i][j] == 0) {
					row = true;
				}
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {

				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		System.out.println("row " + row);
		System.out.println("col " + col);

		if (row) {
			for (int i = 0; i < matrix.length; i++)
				matrix[i][0] = 0;
		}
		if (col) {
			for (int i = 0; i < matrix[0].length; i++)
				matrix[0][i] = 0;
		}
		print2D(matrix);

	}

	public static void print2D(int matrix[][]) {
		// Loop through all rows
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void makeRowColZero(int i, int j, Integer[][] matrix) {

	}

}
