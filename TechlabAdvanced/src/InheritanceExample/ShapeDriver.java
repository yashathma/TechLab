package InheritanceExample;

import apcs.Window;

public class ShapeDriver {

	public static void main(String[] args) {
		Shape shape= new Shape(250, 250, "Green");
		Circle cir=new Circle(400, 100 , 5, "Blue");
		Rectangle rec=new Rectangle(100,100,100, 50, "Yellow");
		Triangle tri=new Triangle(250, 250,300, 300,200, 400, "White");
		Circle circletwo=new Circle(400, 100, 100,"Blue");
		if(cir.compareTo(rec)>0) {
			System.out.println("Circle is the bigger Rectangle");
		}
		else if(cir.compareTo(rec)<0) {
			System.out.println("rectangle is bigger than circle");
		}
		else {
			System.out.println("They are the same size");
		}
		
		
		Window.size(500, 500);
		cir.draw();
		rec.draw();
		tri.draw();
		shape.draw();



	}

}
