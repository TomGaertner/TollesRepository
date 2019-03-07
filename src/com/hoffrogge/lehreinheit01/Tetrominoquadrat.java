package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Tetrominoquadrat {
	private int xKoordinate;
	private int yKoordinate;

	public Tetrominoquadrat(int xKoordinate, int yKoordinate) {
		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
	}

	public void zeichnen(Graphics graphics) {

		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 100, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate, yKoordinate + 100);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 100, yKoordinate + 100);
		rechteck.zeichnen(graphics);
		// graphics.drawLine(xKoordinate, yKoordinate, xKoordinate + 100, yKoordinate);
		// graphics.drawLine(xKoordinate, yKoordinate, xKoordinate, yKoordinate + 100);
		// graphics.drawLine(xKoordinate + 100, yKoordinate, xKoordinate + 100,
		// yKoordinate + 100);
		// graphics.drawLine(xKoordinate, yKoordinate + 100, xKoordinate + 100,
		// yKoordinate + 100);
	}

}
