import java.util.Scanner;

public class ExceptionIntro {
	public static void main(String[] args) {
		System.out.println("Execution Start....");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st Number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd Number : ");
		int num2 = scan.nextInt();
		
		System.out.println("Add : " + (num1+num2));
		
		try {
			System.out.println("Div : " + (num1/num2));
		} 
		catch(ArithmeticException ex) {
			System.out.println("Cannot Divide number by 0");
		}
		System.out.println("Mul : " + (num1*num2));
		System.out.println("Sub : " + (num1-num2));
		
		scan.close();
		
		System.out.println("Execution Completed....");
	}
}
