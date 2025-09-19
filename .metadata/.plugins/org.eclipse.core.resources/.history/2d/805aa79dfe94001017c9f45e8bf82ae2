package entities;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Entities {
	protected int velX, velY, prevX, prevY, locX, locY, width, height, yLimit, xLimit;
	protected boolean Grounded;
	
	public Entities(int LocX, int LocY, int Width, int Height) {
		velX = 0;
		velY = 0;
		Grounded = false;
		prevX = LocX;
		locX = LocX;
		prevY = LocY;
		locY = LocY;
		width = Width;
		height = Height;
		yLimit = 32;
		xLimit = 16;
	}
	
	public void draw(Graphics2D g2) {
		g2.setColor(Color.BLUE);
		g2.drawRect(locX, locY, width, height);
	}
}
