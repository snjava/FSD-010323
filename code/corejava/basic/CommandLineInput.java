public class CommandLineInput
{
	public static void main(String arg[])
	{
		System.out.println("Command Line Argument Demo");
		System.out.println(arg[0]);
		int num1 = Integer.parseInt(arg[1]);
		int num2 = Integer.parseInt(arg[2]);
		System.out.println(num1 + num2);
	}
}