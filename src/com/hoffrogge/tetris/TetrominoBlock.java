package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoBlock extends AllgemeinerTetromino {

	private int xKoordinate;
	private int yKoordinate;

	public void zeichnen(Graphics graphics) {

		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 30, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate, yKoordinate + 30);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 30, yKoordinate + 30);
		rechteck.zeichnen(graphics);
	}
}