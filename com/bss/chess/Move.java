package com.bss.chess;

public class Move {

	private PieceType piece;
	private Square fromSquare;
	private Square toSquare;
	
	public PieceType getPiece() {
		return piece;
	}
	public void setPiece(PieceType piece) {
		this.piece = piece;
	}
	public Square getFromSquare() {
		return fromSquare;
	}
	public void setFromSquare(Square fromSquare) {
		this.fromSquare = fromSquare;
	}
	public Square getToSquare() {
		return toSquare;
	}
	public void setToSquare(Square toSquare) {
		this.toSquare = toSquare;
	}
	
}
