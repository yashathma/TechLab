
package Bank;
import java.util.Scanner;
public class BankDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount bankAccount= new BankAccount(1000,1234);
		System.out.println("Please eneter your pin:");
		int pin= scanner.nextInt();
		bankAccount.getBalance(pin);
		
		System.out.println("How much would you like to deposit?");
		int deposit=scanner.nextInt();
		bankAccount.deposit(pin,deposit);
		System.out.println("How much would you like to withdraw?");
		int withdraw=scanner.nextInt();

		bankAccount.withdraw(pin,withdraw);
		
	}
public static int isaPrime() {
	
	return 0;
}
}
