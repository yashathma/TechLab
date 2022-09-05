package Pong;

import apcs.Window;

public class Ball {
	public String color;
	public int radius;
	public int x;
	public int y;
	public int dy;
	public int dx;
	public static int scoreLeft=0;
	public static int scoreRight=0;
	public int ScoreFontSize=30;
	public static int endScore=100;
	
public static void gameOver() {
	while(true) {
		
		Window.out.background("Pink");
		Window.out.font("arial black", 100);
		Window.out.color("Black");
		Window.out.rectangle(Window.width()/2, (int) (Window.height()/3.5), 700, 30);
		Window.out.rectangle(Window.width()/2, (int) (Window.height()*0.6), 700, 30);
		Window.out.print("GAME OVER", Window.width()/2-340, Window.height()/2-10);
		Window.frame(400);
		
		Window.out.background("Black");
		Window.out.font("arial black", 100);
		Window.out.color("Pink");
		Window.out.rectangle(Window.width()/2, (int) (Window.height()/3.5), 700, 30);
		Window.out.rectangle(Window.width()/2, (int) (Window.height()*0.6), 700, 30);
		Window.out.print("GAME OVER", Window.width()/2-340, Window.height()/2-10);
		Window.frame(400);
		
		
	}
	
	
}


	public Ball(int x,int y,int radius,String color) {
		this.color="black";
		this.x=x;
		this.y=y;
		this.radius=30;
		dx=10;
		dy=0;
	}
	
	
	
	public void draw() {
		
		Window.out.color(color);
		Window.out.circle(x, y, radius);
		Window.out.color("Pink");
		Window.out.circle(x, y, radius-7);
		Window.out.color("Black");
		Window.out.font("Ariel Black", 100);
		Window.out.print(scoreLeft, Window.width()/2-100, 100);
		Window.out.print(scoreRight, (int) (Window.width()/2+50), 100);
		Window.out.color("Red");
	}

	public void move() {
		x=x+dx;
		y=y+dy;
		
	}
	
	public void reflect(Paddle leftPaddle, Paddle rightPaddle) {
		
		if(y>=Window.height()||y<0) {
			dy=-dy;
		}
		if(x+radius>=rightPaddle.x-(rightPaddle.width/2)&&x-radius<=rightPaddle.x+(rightPaddle.width/2)) {
			if(y+radius >=rightPaddle.y-(rightPaddle.length/2)&&y-radius<= rightPaddle.y+(rightPaddle.length/2)) {
				if(dx>0) {
					dx=-dx;

				}
			}
			dy=Window.random(-10, 10);
		}
		if(x+radius>=leftPaddle.x+(leftPaddle.width/2)&&x-radius<=leftPaddle.x+(leftPaddle.width/2)) {
			if(y+radius >=leftPaddle.y-(leftPaddle.length/2)&&y-radius<= leftPaddle.y+(leftPaddle.length/2)) {
				if(dx<0) {
					dx=-dx;
				}
			}
dy=Window.random(-10, 10);
		}
		


		
		if(x+radius>=Window.width()) {
			//Ball went right
			x=Window.width()/2;
			y=Window.height()/2;
			dy=0;
			rightPaddle.x=Window.width()-100;
			rightPaddle.y=Window.height()/2;
			leftPaddle.x=100;
			leftPaddle.y=Window.height()/2;
			scoreLeft++;
			
		}else if(x-radius<=0) {
			//Ball went left
			x=Window.width()/2;
			y=Window.height()/2;
			dy=0;
			rightPaddle.x=Window.width()-100;
			rightPaddle.y=Window.height()/2;
			leftPaddle.x=100;
			leftPaddle.y=Window.height()/2;
			scoreRight++;
			
		}
		
		
	}
}
