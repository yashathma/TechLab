package dino;

import apcs.Window;

public class Obstacles {
	public String color;
	public int x;
	public int y;
	public int dx;
	public int width;
	public int height;
	public Obstacles(String color,int x,int y,int dx,int width,int height) {
		this.color=color;
		this.x=x;
		this.y=y;
		this.width=width; 
		this.height=height;
		this.dx=dx;
	}
	public void draw() {
		Window.out.color(color);
		Window.out.rectangle(x, y, width, height);
	}
	public void move() {
		x=x-dx;
		if (x-width<0) {
			x=Window.width()-50;
			y=Window.height()*3/4-15;
			height=Window.random(30, 150);
			dx=Window.random(20, 40);

		}
	}
	public static void gameOver(Dino dino) {
		while(true) {
			Window.out.background("Light blue");
			Window.out.font("arial black", 100);
			Window.out.color("dark green");
			Window.out.rectangle(Window.width()/2, (int) (Window.height()/3.5), 700, 30);
			Window.out.rectangle(Window.width()/2, (int) (Window.height()*0.6), 700, 30);
			Window.out.print("GAME OVER", Window.width()/2-340, Window.height()/2-10);
			Window.out.color("Black");
			Window.out.font("arial black", 30);
			Window.out.print("Score: "+dino.score, (int) (Window.width()/2)-100, Window.height()*3/4);
			Window.frame(400);



			Window.out.background("Dark green");
			Window.out.font("arial black", 100);
			Window.out.color("Light blue");
			Window.out.rectangle(Window.width()/2, (int) (Window.height()/3.5), 700, 30);
			Window.out.rectangle(Window.width()/2, (int) (Window.height()*0.6), 700, 30);
			Window.out.print("GAME OVER", Window.width()/2-340, Window.height()/2-10);

			Window.out.color("Black");
			Window.out.font("arial black", 30);
			Window.out.print("Score: "+dino.score, (int) (Window.width()/2)-100, Window.height()*3/4);
			Window.frame(400);

		}


	}
}
