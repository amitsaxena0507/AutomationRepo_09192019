package oops.abstraction;

public class User {

	public static void main(String[] args) {
		RBI acc;
		
		acc= new PNB();
		acc.currentAccount();
		acc.savingAccount();
		acc.debitCard();
		acc.creditCard();

		acc= new SBI();
		acc.currentAccount();
		acc.savingAccount();
		acc.debitCard();
		acc.creditCard();

		acc= new Canara();
		acc.currentAccount();
		acc.savingAccount();
		acc.debitCard();
		acc.creditCard();

	}

}
