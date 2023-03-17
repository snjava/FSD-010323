public class VariableDemo2 {
	public static void main(String args[])
	{
		long x = 123456789L;
		float pi = 3.14f;
		char ch1 = 'A';
		char ch2 = '@';
		char ch3 = 66;

		System.out.println(x);
		System.out.println(pi);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);

		byte a = 10;
		int b = a;
		System.out.println(b);

		int y = 130;
		byte z = (byte) y;
		System.out.println(z);
	}
}