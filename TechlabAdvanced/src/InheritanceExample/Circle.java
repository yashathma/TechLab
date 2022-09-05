package InheritanceExample;

import apcs.Window;

public class Circle extends Shape implements Comparable{
	public int radius;

	public Circle(int x, int y , int radius, String color) {
		super(x,y,color);
		this.radius=radius;
		
	}
	public void draw() {
		Window.out.color(color);
		Window.out.circle(x, y, radius);
	}
	public double getArea() {
		double area=Math.PI*radius*radius;
		return area;
	}
}
