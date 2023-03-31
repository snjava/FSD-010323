public class BasicCalculator
{
	public static void main(String ar[])
	{
		System.out.println("Started");
		BasicCalculator cal = new BasicCalculator();
		cal.add();
		cal.sub(11,22);
		cal.div();
		int ans = cal.mul(22, 5);
		System.out.println(ans);
		System.out.println("End");
	}

	// create a method to add 2 numbers and print the addition result.
	public void add()
	{
		int a = 10;
		int b = 20;
		int result = a + b;
		System.out.println(result);
	}
	
	//create a method which accept 2 int number perform the sub. on those number and print result
	protected void sub(int a, int b)
	{
		int result = a - b;
		System.out.println(result);
		return;
	}	
	
	// create a method which will perform the division of 2 number and return the result.
	public double div()
	{
		double a = 10;
		double b = 4;
		double result = a / b;
		return result;
	}
	
	// create a method which will accept 2 number perform the multiplication and return result
	public int mul(int x , int y)
	{
		return x * y;
	}

}










