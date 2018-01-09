package Basics;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Adding: " + adding(100));
		System.out.println("Factorial: " + fact(10));
	}
	
	public static int adding (int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return (x + adding(x-1));
		}
	}
	
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		} else {
			return (n * fact(n-1));
		}
	}	
}