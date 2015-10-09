package com.bss.chess;

public class Square {
	private int[] location;
	
	public Square(int x, int y) {
		location = new int[] {x, y};
	}
	
	public int[] getLocation() {
		return location;
	}
	
	public int getX() {
		return location[0];
	}
	
	public int getY() {
		return location[1];
	}
}
