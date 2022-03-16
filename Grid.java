package com.test;

public class Grid {

	static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
	public static void main(String args[]) {
		char[][] matrix = { { 'A', 'R', 'T', 'K' }, { 'S', 'M', 'S', 'F' }, { 'A', 'E', 'K', 'R' },
				{ 'G', 'I', 'W', 'V' } };
		String searchWord = "RMS";
		int row = matrix.length;
		int col = matrix[0].length;
		boolean flag = false;
		int wordChar = 0;
		for (int i = 0; i < row; row++) {
			for (int j = 0; i < col; col++) {
					if(wordChar<searchWord.length()-1  && charSearch(matrix, i, j, searchWord, wordChar++)) {
						flag = true;
					}
			}
		}
		System.out.println("flag "+ flag);
	}

	static boolean charSearch(char[][] matrix, int row, int col, String searchWord, int wordChar) {
		
		if (matrix[row][col] != searchWord.charAt(wordChar))
			return false;

		int len = searchWord.length();

		for (int dir = 0; dir < 8; dir++) {
			int i = 0;
			int rowdir = row + x[dir];
			int	coldir = col + y[dir];

			for (i = 1; i < len; i++) {
				if (rowdir >= row || rowdir < 0 || coldir >= col || coldir < 0)
					break;

				if (matrix[rowdir][coldir] != searchWord.charAt(i))
					break;

				rowdir += x[dir];
				coldir += y[dir];
			}

			if (i == len)
				return true;
		}
		
		return true;
	}

}
