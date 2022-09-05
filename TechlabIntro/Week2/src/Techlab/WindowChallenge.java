package Techlab;
import apcs.Window;
public class WindowChallenge {
	public static void main(String[] args) {
		
		
		int y=500;
		int x=y/4;
		//Putting in the setting
		Window.size(y,y);
		//Color Red
		Window.out.color("red");
		//Top left circle
		Window.out.circle(x, x, x);
		//Color Blue
		Window.out.color("Blue");
		//Bottom left circle
		Window.out.circle(x, x*3, x);
		//Color Orange
		Window.out.color("Orange");
		//Top right circle
		Window.out.circle(x*3, x, x);
		//Color yellow
		Window.out.color("Green");
		//Bottom right circle
		Window.out.circle(x*3, x*3, x);

		
		
		int yash=9;
		int kartage=12;
		String person1="Yash";
		int Karthik=7;
		String person2="Karthik";
		int two=2;
		
		//System.out.println(myage+kartage);
		System.out.println("Name"+"\t"+"Grade");
		System.out.println(person1+"\t"+yash);
		System.out.println(person2+"\t"+Karthik);
		System.out.println(two/two);
		
		
		Window.size(500,500);
		
				
		
		
	}
}
