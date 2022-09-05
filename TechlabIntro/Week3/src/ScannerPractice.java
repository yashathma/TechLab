import java.util.Scanner;
import apcs.Window;
public class ScannerPractice {
	public static void main(String[] args) {
		/*
		//-----Creating------
		Scanner myScanner = new Scanner(System.in);
		//-------------------
		
		//-----Using---------
		System.out.println("Write your name:");
		String name=myScanner.nextLine();
		
		System.out.println("Enter your age");
		int myAge=myScanner.nextInt();
		System.out.println("Hello, "+name+", I am "+myAge+" years old too. What's up?");
		
		//-------------------
		 
	Scanner myScanner = new Scanner(System.in);
	
	
	System.out.println("Write the radius:");
	int Radius=myScanner.nextInt();
	Window.size(500, 500);
	Window.out.circle(250, 250, Radius);
	
		
	Scanner myScanner = new Scanner(System.in);
	System.out.println("Write the Height of Wall in feet:");
	int Height=myScanner.nextInt();
	System.out.println("Write the Width of Wall in feet:");
	int Width=myScanner.nextInt();
	System.out.println("The area of your room is "+ Height*Width*4);
	/*
	Scanner myScanner = new Scanner(System.in);
	int GoodNumber=44;
		
	System.out.println("Guess my number between 1 and 100!");
		int FirstGuess=myScanner.nextInt();
		if (FirstGuess==GoodNumber) {
			System.out.println("Good Job you got it!");

		} else if(FirstGuess>GoodNumber) {
			System.out.println("You are too high");

		}else if(FirstGuess<GoodNumber) {
			System.out.println("You are too low");
		}
		*/
		System.out.println("Hi my name is ebo, whats your name?");
		Scanner myScanner = new Scanner(System.in);
		String name=myScanner.nextLine();
		System.out.println("What's up, "+name);
		String feeling = myScanner.nextLine();
		
		
	}}