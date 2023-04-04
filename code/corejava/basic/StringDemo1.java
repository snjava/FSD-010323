public class StringDemo1
{
	public static void main(String arr[])
	{
		String s1 = new String("Hello Java");  	// Heap Memory (String@11A)
		String s2 = "Hello Java";						// String constant Pool (SCP) (String@12B)
		String s3 = "Hello Java";
		String s4 = new String("Hello Java");  	

		System.out.println(s1);	// Hello Java
		System.out.println(s2);	// Hello Java
		System.out.println(s1 == s2); // false
		System.out.println(s2 == s3); // true
		System.out.println(s4 == s2); // false
		System.out.println(s2 == "Hello Java"); // true
		System.out.println(s1 == "Hello Java"); // false


	}
}