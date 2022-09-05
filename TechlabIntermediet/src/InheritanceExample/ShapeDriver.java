package InheritanceExample;

import apcs.Window;

public class ShapeDriver {
 
	public static void main(String[] args) {
		Shape shape= new Shape(250, 250, "Green");
		Circle cir=new Circle(400, 100 , 50, "Blue");
		Rectangle rec=new Rectangle(100,100,100, 50, "Yellow");
		Triangle tri=new Triangle(250, 250,300, 300,200, 400, "White");
Window.size(500, 500);
cir.draw();
rec.draw();
tri.draw();
shape.draw();
		


	}

}
