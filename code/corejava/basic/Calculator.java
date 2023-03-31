public class Calculator
{
	public static void main(String ar[])
	{
		System.out.println("Main Methods Started...");
		Calculator cal; // reference Varaible
		cal = new Calculator(); // Object
		int result = cal.findAge(2002); // calling method using object
		System.out.println(result);
		System.out.println("Main Methods Ends...");
	}
	
	// get the birth year, calculate the age and return the age
	public int findAge(int byear)
	{
		System.out.println("Calculating the Age...");
		int cyear = 2023;
		int age = cyear - byear;
		return age;
	} 

	
}
