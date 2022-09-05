package Pong;

import apcs.Window;

public class Game {
	public static void main(String[] args) {
		Window.size(1400, 800);
		Ball ball= new Ball(Window.width()/2,Window.height()/2,30,"Black");
		Paddle leftPaddle=new Paddle(100,Window.height()/2,'w','s');
		Paddle rightPaddle=new Paddle(Window.width()-100,Window.height()/2,'o','l');

		while(Ball.scoreLeft!=Ball.endScore+1&&Ball.scoreRight!=Ball.endScore+1){
			Window.out.background("Pink");
			Window.out.color("Black");
			Window.out.circle(Window.width()/2, Window.height()/2, 60);
			Window.out.rectangle((Window.width()/2), Window.height()/2, 10, Window.height());
			Window.out.rectangle((Window.width()/2), Window.height(), Window.width(), 20);
			Window.out.rectangle((Window.width()/2), 0, Window.width(), 20);
			Window.out.rectangle(0, Window.height()/2, 20, Window.height());
			Window.out.rectangle(Window.width(), Window.height()/2, 20, Window.height());


			Window.out.color("Pink");
			Window.out.circle(Window.width()/2, Window.height()/2, 50);
			ball.draw();
			//balltwo.draw();
			leftPaddle.draw();
			rightPaddle.draw();
			ball.move();
			//balltwo.move();
			leftPaddle.move();
			rightPaddle.move();
			ball.reflect(leftPaddle,rightPaddle);
			//balltwo.reflect(leftPaddle, rightPaddle);
			Window.frame(-1000);
			
		}
		Ball.gameOver();

	}
}



