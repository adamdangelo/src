package com.bss.chess;

public enum PieceType {
	PAWN(1, "p"), KNIGHT(3, "N"), BISHOP(3, "B"), ROOK(5, "R"), QUEEN(9, "Q"), KING(
			99, "K");

	private final int value;
	private final String shortName;

	PieceType(int value, String shortName) {
		this.value = value;
		this.shortName = shortName;
	}

	public int getValue() {
		return value;
	}

	public String getShortName() {
		return shortName;
	}
}
