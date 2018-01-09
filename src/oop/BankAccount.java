package oop;

public class BankAccount implements IRate {
	//Define variables on top
	String accountNumber;

	//Static >> belongs to the CLASS not the object instance
	//final >> constant (often goes "static final"). It's the final declaration of that variable
	private static final String routingNumber = "398123";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definitions: Unique methods
		//1. They are used to define/setup/initialize properties of an object
		//2. Constructors are implicitly called upon instantiation. We never call a "constructor" method. It's called automatically
		//3. It has the same name as the class itself
		//4. No return type at all (no void, string etc...)
	BankAccount() {
		System.out.println("New account created!");
	}
	//Overloading: Call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("New account: Checking Account");
	}
	BankAccount(String accountType, double initDeposit) {
		System.out.println("New account: " + accountType);
		System.out.println("Amount: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: Initial deposit not greater than $1000";
		} else {
			Msg = "Thank you for your deposit of ";
		}
		System.out.println(Msg + initDeposit);
		balance = balance + initDeposit;
	}
	
	//Getters / Setters
	
	//Allow user to define the name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	public void increaseRate(){
		System.out.println("Increasing Rate");
	}
	
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION" + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	//Define methods
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ", " + "ACCOUNT#:" + accountNumber + ", " + "ROUTING#" + routingNumber + ", " + "BALANCE: $" + balance + " ]";
	}
	
}