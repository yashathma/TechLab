package BouncingBall;

import apcs.Window;

public class Ball {
	public String color;
	public int radius;
	public int x;
	public int y;
	public int ydir;
	public int xdir;

	public Ball() {
		color="red";
		x=200;
		y=300;
		radius=30;
		ydir=5;
		xdir=15;
	}
	public Ball(int x,int y) {
		color="red";
		this.x=x;
		this.y=y;
		radius=30;
		ydir=5;
		xdir=15;
	}
	public Ball(int x,int y, int radius, int xdir,int ydir, String color) {
		this.color=color;
		this.x=x;
		this.y=y;
		this.radius=radius;
		this.ydir=ydir;
		this.xdir=xdir;
	}

	public void draw() {
		Window.out.color(color);
		Window.out.circle(x, y, radius);
	}

	public void move() {
		x=x+xdir;
		y=y+ydir;
	}
	public void reflect() {
		if (x - radius < 0 || x + radius > Window.width()) {
			xdir = -xdir;
		}
		if (y - radius < 0 || y + radius > Window.height()) {
			ydir = -ydir;
		}
	}
}
