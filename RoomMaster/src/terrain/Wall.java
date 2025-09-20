package terrain;

import java.awt.Graphics2D;

import entities.Entities;

public class Wall {
	private int up, down, x;
	
	public Wall(int Up, int Down, int X) {
		up = Up;
		down = Down;
		x = X;
	}
	
	public int collide(Entities nt) {
		if(nt.getLocY() > down || nt.getLocY() + nt.getHeight() < up)return 0;
		if(nt.getPrevX() >= x && nt.getLocX() <= x)return 1;
		if(nt.getPrevX() + nt.getWidth() <= x && nt.getLocX() + nt.getWidth() >= x)return -1;
		
		return 0;
	}
	
	public int getX() {
		return x;
	}
	
	public void draw(Graphics2D g2) {
		g2.drawLine(x, up, x, down);
	}
}
