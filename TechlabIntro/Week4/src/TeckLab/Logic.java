package TeckLab;
import java.util.Scanner;
public class Logic {

	public static void main(String[] args) {
		/*
	Scanner myscanner = new Scanner(System.in);
	
	

	System.out.println("Pick a number between 5 and 15");
	int a= myscanner.nextInt();
    int b=myscanner.nextInt();
    if (a==10||b==10) {
    System.out.println("Yay");
    } else if(a+b==10) {
    	System.out.println("yay");
    }

		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Write a number:");
		int a= myscanner.nextInt();
		if (a%2==1) {
			System.out.println("Odd");
		} else if (a%2==0) {
			System.out.println("Even");
		}

		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Pick a number:");
		int guess= myscanner.nextInt();
		if (100<=guess&&guess<=200) {
			System.out.println("Yay");
		} else if (guess>200||guess<100) {
			System.out.println("Nope");
		}
*/
		Scanner myScanner = new Scanner(System.in);
		
		int GoodNumber=44;
		int FirstGuess=0;
		int tries=0;
while(FirstGuess!=GoodNumber) {
	System.out.println("Guess my number between 1 and 100!");
	FirstGuess=myScanner.nextInt();
	if (FirstGuess==GoodNumber) {
		System.out.println("Good Job you got it!");
	} else if(FirstGuess>GoodNumber) {
		System.out.println("You are too high");

	}else if(FirstGuess<GoodNumber) {
		System.out.println("You are too low");
	}
}
/*
		int count=0;
		while (count!=10) {
			System.out.println("TechLab Rocks!");
			count++;
		}

		
		
		int count=1;
		int number=0;
		while (count!=100+1) {
			number=number+count;
			count++;
		}
		System.out.println(number);
*/











	}

}
