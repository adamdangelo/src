package com.bss.chess;

import java.util.List;

public class Pawn extends ChessPiece {
	
	public Pawn(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPieceSymbol() {
		return "p";
	}

	@Override
	public List<Square> getPossibleMoves() {
		if (!moved) {
			
			
		}
		return null;
	}
	
	
	
}
