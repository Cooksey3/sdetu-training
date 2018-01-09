package Labs;

public class StudentDatabase {

	public static void main(String[] args) {
		Student stu1 = new Student("Chris", "3938271");
		Student stu2 = new Student("Charles", "1209384");
		Student stu3 = new Student("Frank", "8493920");
		
		stu1.enroll("Psychology 1111");
		stu1.enroll("English 1101");
		stu1.enroll("Biology 1102");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(1000);
		System.out.println(stu1.toString());
		
		}
	
}

class Student {
	private static int iD = 0;
	private String userId;
	private String name;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private String Email;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance;
	
	public Student(String name, String SSN) {
		iD++;
		this.name = name;
		this.SSN = SSN;
		setuserId();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	private void setEmail() {
		Email = name.toLowerCase() + "." + iD + "@university.com";
		System.out.println("Your email: " + Email);
	}
	
	private void setuserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max - min));
		randNum = randNum + 1000;
		userId = iD + "" + randNum + SSN.substring(3);
		System.out.println("Your User ID: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
		System.out.println("New balance: $" + balance);
	}

	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println("You are enrolled in: " + courses);
	}
	
	@Override
	public String toString() {
		return "[Name:" + name + "]\n[Courses: " + courses + "]\n[Balance: $" + balance + "]";
	}
}