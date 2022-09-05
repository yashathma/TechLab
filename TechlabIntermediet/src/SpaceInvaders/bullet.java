package SpaceInvaders;

import apcs.Window;

public class bullet {
	public int x=Window.width()/2,y=Window.height()-100,dy=5;
	public String color="red";
	public int width=10;
	public int length=60;
	public bullet(int x) {
		this.x=x;
	}
	
	public void draw() {
		Window.out.color(color);
		Window.out.rectangle(x, y, width, length);
	}
	public void move() {
		
		y=y-dy;
		dy=dy+2;

	}
	public boolean inValid() {
		if(y<0) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}



}
