package Trafic;

import apcs.Window;

public class Cars {
	public int x;
	public int y;
	public int dy;
	public String color;
	public int width;
	public int length;
	public int randomLane;
	public Cars(int y,int dy,String color,int width,int length,int randomLane) {
		this.x=randomLane;
		this.y=y;
		this.dy=dy;
		this.color=color;
		this.width=width;
		this.length=length;
		this.randomLane=randomLane;
	}
	public void draw() {
		Window.out.color(color);
		if (randomLane==1) {
			x=Window.width()/6;
			Window.out.rectangle(x, y, width, length);
			Window.out.color("Black");
			Window.out.rectangle(x+(width/2)+5, y+40, width/5, length/5);
			Window.out.rectangle(x+(width/2)+5, y-40, width/5, length/5);
			Window.out.rectangle(x-(width/2)-5, y-40, width/5, length/5);
			Window.out.rectangle(x-(width/2)-5, y+40, width/5, length/5);


		}else if(randomLane==2) {
			x=Window.width()/2;
			Window.out.rectangle(x, y, width, length);
			Window.out.color("Black");
			Window.out.rectangle(x+(width/2)+5, y+40, width/5, length/5);
			Window.out.rectangle(x+(width/2)+5, y-40, width/5, length/5);
			Window.out.rectangle(x-(width/2)-5, y-40, width/5, length/5);
			Window.out.rectangle(x-(width/2)-5, y+40, width/5, length/5);

		}else if (randomLane==3) {
			x=Window.width()*5/6;
			Window.out.rectangle(x, y, width, length);
			Window.out.color("Black");
			Window.out.rectangle(x+(width/2)+5, y+40, width/5, length/5);
			Window.out.rectangle(x+(width/2)+5, y-40, width/5, length/5);
			Window.out.rectangle(x-(width/2)-5, y-40, width/5, length/5);
			Window.out.rectangle(x-(width/2)-5, y+40, width/5, length/5);

		}
	}
	public void move() {
	
		
		if (y-(length/2)<Window.height()) {
			y=y+dy;
		}else {
			randomLane=Window.random(1, 3);
			y=-150;
			dy=dy+5;
		}
		
	}
}
