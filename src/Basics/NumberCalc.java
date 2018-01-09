package Basics;

public class NumberCalc {

	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumber(numA, numB);
		int product = multiplyNumber(numA, numB);
		System.out.println("The product of " + numA + " and " + numB + " is " + multiplyNumber(numA, numB));
		System.out.println("The product of " + numA + " and " + numB + " is " + product);
		
}
	
	static void printName() {
		System.out.println("My name is Chris.");
	}

	static void addNumber(int numberA, int numberB) {
		//this function adds two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumber(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumber(product, product);
		return product;
	}
}
