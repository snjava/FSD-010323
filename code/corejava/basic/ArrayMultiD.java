public class ArrayMultiD
{
	public static void main(String a[])
	{
		double price[][] = {
									{5675.56,8987,65},
									{45645.56, 675.43},
									{3452.23},
									{700,500,200, 123.34, 564.34}				
								};

		for(double p[] : price) {
			for(double val : p) {
				System.out.print(val + "\t");
			}
			System.out.println();
		}

	}
}