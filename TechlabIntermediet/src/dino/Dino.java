package dino;

import apcs.Window;
import apcs.Window.key;

public class Dino {
	public String color;
	public int x,y,radius,dy,jump=200;
	public int lives=3;
	public int score=0;

	public Dino(String color,int x,int y,int radius,int dy) {
		this.color=color;
		this.x=x;
		this.y=y;
		this.radius=radius;
		this.dy=dy;
	}
	public void draw() {
		Window.out.color(color);
		Window.out.circle(x, y, radius);
	}

	public void jump() {
		
		if (y+radius==Window.height()*3/4+radius) {
			if(key.pressed(" ")) {
				y-=jump;


			}

		}else {
			if (y<Window.height()*3/4) {
				y=y+10;
			}
		}
		
		/*
		//Bird
		 jump=50;
		if(key.pressed(" ")) {
			y-=jump;
		}else {
			y=y+10;
		}
		*/
		
	}
	
	
	
	public boolean crash(Obstacles obs) {
		if(x+radius>obs.x-(obs.width/2)&&x-radius<obs.x+(obs.width/2)) {
			if(y+radius>obs.y-(obs.height)/2) {
				return true;
			}
		}

		return false;
	}

}


