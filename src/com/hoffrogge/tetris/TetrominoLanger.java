package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoLanger extends AllgemeinerTetromino {

	private int xKoordinate;
	private int yKoordinate;

	public TetrominoLanger(int x, int y) {
		// TODO Auto-generated constructor stub

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

		rechteck = new Rechteck(xKoordinate + 3 * rechteck.getKantenlaenge(), yKoordinate);
		rechteck.zeichnen(graphics);

	}

}