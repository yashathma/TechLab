package dino;
import apcs.Window;
public class game {
	public static void main(String[] args) {
		Window.size(1400,800);
		Dino dino= new Dino("white",Window.width()/4,Window.height()*3/4,36,10);
		Obstacles obs= new Obstacles("Dark Green",Window.width()-50,Window.height()*3/4-15,Window.random(20, 40),Window.random(20, 40),Window.random(30, 150));
		while (true) {
			obs.y=Window.height()*3/4+35-(obs.height/2);
			Window.out.background("light blue");
			Window.out.color("Light green");
			Window.out.rectangle(Window.width()/2, Window.height(), Window.width(),(int) (Window.height()/2.5+6) );
			//(Window.height()-(dino.y+dino.radius))*2
			Window.out.color("Black");
			Window.out.line(0, Window.height()*3/4+dino.radius, Window.width(), Window.height()*3/4+dino.radius);
			dino.draw();
			dino.jump();
			obs.draw();
			obs.move();
			Window.out.color("Black");
			Window.out.font("arial black", 30);
			Window.out.print("Score: "+dino.score, (int) (Window.width()/8), Window.height()/10);
			Window.out.font("arial black", 50);

			Window.out.print("Lives: "+dino.lives, (int) (Window.width()/2.3), Window.height()/10);
			if(dino.crash(obs)==true) {
				dino.lives--;
				obs.x=Window.width()-50;
				obs.y=Window.height()*3/4-15;
				obs.height=Window.random(30, 150);
				obs.dx=Window.random(20, 40);
			}
			if(dino.crash(obs)==false) {
				dino.score=dino.score+50;
			}

			if(dino.lives==0) {
				break;
			}
			Window.frame();

		}
		obs.gameOver(dino);

	}

}
