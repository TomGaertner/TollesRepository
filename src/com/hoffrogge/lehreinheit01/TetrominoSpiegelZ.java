package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.GeometrischeFigur;
import com.hoffrogge.lehreinheit04.Punkt;

public class TetrominoSpiegelZ implements GeometrischeFigur {

	private int xKoordinate;
	private int yKoordinate;
	private Punkt mittelPunkt;
	private Farbe farbe;

	public TetrominoSpiegelZ(int xKoordinate, int yKoordinate) {
		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
	}

	public void zeichnen(Graphics graphics) {

		Rechteck rechteck = new Rechteck(xKoordinate + 30, yKoordinate);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate + 30, yKoordinate + 30);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate, yKoordinate + 30);
		rechteck.zeichnen(graphics);

		rechteck = new Rechteck(xKoordinate, yKoordinate + 60);
		rechteck.zeichnen(graphics);
	}

	@Override
	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelPunkt = mittelpunkt;
	}

	@Override
	public Punkt getMittelPunkt() {
		return mittelPunkt;
	}

	@Override
	public void setDurchmesser(int d) {
		// TODO Auto-generated method stub

	}

	@Override
	public Farbe getLinienFarbe() {
		this.farbe = farbe;
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
