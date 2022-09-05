package techlab;

import apcs.Window;

public class Client {
	

	public static void main(String[] args) {

		Ball b = new Ball(400, 100, 20, "black");
		Ball b2 = new Ball(100, 100, 20, "black");
		Ball b3 = new Ball(100, 400, 20, "black");
		Ball b4 = new Ball(400, 400, 20, "black");
 
		while (true) {
			Window.frame();
			b.draw();
			//b.move();
			b.reflect();

			b2.draw();
			//b2.move();
			b2.reflect();

			b3.draw();
			//b3.move();
			b3.reflect();
			
			b4.draw();
			//b4.move();
			b4.reflect();
			
			

			Window.out.color("white");
			Window.out.polygon(b.x, b.y, b2.x, b2.y, b3.x, b3.y, b4.x, b4.y);
			
		}

	}

}
