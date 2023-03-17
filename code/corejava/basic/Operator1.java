public class Operator1 {
	public static void main(String args[])
	{
		int a = 10;
		int b = 3;
		double c = 3;
		int ans = a + b;
		System.out.println(ans);    // 13
		System.out.println(a - b);  // 7
		System.out.println(a * b);  // 30
		System.out.println(a / b);  // 3
		System.out.println(a / c);  // 3.3333333333333335
		System.out.println(a % b);  // 1

		System.out.println("--Assignment Operator--");
		int x = 10;
		int y = 3;
		x += y; // x = x + y;
		System.out.println(x); // 13
		System.out.println(y); // 3
		
		x /= y; // x = x / y;  
		System.out.println(x); // 4
		System.out.println(y); // 3
	}
}