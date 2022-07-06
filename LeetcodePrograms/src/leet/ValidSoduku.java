package leet;

import java.util.HashMap;

public class ValidSoduku {

	public static char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
			{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
			{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
			{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
			{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < 9; i++) {
			map.clear();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.')
					continue;
				if (map.containsKey(board[i][j])) {
					System.out.println("false");
					return;
				} else
					map.put(board[i][j], 1);
			}
		}
		for (int i = 0; i < 9; i++) {
			map.clear();
			for (int j = 0; j < 9; j++) {
				if (board[j][i] == '.')
					continue;
				if (map.containsKey(board[j][i])) {
					System.out.println("false");
					return;
				} else
					map.put(board[j][i], 1);
			}
		}

		for (int i = 0; i < 9; i = i + 3) {
			for (int j = 0; j < 9; j = j + 3) {
				map.clear();
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						if (board[i + k][j + l] == '.')
							continue;
						if (map.containsKey(board[i + k][j + l])) {
							System.out.println("false");
							return;
						} else
							map.put(board[i + k][j + l], 1);
					}
				}

			}
		}

		System.out.println("true");

	}

}
