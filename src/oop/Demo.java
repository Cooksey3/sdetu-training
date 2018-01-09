package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(name + " is eating.");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping.");
	}
}

public class Demo {

	public static void main(String[] args) {
		//Instaintiating an object (creating an instance of the object)
		Person person1 = new Person();
		
		//Define some properties (like, "Person 1's name is 'Joe'")
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "123098123";
		
		//Abstraction: Only want the elements that are necessary (like, we might not care about walking right now).
		//Abstraction allows us to get only the parts of an object that we want
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();

	}

}
