package Basics;

public class Weather {

	public static void main (String[] args) {
		//This program gives suggestions of what to wear based on the temperature
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt.");
		} else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's chilly. Wear a jacket and jeans.");
			System.out.println("Wear sun glasses");
		} else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day. Make sure to wear warmer clothes.");
		} else {
			System.out.println("It's cold. Stay inside.");
		}
		
		System.out.println("The program is ending.");
	}
	
}
