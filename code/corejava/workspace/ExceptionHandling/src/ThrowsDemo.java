import java.util.Scanner;

public class ThrowsDemo {
	public static void main(String[] args) {
		ThrowsDemo demo = new ThrowsDemo();
		try {
			int value = demo.getAge();
			System.out.println("Your Age is : " + value);
		} catch(InvalidAgeException ex) {
			ex.printStackTrace();
		}
	}
	
	public int getAge() throws InvalidAgeException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = scan.nextInt();
		if(!(age>=1 && age<=120)) {
			throw new InvalidAgeException("Invalid Age provided....");
		}
		return age;
	}
}
