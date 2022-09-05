import apcs.Window;

public class Animation {
	public static void main(String[] args) {

		int x = 300;
		int y = 300;
		int radius=80;
		int dx=7;
		int dy=7;
		
		Window.size(570, 570);

		while (true) {
			Window.frame();
			Window.out.background("Black");
			Window.out.color("Red");
			Window.out.square(x, y, radius);
			Window.out.color("White");
			Window.out.print("DVD", x-20, y+4);
			x = x + dx;
			y = y + dy;
			if (x>=600-radius || x<=radius) {
				dx =- dx;
			}
			if (y>=600-radius || y<=radius) {
				dy =- dy;
			}
			
		}
	
	

		
		
		
		
		
	}
}
