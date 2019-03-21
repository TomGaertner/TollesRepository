package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.GeometrischeFigur;

public class TetrominogroﬂL implements GeometrischeFigur {

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

		rechteck = new Rechteck(xKoordinate + 30, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 60, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 60, yKoordinate + 30);
		rechteck.zeichnen(graphics);
	}
}
