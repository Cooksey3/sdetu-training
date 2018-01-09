package Basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		System.out.println(fib(0)); //evaluates as 0
		System.out.println(fib(1)); //evaluates as 1
		System.out.println(fib(2)); //fib(1) + fib(0) = 1
		System.out.println(fib(3)); //fib(2) + fib(1) = 2
		System.out.println(fib(4)); //fib(3) + fib(2) = 3
		System.out.println(fib(5)); //fib(4) + fib(3) = 5
		System.out.println(fib(6)); //fib(5) + fib(4) = 8
		System.out.println(fib(7)); //fib(6) + fib(5) = 13
		System.out.println(fib(8)); //fib(7) + fib(6) = 21
		System.out.println(fib(9)); //fib(8) + fib(7) = 34
		System.out.println(fib(20)); //fib(9) + fib(8) = 55
	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} return (fib(n-1) + fib(n-2));
		//we do this so that we get the two previous fib numbers (1 & 2 less than our number)
	}
}
