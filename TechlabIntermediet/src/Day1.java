import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {

		/*
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
		 */
		/*

		//Sum Of Squares
		int num;
		int end;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Insert Number");
		num=myScanner.nextInt();
		end=sumOfSquare(num);
		System.out.println(end);
		 */
		/*
		//Square Of sums
		int num;
		int end;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Insert Number");
		num=myScanner.nextInt();
		end=SquareofSums(num);
		System.out.println(end);
		 */
		/*

		//difference in the other two
		int num;
		int squareofsums;
		int sumofsquares;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Insert Number");
		num=myScanner.nextInt();
		squareofsums=SquareofSums(num);
		sumofsquares=sumOfSquare(num);
		System.out.println(sumofsquares-squareofsums);
		 */
		/*
		//Square Of sums
		int num;
		int end;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Insert Number");
		num=myScanner.nextInt();
		end=primenumberthing(num);
		System.out.println(end);
		 */

	}

	private static int primenumberthing(int num) {
		int count=2;
		int end=0;
		while(count<num) {
			boolean isPrime =true;
			int primecount=2;
			while(primecount<count) {
				if (count%primecount==0) {
					isPrime=false;
					break;
				}
				primecount++;		
			}			
			if(isPrime) {
				end=end+count;
			}		
			count++;
		}
		return end;
	}




	public static int SquareofSums(int num) {
		int count=1;
		int end=0;
		while(count<=num) {
			end=end+count;
			count++;
		}
		end=end*end;

		return end;
	}



	public static int sumOfSquare(int num) {
		int count=1;
		int end=0;
		while(count<=num) {
			end=end+count*count;
			count++;
		}

		return end;
	}
}