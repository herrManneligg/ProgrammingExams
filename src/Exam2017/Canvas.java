package Exam2017;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	Color color = null;

	public Canvas() {
		this.setSize(400, 100);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}

//  Coordinates are received here and the graphics draws the line.
// 	It is important to note the super.getGraphics(). I tried with
//	paintComponent(Graphics g) overriding, but after each update,
//	the JPanel messed up and buttons were displayed in the canvas
//	for some reason. Not sure why this happens, but it seems that Graphics
//	is shared between all the JComponents, and we need to specify this...
	
	public void draw(int x, int y, int newX, int newY) {
		Graphics2D g2 = (Graphics2D) super.getGraphics();
		g2.setColor(color);
		g2.drawLine(x, y, newX, newY);
	}

//	Repaints and clears everything in this canvas.
	public void clear() {
		this.repaint();
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
}
