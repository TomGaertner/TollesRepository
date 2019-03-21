package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.GeometrischeFigur;

public class Tetrominol implements GeometrischeFigur {

	private int xKoordinate;
	private int yKoordinate;

	public Tetrominol(int xKoordinate, int yKoordinate) {

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

		rechteck = new Rechteck(xKoordinate + 90, yKoordinate);
		rechteck.zeichnen(graphics);
	}
}