package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class TetrominogroﬂL {

	private int xKoordinate;
	private int yKoordinate;

	public TetrominogroﬂL(int xKoordinate, int yKoordinate) {

		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
	}

	public void zeichnen(Graphics graphics) {

		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 100, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 200, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 300, yKoordinate);
		rechteck.zeichnen(graphics);
	}
}
