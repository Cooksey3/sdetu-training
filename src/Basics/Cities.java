package Basics;

public class Cities {

	public static void main(String[] args) {
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities [0]);
		System.out.println(cities [1]);
		System.out.println(cities [2]);
		System.out.println(cities [3]);
				
		//declare the array
		String[] countries;
		//we've declared the array. The variable is a string variable (meaning it will have words).
		//The brackets tell us that the string is an array
		
		//define the array. This means we are putting meaning into our new array (the one we declared).
		countries = new String[3]; 
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[2]);
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		//Do loop enters look THEN tests condition
		int i = 0;
		do {
			System.out.println(states[i]);
			i++;
		} while (i < 5);
		//Our "Do" loop tests whether or not i < 5. If it is less than 5, THEN it enters the loop.
		//In this case, if i < 5, it enters the loop.
		
		System.out.println("*********");
		
		/*
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		*/
		
		//While look: Tests condition THEN enters look
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
			System.out.println("STATE FOUND!");
			stateFound = true;
			}
			n++;
		}
		//This one is a little more complex. We declared n = 0, and stateFound = false.
		//With our loop, we said, "As long as stateFound(false) is false(!, as in true), then enter the loop.
			//we need it to be true to enter the loop
		//Upon entering the loop, our program creates another string variable called "state"
			//This variable is equal to whatever String is found at position "n" in the "states" string.
			//Since "n" = 0 to start, it goes and finds "California" and prints it.
			//Then, it checks to see if the state that was retrieved is equal to "Texas"
		//If it isn't equal to "Texas, then it adds 1 to n (because of the ++), and checks the next state
		//If it IS equal to "Texas" then it prints out "State found!"
			//This changes stateFound from false to true.
			//This makes the loop end, because "!stateFound" becomes false.
		
		System.out.println("\nPrinting with for loop");
		//For loop: Best for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
	}

}