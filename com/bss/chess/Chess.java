package com.bss.chess;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Chess implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game();
		game.printGame();

		game.loadGameFromPGN("C:\\Users\\adange\\workspace_chessgame\\Chess\\src\\game1.pgn");
		game.nextMove();

		//Chess se = new Chess();
		//SwingUtilities.invokeLater(se);
	}

	@Override
	public void run() {
		// Create the window
		JFrame f = new JFrame("Hello, !");
		// Sets the behavior for when the window is closed
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Add a layout manager so that the button is not placed on top of the
		// label
		f.setLayout(new FlowLayout());
		// Add a label and a button
		f.add(new JLabel("Hello, world!"));
		f.add(new JButton("Press me!"));
		// Arrange the components inside the window
		f.pack();
		// By default, the window is not visible. Make it visible.
		f.setVisible(true);
	}

}
