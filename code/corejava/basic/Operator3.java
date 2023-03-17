public class Operator3 {
	public static void main(String args[])
	{
		int a = 10;
		int b = 12;
		int c = 10;
		boolean result = a > b;
		System.out.println(result); 	// false
		System.out.println(a>c);    	// false
		System.out.println(a>=c);	 	// true

		System.out.println(a<c);    	// false
		System.out.println(a<=c);	 	// true

		System.out.println(a == c);   // true
		System.out.println(a != c);	// false
	}
}