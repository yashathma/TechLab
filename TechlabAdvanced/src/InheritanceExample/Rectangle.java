package InheritanceExample;

import apcs.Window;

public class Rectangle extends Shape{
	public int width;
	public int length;
	public Rectangle(int length,int x,int y, int width, String color) {
		super(x,y,color);
		this.length=length;
		this.width=width;
	}
	public void draw() {
		Window.out.color(color);
		Window.out.rectangle(x, y, width, length);
	}
	public double getArea() {
		int area=width*length;
		return area;
	}
	
}
