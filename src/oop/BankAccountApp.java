package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//Creating a new bank account >> instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		acc1.setName("Chris Cooksey");
		acc1.setSsn("12093912");
		System.out.println(acc1.getName());
		System.out.println(acc1.getSsn());
		
		acc1.accountNumber = "01689453";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(4000);
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "01689454";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "01689455";
			
		/*
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Juan Pablo";
		cd1.accountType = "CD Account";
		cd1.interestRate = 4.5;
		System.out.println(cd1.toString());
		cd1.compound();
	*/
	}

}