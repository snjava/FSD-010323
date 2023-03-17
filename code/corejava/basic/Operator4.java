public class Operator4 {
	public static void main(String args[])
	{
		int a = 10;
		int b = 12;
		
		System.out.println(a & b);			// 8
		System.out.println(a>1 & a<20);	// true	
		System.out.println(a | b);			// 14
		System.out.println(a>1 | a<20);	// true
		System.out.println(!(a<15));			// false

		int x = 10;
		int y = 20;

		System.out.println(x<50 && x>20); // false
		System.out.println(x<50 || x>20); // true
	}
}

/*
a & b => 10 & 12
	
	1 0 1 0
&	1 1 0 0
-------------- 
   1 0 0 0  => 8
======================
a | b => 10 | 12
	
	1 0 1 0
|	1 1 0 0
-------------- 
   1 1 1 0  => 14

*/