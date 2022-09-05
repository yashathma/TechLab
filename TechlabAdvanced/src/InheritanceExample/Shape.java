package InheritanceExample;

import apcs.Window;

public class Shape implements Comparable {
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
	public double getArea() {
		int area=x*y;
		return area;
	}
	public int compareTo(Object o) {
		Shape s=(Shape) o;
		if(this.getArea()> s.getArea()) {
			return 1;
		}else if(this.getArea()< s.getArea()) {
			return -1; 
		}
		else {
			return 0;
		}
	}
	
}
