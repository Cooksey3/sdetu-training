package oop;

public class AccountApp {

	public static void main(String[] args) {
		Loan la = new Loan();
		la.increaseRate();
		la.setRate();
		la.setAmortSchedule();
		la.setTerm(20);
		
		IRate account1 = new Loan();
		account1.increaseRate();
		account1.setRate();

	}

}
