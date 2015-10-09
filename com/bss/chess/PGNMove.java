package com.bss.chess;

public class PGNMove {
	private String moveNumber;
	private String whiteMove;
	private String blackMove;

	public PGNMove(String moveNumber, String whiteMove, String blackMove) {
		this.moveNumber = moveNumber;
		this.whiteMove = whiteMove;
		this.blackMove = blackMove;
	}

	public String getMoveNumber() {
		return moveNumber;
	}


	public Move getWhiteMove() {
		return getMove(whiteMove);
	}


	public Move getBlackMove() {
		return getMove(blackMove);
	}


	public String toString() {
		return moveNumber + " " + whiteMove + " " + blackMove;
	}

	/**
	 * 
	 * Converts the chess notation to a move in this game
	 */
	private Move getMove(String pgnMove) {
		
		Move move = new Move();
		 
		
		
		int x = -1;
		int y = -1;
		
		if (pgnMove.contains(PieceType.KING.getShortName())) {
			move.setPiece((PieceType.KING));
		} else if (pgnMove.contains(PieceType.QUEEN.getShortName())) {
			move.setPiece((PieceType.QUEEN));
		} else if (pgnMove.contains(PieceType.ROOK.getShortName())) {
			move.setPiece((PieceType.ROOK));
		} else if (pgnMove.contains(PieceType.BISHOP.getShortName())) {
			move.setPiece((PieceType.BISHOP));
		} else if (pgnMove.contains(PieceType.KNIGHT.getShortName())) {
			move.setPiece((PieceType.KNIGHT));
		}

		if (pgnMove.contains("a")) {
			x = 0;
		} else if (pgnMove.contains("b")) {
			x = 1;
		} else if (pgnMove.contains("c")) {
			x = 2;
		} else if (pgnMove.contains("d")) {
			x = 3;
		} else if (pgnMove.contains("e")) {
			x = 4;
		} else if (pgnMove.contains("f")) {
			x = 5;
		} else if (pgnMove.contains("g")) {
			x = 6;
		} else if (pgnMove.contains("h")) {
			x = 7;
		}
		
		if (pgnMove.contains("1")) {
			y = 0;
		} else if (pgnMove.contains("2")) {
			y = 1;
		} else if (pgnMove.contains("3")) {
			y = 2;
		} else if (pgnMove.contains("4")) {
			y = 3;
		} else if (pgnMove.contains("5")) {
			y = 4;
		} else if (pgnMove.contains("6")) {
			y = 5;
		} else if (pgnMove.contains("7")) {
			y = 6;
		} else if (pgnMove.contains("8")) {
			y = 7;
		}

		move.setToSquare(new Square(x,y));
		return move;
		
	}

}
