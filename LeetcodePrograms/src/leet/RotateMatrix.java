package leet;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int n = matrix[0].length;
		int a = 0;

		// swapping rows
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				a = matrix[i][j];
				matrix[i][j] = matrix[n - i - 1][j];
				matrix[n - i - 1][j] = a;
			}
		}
		// finding transpose;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				a = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = a;
			}
		}

		print2D(matrix);

	}

	public static void print2D(int mat[][]) {
		// Loop through all rows
		for (int i = 0; i < mat.length; i++) {
			// Loop through all elements of current row
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}

}
