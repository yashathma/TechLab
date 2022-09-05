package Day8;

public abstract class Account {
	private int pin;
	private double balance;
	private int OverDraw_Penalty=20;

	public Account(int pin, double balance){
		this.pin=pin;
		this.balance=balance;
	}
	public void deposit(int pin,double amount) {
		if(checkPin(pin)==true) {
			balance=balance+amount;
			System.out.println("Your new balance is $"+balance);
		}else {
			System.out.println("Wrong Pin Entered");
		}
	}

	private boolean checkPin(int pin) {
		if (this.pin==pin) {
			return true;
		}else return false;

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
}