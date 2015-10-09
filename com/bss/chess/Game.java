package com.bss.chess;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Game {
	private ChessPiece[][] board = new ChessPiece[8][8];
	private List<PGNMove> moves = new ArrayList<PGNMove>();

	public Game() {
		initializeBoard();
		board[0][0] = new Rook(Color.WHITE);
		board[1][0] = new Knight(Color.WHITE);
		board[2][0] = new Bishop(Color.WHITE);
		board[3][0] = new Queen(Color.WHITE);
		board[4][0] = new King(Color.WHITE);
		board[5][0] = new Bishop(Color.WHITE);
		board[6][0] = new Knight(Color.WHITE);
		board[7][0] = new Rook(Color.WHITE);

		board[0][1] = new Pawn(Color.WHITE);
		board[1][1] = new Pawn(Color.WHITE);
		board[2][1] = new Pawn(Color.WHITE);
		board[3][1] = new Pawn(Color.WHITE);
		board[4][1] = new Pawn(Color.WHITE);
		board[5][1] = new Pawn(Color.WHITE);
		board[6][1] = new Pawn(Color.WHITE);
		board[7][1] = new Pawn(Color.WHITE);

		board[0][7] = new Rook(Color.BLACK);
		board[1][7] = new Knight(Color.BLACK);
		board[2][7] = new Bishop(Color.BLACK);
		board[3][7] = new Queen(Color.BLACK);
		board[4][7] = new King(Color.BLACK);
		board[5][7] = new Bishop(Color.BLACK);
		board[6][7] = new Knight(Color.BLACK);
		board[7][7] = new Rook(Color.BLACK);

		board[0][6] = new Pawn(Color.BLACK);
		board[1][6] = new Pawn(Color.BLACK);
		board[2][6] = new Pawn(Color.BLACK);
		board[3][6] = new Pawn(Color.BLACK);
		board[4][6] = new Pawn(Color.BLACK);
		board[5][6] = new Pawn(Color.BLACK);
		board[6][6] = new Pawn(Color.BLACK);
		board[7][6] = new Pawn(Color.BLACK);

	}
	

	private void initializeBoard() {
		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				board[x][y] = null;// new ChessPiece();
			}
		}
	}

	public void printGame() {
		for (int y = 7; y >= 0; y--) {
			for (int x = 7; x >= 0; x--) {
				if (board[x][y] != null) {
					System.out.print(board[x][y].getPieceSymbol() + " ");
				} else {
					System.out.print(". ");
				}

			}
			System.out.println();
		}

	}

	private void movePiece(String move, Color color) {

	}

	/**
	 * Loads a game from a PGN file and stores all moves in a list of moves.
	 * 
	 */
	public void loadGameFromPGN(String filename) {
		BufferedReader in = null;
		try {

			in = new BufferedReader(new FileReader(filename));
			String text = "";

			int lineCounter = 0;

			while (in.ready()) {
				text = in.readLine();
				lineCounter++;

				if (lineCounter > 8) {
					StringTokenizer tokenizer = new StringTokenizer(text, " ");
					PGNMove move = new PGNMove(tokenizer.nextToken(),
							tokenizer.nextToken(), tokenizer.nextToken());
					moves.add(move);
					//System.out.println(move.toString());

				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


	public void nextMove() {
		Iterator iterator = (Iterator) moves.iterator();
		PGNMove move = (PGNMove) iterator.next();
		System.out.println(move.toString());
		move.getWhiteMove();
		//moves.get(arg0)
		
	}

}
