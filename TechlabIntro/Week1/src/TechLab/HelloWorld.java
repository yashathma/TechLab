package TechLab;

import apcs.Window;

public class HelloWorld {
	public static void main(String[] args) {
		//System.out.println("Hello World");
//Wrote your name is the basic line
		//System.out.println("\t I am in 9th grade \n hello");
//When you added \t you added a tab then you wrote the rest
		// You added \n to put the next text in another line

		
//Maze Project	
		
		Window.size(500, 500);
		Window.out.line(50, 500, 50, 250);
		Window.out.line(50, 200, 50, 50);
		Window.out.line(50, 250, 200, 250);
		Window.out.line(50, 200, 200, 200);
		Window.out.line(200, 200, 200, 50);
		Window.out.line(200, 500, 200, 300);
		Window.out.line(200, 300, 150, 300);
		Window.out.line(100, 250, 100, 450);
		Window.out.line(150, 300, 150, 450);
		Window.out.line(100, 0, 100, 150);
		Window.out.line(150, 200, 150, 50);
		Window.out.line(250, 100, 250, 350);
		Window.out.line(250, 50, 450, 50);
		Window.out.line(200, 150, 250, 150);
		Window.out.line(300, 50, 300, 400);
		Window.out.line(300, 400, 250, 400);
		Window.out.line(200, 250, 250, 200);
		Window.out.line(200, 450, 350, 450);
		Window.out.line(450, 450, 450, 50);
		Window.out.line(350, 450, 350, 100);
		Window.out.line(400, 50, 400, 400);
		Window.out.line(400, 450, 450, 450);
		Window.out.line(400, 450, 400, 500);
		Window.out.color("Green");
		Window.out.circle(25, 475, 20);
		Window.out.color("Red");
		Window.out.circle(225, 475, 20);
		Window.out.color("Black");
		Window.out.print("Start", 9, 480);
		Window.out.print("End", 211, 480);
		
		
// MICKEY MOUSE PROJECT
		/*
		// Setting
		Window.size(500,500);
		// Background
		Window.out.background("White");
		// Head
		Window.out.color("Black");
		Window.out.circle(250, 250, 100);
		// Ears
		Window.out.circle(150,170,50);
		Window.out.circle(350, 170, 50);
		// Outside eyes
		Window.out.color("White");
		Window.out.circle(210, 230, 20);
		Window.out.circle(290, 230, 20);
		// Pupil
		Window.out.color("Black");
		Window.out.circle(210, 240, 15);
		Window.out.circle(290, 240, 15);
		// Mouth
		Window.out.color("White");
		Window.out.oval(250, 290, 100, 20);
		*/

		
// JAPAN PROJECT
		/*
		// Setting
		 Window.size(1000,500);
		// Background
		 Window.out.background("White");
		// Red Dot
		 Window.out.color("Red");
		 Window.out.circle(500, 250, 100);
		 */

	}
}
