package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Rechteck {

	private int xKooridnate;
	private int yKoordinate;

	public Rechteck(int xKooridnate, int yKoordinate) {
		super();
		this.xKooridnate = xKooridnate;
		this.yKoordinate = yKoordinate;
	}

	public void zeichnen(Graphics graphics) {

		graphics.drawLine(xKooridnate, yKoordinate, xKooridnate + 30, yKoordinate);
		graphics.drawLine(xKooridnate, yKoordinate, xKooridnate, yKoordinate + 30);
		graphics.drawLine(xKooridnate + 30, yKoordinate, xKooridnate + 30, yKoordinate + 30);
		graphics.drawLine(xKooridnate, yKoordinate + 30, xKooridnate + 30, yKoordinate + 30);
	}
}
/*
 * Draws a line, using the current color, between the points (x1, y1) and (x2,
 * y2) in this graphics context's coordinate system.
 */
//
// int x1 = 150;
// int y1 = 600;
// int x2 = 150;
// int y2 = 300;
// graphics.drawLine(x1, y1, x2, y2);
// int x3 = 650;
// int y3 = 600;
// int x4 = 650;
// int y4 = 300;
// public Rechteck(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int
// y4)
// graphics.drawLine(x3, y3, x4, y4);{
// super();
// this.x1 = x1;
// this.y1 = y1;
// this.x2 = x2;
// this.y2 = y2;
// this.x3 = x3;
// this.y3 = y3;
// this.x4 = x4;
// this.y4 = y4;
//
// }
// }
