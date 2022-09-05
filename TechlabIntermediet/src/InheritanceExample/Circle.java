package InheritanceExample;

import apcs.Window;

public class Circle extends Shape {
	public int radius;

	public Circle(int x, int y , int radius, String color) {
		super(x,y,color);
		this.radius=radius;
		
	}
	public void draw() {
		Window.out.color(color);
		Window.out.circle(x, y, radius);
	}
}
