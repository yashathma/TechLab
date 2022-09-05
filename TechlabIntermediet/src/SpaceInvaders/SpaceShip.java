package SpaceInvaders;

import apcs.Window;
import apcs.Window.key;

public class SpaceShip {
	public int x;
	public int y;
	public int dx;
	public int shootx=x;
	public int shooty=y+5;
	public String color;
	public int width=100;
	public int length=50;
	public SpaceShip(int x, int y, int dx, String color) {
		this.x=x;
		this.dx=dx;
		this.y=y;
		this.color=color;
	}
	public void draw() {
		Window.out.color(color);
		Window.out.rectangle(x, y, width, length);

	}
	public void move() {
		if (x+(width/2)<Window.width()) {
			if(Window.key.pressed("right")) {
				x=x+dx;
			}

		}
		if(x-(width/2)>0) {
			if(Window.key.pressed("left")) {
				x=x-dx;
			}
	}
}
	public bullet shoot() {
		if(key.pressed("space")) {
			bullet b=new  bullet(x); 
			return b;
		}
		return null;
	}


}
