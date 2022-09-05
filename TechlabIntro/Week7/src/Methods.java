import java.util.Scanner;
public class Methods {

	public static void main(String[] args) {
		/*
		int n;
Scanner myScanner=new Scanner(System.in);
n=myScanner.nextInt();
System.out.println(squareNumber(n));
		*/
		
		
		Scanner myScanner=new Scanner(System.in);
		int number=myScanner.nextInt();
		
	    int result = squareofsums(number);
	    System.out.println(result);
	}



	//squares number, gives back result
	public static int squareNumber(int PersonNumber) {
		
		     
		
		int result=PersonNumber*PersonNumber;
		
		return(result);
		
	}

	public static int squareofsums(int number) {
		int i=0;
		int sum=0;
		for (i=1; i<=number;i++) {
			sum = sum+squareNumber(i);
		}
		
		
		return(sum);
		
	}
}

	

