package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.GeometrischeFigur;
import com.hoffrogge.lehreinheit04.Punkt;

public class Tetrominoquadrat implements GeometrischeFigur {
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

		rechteck = new Rechteck(xKoordinate + 30, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate, yKoordinate + 30);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 30, yKoordinate + 30);
		rechteck.zeichnen(graphics);
		// graphics.drawLine(xKoordinate, yKoordinate, xKoordinate + 100, yKoordinate);
		// graphics.drawLine(xKoordinate, yKoordinate, xKoordinate, yKoordinate + 100);
		// graphics.drawLine(xKoordinate + 100, yKoordinate, xKoordinate + 100,
		// yKoordinate + 100);
		// graphics.drawLine(xKoordinate, yKoordinate + 100, xKoordinate + 100,
		// yKoordinate + 100);
	}

	@Override
	public void setMittelpunkt(Punkt mittelpunkt) {
		// TODO Auto-generated method stub

	}

	@Override
	public Punkt getMittelPunkt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDurchmesser(int d) {
		// TODO Auto-generated method stub

	}

	@Override
	public Farbe getLinienFarbe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLinienFarbe(Farbe farbe) {
		// TODO Auto-generated method stub

	}

	@Override
	public Farbe getLinienFarbe(Farbe Farbe) {
		// TODO Auto-generated method stub
		return null;
	}
}
