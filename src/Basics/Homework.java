package Basics;

public class Homework {

	public static void main(String[] args) {

		int[] numbers = {3, 4, 1, 2, 100, 3, 3, 1, 3, 4, 5, 2, 3, 5, 6, 3, 4};
		System.out.println("Mode 3: " + findMode(numbers));
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Average: " + findAvg(numbers));
	}

	public static int findMode(int[] arr) {
		int mode = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int counter = 0;
			if (arr[i] == 3); {
				counter++;
			}
		}
		return mode;
		}

	/*
	 * There's a couple statements we need:
	 * If a number doesn't appear, then no results show up
	 * If a number does appear, we need to add 1 to the total
	 * We don't want it to give us an answer for literally every instance in the string, just each number
	 * We need a variable to stand for each number
	 */

	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}	
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max ) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findAvg(int[] arr) {
		int avg = arr[0];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum / arr.length;
	}

	
}
