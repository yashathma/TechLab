package SpaceInvaders;
import apcs.Window;

public class Game {
	public static void main(String[] args) {
		Window.size(600, 800);
		SpaceShip ship=new SpaceShip(Window.width()/2, Window.height()-100, 30, "White");
		bullet bullet = null;
		while(true) {
			ship.draw();
			ship.move();
			
			if(bullet==null) {
			bullet=ship.shoot();
			}
			if(bullet!=null) {
				bullet.draw();
				bullet.move();
				if(bullet.inValid()) {
					bullet=null;
				}
			}
			 
			Window.frame();
		}




	}

}
