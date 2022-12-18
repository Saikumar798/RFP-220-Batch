package practiseProblemsDay7;

import java.util.Scanner;

public class Tic_Tac_Toe {

	static String player1;
	static String player2;

	public static void drawboard(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player 1 name :");
		player1 = sc.nextLine();

		System.out.println("Enter Player 2 name :");
		player2 = sc.nextLine();

		char[][] board = new char[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}

		drawboard(board);

	}
}
