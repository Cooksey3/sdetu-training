package Basics;

public class Testing {

	public static void main(String[] args) {
		int[] numbers = {3, 4, 1, 2, 100, 3, 3, 1, 3, 4, 5, 2, 3, 5, 6, 3, 4};
		System.out.println("Mode 3: " + findMode(numbers));

	}

//	public static int findMode(int[] arr) {
		
		
	public static int findMode(int[] arr) {
		int mode = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == mode) {
				mode++;
			}
		}
		return mode;
	}
}
