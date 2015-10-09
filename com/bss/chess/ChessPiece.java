package com.bss.chess;
import java.util.List;

public abstract class ChessPiece {

	protected Color color;
	protected boolean moved = false;
	
	public ChessPiece(Color color) {
		this.color = color;

	}
	
	
	public abstract String getPieceSymbol();
	public abstract List<Square> getPossibleMoves();
	
	public void move(Square toSquare) {
		if (getPossibleMoves().contains(toSquare)) {
			moved = true;
			//Move
		}
		else {
			//Error for trying to move to an invalid square
		}
		
		
	}
	
}
