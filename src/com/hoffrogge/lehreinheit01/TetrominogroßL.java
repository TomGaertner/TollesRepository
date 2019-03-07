package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Tetrominogro�L {

	private int xKoordinate;
	private int yKoordinate;

	public Tetrominogro�L(int xKoordinate, int yKoordinate) {

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
