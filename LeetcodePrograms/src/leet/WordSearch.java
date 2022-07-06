package leet;

public class WordSearch {

	public static boolean[][] visited;

	public static void main(String[] args) {

		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCB";
		visited = new boolean[board.length][board[0].length];
		int len = word.length();
		int c = 0;
		int k = 0;
		int l = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				boolean flag = false;
				if (board[i][j] == word.charAt(c)) {
					flag = rec(i, j, board, word, c);
				}
				if (flag) {
					// return true;
					System.out.println("true");
					return;
				}
			}
		}
		System.out.println("false");
		// return false;

	}

	private static boolean rec(int i, int j, char[][] board, String word, int c) {
		// TODO Auto-generated method stub
		if (c == word.length())
			return true;

		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(c) != board[i][j]
				|| visited[i][j])
			return false;
		visited[i][j] = true;
		if (rec(i + 1, j, board, word, c + 1) || rec(i - 1, j, board, word, c + 1) || rec(i, j + 1, board, word, c + 1)
				|| rec(i, j - 1, board, word, c + 1)) {
			return true;
		}
		visited[i][j] = false;
		return false;
	}

}
