package entities;

public class Player extends Entities{

	public Player(int LocX, int LocY, int Width, int Height) {
		super(LocX, LocY, Width, Height);
	}
	
	public void run(int spd) {
		velX += spd;
		if(velX > xLimit)velX = xLimit;
		if(velX < -xLimit)velX = -xLimit;
	}
	
	public void slow() {
		if(velX == 0) return;
		if(velX > 0) {
			velX--;
			return;
		}
		if(velX < 0)velX++;
	}
	
	public void move() {
		System.out.println(velX);
		
		prevX = locX;
		prevY = locY;
		locX += velX;
		locY += velY;
	}

}
