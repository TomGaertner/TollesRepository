package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoUmgedrehtesL extends AllgemeinerTetromino {

	private int xKoordinate;
	private int yKoordinate;

	public TetrominoUmgedrehtesL(int x, int y) {
		// TODO Auto-generated constructor stub

		xKoordinate = x;
		yKoordinate = y;
	}

	public void zeichnen(Graphics graphics) {

		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate + Rechteck.getKantenlaenge());
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + Rechteck.getKantenlaenge(), yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 2 * Rechteck.getKantenlaenge(), yKoordinate);
		rechteck.zeichnen(graphics);
	}

}