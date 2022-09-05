package Day8;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Which would you like to make: ");
		System.out.println("1. Checkings Account");
		System.out.println("2. Savings Account");
		System.out.println("3. Business Account");
		if(scanner.nextInt()==1) {
			System.out.println("Create a pin:");
			int pin=scanner.nextInt();
			CheckingAccount c= new CheckingAccount(pin,0.0);
			System.out.println("How much would you like to deposit:");
			double amount =scanner.nextDouble();
			c.deposit(pin, amount);
			System.out.println("Would you like to withdraw money from your checking account? (type 0 for Yes or 1 for No)");
			int s=scanner.nextInt();
			if(s==0) {
				System.out.println("How much would you like to withdraw?");
				int withdrawamount=scanner.nextInt();
				c.withdraw(pin, withdrawamount);
				System.out.println("Thanks for coming!");
			}else if(s==1){
				System.out.println("Thanks for coming!");
			}
		}
		if(scanner.nextInt()==2) {
			System.out.println("Create a pin:");
			int pin=scanner.nextInt();
			SavingsAccount s= new SavingsAccount(pin,0.0);
			System.out.println("How much would you like to deposit:");
			double amount =scanner.nextDouble();
			s.deposit(pin, amount);
			System.out.println("Would you like to withdraw money from your Savings account? (type 0 for Yes or 1 for No)");
			int u=scanner.nextInt();
			if(u==0) {
				System.out.println("How much would you like to withdraw?");
				int withdrawamount=scanner.nextInt();
				s.withdraw(pin, withdrawamount);
				System.out.println("Thanks for coming!");
			}else if(u==1){
				System.out.println("Thanks for coming!");
			}
		}
		if(scanner.nextInt()==3) {
			System.out.println("Create a pin:");
			int pin=scanner.nextInt();
			BusinessAccount b= new BusinessAccount(pin,0.0);
			System.out.println("How much would you like to deposit:");
			double amount =scanner.nextDouble();
			b.deposit(pin, amount);
			System.out.println("Would you like to withdraw money from your Business account? (type 0 for Yes or 1 for No)");
			int a=scanner.nextInt();
			if(a==0) {
				System.out.println("How much would you like to withdraw?");
				int withdrawamount=scanner.nextInt();
				b.withdraw(pin, withdrawamount);
				System.out.println("Thanks for coming!");
			}else if(a==1){
				System.out.println("Thanks for coming!");
			}
		}

	}

}
