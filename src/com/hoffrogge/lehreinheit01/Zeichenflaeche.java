package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.GeometrischeFigur;
import com.hoffrogge.lehreinheit04.Quadrat;

/*
 * Zeichenfl‰che mit einer Grˆﬂe von 800 x 800 Pixeln
 * @formatter:off
 *  
 *  0,0 ----------------------------------------- 800,0
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  0,800 --------------------------------------- 800,800
 *  
 * @formater:on 
 */
public class Zeichenflaeche extends Quadrat implements GeometrischeFigur {

	@Override
	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		Tetrominoquadrat tetrominoquadrat = new Tetrominoquadrat(200, 150);
		tetrominoquadrat.zeichnen(graphics);

		TetrominogroﬂL tetrominogroﬂL = new TetrominogroﬂL(200, 400);
		tetrominogroﬂL.zeichnen(graphics);

		Tetrominol tetrominol = new Tetrominol(0, 300);
		tetrominol.zeichnen(graphics);

		TetrominoZ tetrominoZ = new TetrominoZ(100, 100);
		tetrominoZ.zeichnen(graphics);

		TetrominoSpiegelZ tetrominoSpiegelZ = new TetrominoSpiegelZ(0, 0);
		tetrominoSpiegelZ.zeichnen(graphics);

		TetrominoSpiegelL tetrominoSpiegelL = new TetrominoSpiegelL(300, 0);
		tetrominoSpiegelL.zeichnen(graphics);

		TetrominoT tetrominoT = new TetrominoT(500, 0);
		tetrominoT.zeichnen(graphics);

	}

}