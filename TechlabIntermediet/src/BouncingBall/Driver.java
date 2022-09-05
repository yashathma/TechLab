package BouncingBall;
import apcs.Window;

public class Driver {
//public Ball(int x,int y, int radius, int xdir,int ydir, String color)
	public static void main(String[] args) {
		Window.size(600, 800);
		Ball[]ballArray=new Ball[100];
		String[] color = {"blue","black","red","orange"};
		for(int j=0;j<ballArray.length;j++) {
			ballArray[j]=new Ball(Window.random(100, 500),Window.random(100, 700),Window.random(10, 40),Window.random(1, 3),Window.random(1, 3),color[Window.random(0, color.length-1)]);
 
		}
		Ball tennis_ball=new Ball();
		Ball tennis_ball1=new Ball(100,200, 40, 7,7, "yellow");
		
		
		while (true) {
			Window.out.background("white");
			for(int i=0;i<ballArray.length;i++) {
				ballArray[i].draw();
				ballArray[i].move();
				ballArray[i].reflect();
			}
			tennis_ball.draw();
			tennis_ball.move();
			tennis_ball.reflect();
			tennis_ball1.draw();
			tennis_ball1.move();
			tennis_ball1.reflect();
			Window.frame(0);
			
		}
		

	}
}
