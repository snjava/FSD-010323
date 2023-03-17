public class Operator2 {
	public static void main(String args[])
	{
		int a = 10;
		
		// Pre Increment (Increment, update the value, assign value)
		++a;  // a = a + 1;  and a += 1;
		System.out.println(a); // 11

		// Post Increment	(Assign Value, Increment, Update the value)
		a++;
		System.out.println(a); // 12

		int b = 5;
		System.out.println(++b); // 6
		System.out.println(b++); // 6
		System.out.println(b); 	// 7

		int c = 11;
		int d = c--;
		System.out.println(d); 		// 11
		System.out.println(--c); 	// 9
	}
}