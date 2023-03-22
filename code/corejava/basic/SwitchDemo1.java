public class SwitchDemo1
{
	public static void main(String arr[])	
	{
		char ch = 'S';
		switch(ch)
		{
			case 'M':
				System.out.println("Monday");
				break;
			case 'S':
			case 's':
				System.out.println("Saturday or Sunday");
				break;				
			case 'T':
				System.out.println("Tuesday or Thursday");
				break;
			case 'W':
				System.out.println("Wednesday");
				break;
			case 'F':
				System.out.println("Friday");
				break;
			default:
				System.out.println("Invalid Day....");
		}			
	}
}
		