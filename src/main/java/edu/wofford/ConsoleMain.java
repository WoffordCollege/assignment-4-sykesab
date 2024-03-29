package edu.wofford;

import java.util.Scanner;

public class ConsoleMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		TicTacToeModel board = new TicTacToeModel();
		while (board.getResult() == TicTacToeModel.Result.NONE) {
			if (board.getCurrentTurn() == TicTacToeModel.Turn.XTURN) {
				System.out.println("X's turn: ");
			} else {
				System.out.println("O's turn: ");
			}
			int row = keyboard.nextInt();
			int col = keyboard.nextInt();
			board.setMarkAt(row, col);
			System.out.println(board);
		}
		TicTacToeModel.Result gameResult = board.getResult();
		if (gameResult == TicTacToeModel.Result.XWIN) {
			System.out.println("X wins");
		} else if (gameResult == TicTacToeModel.Result.OWIN) {
			System.out.println("O wins");
		} else {
			System.out.println("Tie");
		}
	}

}
