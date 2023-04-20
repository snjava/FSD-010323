import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		int arr[] = {34,6,7,0,2,560,23,0};
		
		try(Scanner scan = new Scanner(System.in);) { // try with resource (JDK 1.7)
			System.out.println("Enter 1st Index : ");
			int inx1 = scan.nextInt(); // E
			System.out.println("Enter 2nd Index : ");
			int inx2 = scan.nextInt(); // E
			
			int num1 = arr[inx1]; // E
			int num2 = arr[inx2]; // E
			
			System.out.println("Add : " + (num1+num2));
			System.out.println("Sub : " + (num1-num2));
			System.out.println("Div : " + (num1/num2)); // E
			System.out.println("Mul : " + (num1*num2));
		}
		catch(InputMismatchException ex) {
			System.out.println("Invalid Index Provided...");
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException ex) { // JDK 1.7 above
			System.out.println("Something went wrong.. Please try after sometime...");
		}
		catch(RuntimeException ex) {
			System.out.println("Something went wrong.. Please try after sometime...");
		}
		/*finally { // gives you a guarantee of execution and mostly used for resource closing activity.  
			scan.close();
		}*/
		
	}
}
