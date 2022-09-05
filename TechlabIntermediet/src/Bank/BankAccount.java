package Bank;

public class BankAccount {
	private double balance;
	private int pin;
	public static double OverDraw_Penalty=20.0;

	public BankAccount(double balance,int pin) {
		this.balance=balance;
		this.pin=pin;
	}
	public void getBalance(int enteredPin) {
		if(checkPin(pin)==true) {
			System.out.println("Your balance is $"+balance);

		}else if(checkPin(pin)==false) {
			System.out.println("You have entered the wrong pin");

		}

	}
	public void deposit(int pin,double amount) {
		if(checkPin(pin)==true) {
			balance=balance+amount;
			System.out.println("Your new balance is $"+balance);
		}else {
			System.out.println("Wrong Pin Entered");
		}
	}
	public void deposit(int pin,int amount) {
		if(checkPin(pin)==true) {
			balance=balance+amount;
			System.out.println("Your new balance is $"+balance);
		}else {
			System.out.println("Wrong Pin Entered");
		}
	}
	public void withdraw(int pin,double amount) {
		if (checkPin(pin)==true) {
			if(balance<amount) {
				balance=balance-OverDraw_Penalty;
				System.out.println("You have withdrawn too much");
			}else {
				balance=balance-amount;
				System.out.println("Your new balance is $"+balance);
			}
		}
	}
	private boolean checkPin(int pin) {
		if (this.pin==pin) {
			return true;
		}else return false;

	}











}
