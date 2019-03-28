package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoL extends AllgemeinerTetromino {

	private int xKoordinate;
	private int yKoordinate;

	public TetrominoL(int x, int y) {
		xKoordinate = x;
		yKoordinate = y;
	}

	public void zeichnen(Graphics graphics) {

		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + rechteck.getKantenlaenge(), yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 2 * rechteck.getKantenlaenge(), yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 2 * rechteck.getKantenlaenge(), yKoordinate + rechteck.getKantenlaenge());
		rechteck.zeichnen(graphics);
	}

}