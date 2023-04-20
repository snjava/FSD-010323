import java.util.Scanner;

public class ThrowDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter User Name : ");
		String name = scan.next();
		
		if(name.length()<2) { // Scenario Identification
			throw new ArrayIndexOutOfBoundsException("Invalid Name...."); // create exception object and throw
		}
		
		System.out.println("Your Name is : " + name);
	}
}
