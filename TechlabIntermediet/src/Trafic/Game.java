package Trafic;

import apcs.Window;

public class Game {

	public static void main(String[] args) {
		Window.size(600, 800);
		Player yash=new Player(300,700,50);
		Cars car=new Cars(0-150,10,"Red",80,150,Window.random(1, 3));

		while(true) {
			Window.out.background("grey");
			yash.draw();
			car.draw();
			car.move();
			yash.crash(car);
			Window.out.color("Yellow");
			Window.out.rectangle(Window.width()/3, Window.height()/2, 10, Window.height());
			Window.out.rectangle(Window.width()*2/3, Window.height()/2, 10, Window.height());
			yash.move();
			if (yash.lives==3) {
				Window.out.color("Green");
			}else if(yash.lives==2) {
				Window.out.color("Yellow");
			}else if(yash.lives==1) {
				Window.out.color("Red");
			}
			Window.out.font("arial Black", 40);
			if(yash.lives==3) {
				break;
			}
			Window.out.print("Lives: "+yash.lives, Window.width()/2-80, (int) (Window.height()*19.5/20));
			Window.frame();

		}
		Window.out.color("White");
		Window.out.rectangle(Window.width()/2, Window.height()/2-15, 300, 60);
		Window.out.color("Black");
		Window.out.font("arial Black", 40);
		Window.out.print("Game Over", Window.width()/2-120,Window.height()/2);
		Window.frame();
	}

}
