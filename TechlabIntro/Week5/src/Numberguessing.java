import java.util.Scanner;

public class Numberguessing {
public static void main(String[] args) {
	
	
	
	
	//Guessing Game
	
	Scanner myScanner = new Scanner(System.in);
	
	int FirstGuess=0;
	int tries=0;
	int random=(int)(Math.random()*100+1);
	System.out.println("Guess my number between 1 and 100! You have 10 tries!");
	
while(FirstGuess!=random&&tries<10) {
	tries=tries+1;
FirstGuess=myScanner.nextInt();
if (FirstGuess==random) {
	System.out.println("Good Job you got it! The winning number was "+random+"!");
} else if(FirstGuess>random) {
	System.out.println("You are too high");

}else if(FirstGuess<random) {
	System.out.println("You are too low");
	}
if (tries==1) {
	System.out.println("You have guessed "+tries+" time");
} else if(tries>1) {
	System.out.println("You have guessed "+tries+" times");
}
}

if (tries==10) {
	System.out.println("You suck GAME OVER");
}
if (tries==1){
	System.out.println("Woah lucky!");
}else if (tries>=2&&tries<=4) {
	System.out.println("Nice strats kid!");
}else if (tries>=5&&tries<=7) {
	System.out.println("Ok strats!");
} else if (tries>=8&&tries<=9) {
	System.out.println("Not good strats!");
}









}
}