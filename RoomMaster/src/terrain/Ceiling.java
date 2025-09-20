package terrain;

import java.awt.Graphics2D;

import entities.Entities;

public class Ceiling {
	private int left, right, y;
	
	public Ceiling(int Left, int Right, int Y) {
		left = Left;
		right = Right;
		y = Y;
	}
	
	public boolean bonks(Entities nt) {
		if(nt.getLocX() > right || nt.getLocX() + nt.getWidth() < left)return false;
		if(nt.getPrevY() >= y && nt.getLocY() <= y)return true;
		
		return false;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw(Graphics2D g2) {
		g2.drawLine(right, y, left, y);
	}
}
