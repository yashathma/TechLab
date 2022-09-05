package techlab;

import apcs.Window;

public class Ball {
//attributes
	int x = 100;
	int y = 200;
	int radius = 40;
	int dx = 5;
	int dy = 5;
	String color = "red";

	// what can the ball do?
	// these are methods
	public Ball(int givenX, int givenY, int givenRadius, String givenColor) {
		x=givenX;
		y=givenY;
		radius=givenRadius;
		color=givenColor;
	}

	private void move() {
		x = x + dx;
		y = y + dy;
	}

	public void reflect() {
		if (x - radius < 0 || x + radius > Window.width()) {
			dx = -dx;
		}
		if (y - radius < 0 || y + radius > Window.height()) {
			dy = -dy;
		}
	}

	public void draw() {
		Window.out.color(color);
		Window.out.circle(x, y, radius);
		this.move();
	}

}
