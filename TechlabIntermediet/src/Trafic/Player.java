package Trafic;
import apcs.*;
public class Player {
	public int x;
	public int y;
	public int radius;
	public String color;
	public int lives =3;
	public Player(int x,int y,int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void draw() {
		Window.out.color("White");
		Window.out.circle(x, y, radius);
		Window.out.color("Black");
		Window.out.circle(x-40,y-20,radius/4);
		Window.out.circle(x+40, y-20, radius/4);
		Window.out.rectangle(x, y+20, 30, 5);
	}
	public void move() {
		if(Window.key.pressed("left")) {
			if(x==300||x==500) {
				x=x-200;
			}

		}
		if(Window.key.pressed("right")) {
			if(x==300||x==100) {
				x=x+200;


			}
		}
	}
	public void crash(Cars car) {
		if(car.y+(car.length/2)>y-radius&&car.x==x) {
			x=Window.width()/2;
			car.y=-150;
			lives--;
		}
	}
	

}

