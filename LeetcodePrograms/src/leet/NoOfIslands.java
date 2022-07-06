package leet;

public class NoOfIslands {
	public static void main(String[] args) {
		char[][] matrix = { {'1','1','0','0','0'},
				  			{'1','1','0','0','0'},
				  			{'0','0','1','0','0'},
				  			{'0','0','0','1','1'}};
		//int j = 0, k = 0;
		//boolean[][] visited = 
		int islands = 0;
		print2D(matrix);
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == '1') {
					islands++;
					matrix[i][j] = '0';
					print2D(matrix);
					System.out.println("first ");
					matrix = dfs(i, j, matrix);
				}
			}

		}
		//System.out.println("no of islands = "+islands);

	}

	private static char[][] dfs(int i, int j, char[][] matrix) {
		// TODO Auto-generated method stub
		if(i-1 >= 0) {
			if(j-1 >=0) {
				if(matrix[i-1][j-1] =='1') {
					matrix[i-1][j-1] ='0';
					matrix = dfs(i-1,j-1,matrix);
				}
			}
			if(matrix[i-1][j] == '1') {
				matrix[i-1][j] = '0';
				matrix = dfs(i-1,j,matrix);
			}
			if(j+1 < matrix[i-1].length) {
				if(matrix[i-1][j+1] == '1') {
					matrix[i-1][j+1] = '0';
					matrix = dfs(i-1,j+1,matrix);
				}
			}
		}
		if(j-1 >=0) {
			if(matrix[i][j-1] =='1') {
				matrix[i][j-1] ='0';
				matrix = dfs(i,j-1,matrix);
			}
		}
		if(j+1 < matrix[i].length) {
			if(matrix[i][j+1] == '1') {
				matrix[i][j+1] = '0';
				matrix = dfs(i,j+1,matrix);
			}
		}
		if(i+1 < matrix.length) {
			if(j-1 >=0) {
				if(matrix[i+1][j-1] =='1') {
					matrix[i+1][j-1] ='0';
					matrix = dfs(i+1,j-1,matrix);
				}
			}
			if(j+1 < matrix[i+1].length) {
				if(matrix[i+1][j+1] == '1') {
					matrix[i+1][j+1] = '0';
					matrix = dfs(i+1,j+1,matrix);
				}
			}
			if(matrix[i+1][j] == '1') {
				matrix[i+1][j] = '0';
				matrix = dfs(i+1,j,matrix);
			}
		}
		System.out.println(" ");
		print2D(matrix);
		System.out.println(" ");
		return matrix;
		
	}
	public static void print2D(char mat[][])
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
