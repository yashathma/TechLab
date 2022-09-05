package InheritanceExample;

import apcs.Window;

public class Shape {
	public  int x,y;
	public String color;
	public Shape(int x, int y, String color) {
		this.x=x;
		this.y=y;
		this.color=color;
	}
	public void draw() {
	Window.out.color(color);
	Window.out.polygon(x,y);
	}
}
