package Pong;

import apcs.Window;

public class Paddle {
	public int length,width;
	public int x,y;
	public String color;
	public int dy;
	public char up;
	public char down;

	public Paddle(int x, int y,char up,char down) {
		this.x=x;
		this.y=y;
		length=Window.height()/5;
		width=Window.width()/75;
		dy=30;
		this.up=up;
		this.down=down;
	}

	public void draw() {
		Window.out.color("Black");
		Window.out.rectangle(x, y, width, length);
	}
	public void move() {
		if(Window.key.pressed(up)) {
			if(y>=75) {
				y-=dy;
			}
			
		}
		if(Window.key.pressed(down)) {
			if(y<=Window.height()-75) {
				y+=dy;
			}
		}
		
	}
	
	
}
