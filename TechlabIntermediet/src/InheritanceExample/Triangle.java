package InheritanceExample;

import apcs.Window;

public class Triangle extends Shape{
public int x2,y2,x3,y3;

public Triangle(int x, int y,int x2, int y2,int y3, int x3, String color) {
	super(x,y,color);
	this.x2=x2;
	this.y2=y2;
	this.x3=x3;
	this.y3=y3;
}
public void draw() {
	Window.out.color(color);
	Window.out.polygon(x,y,x2,y2,x3,y3);
}

}
