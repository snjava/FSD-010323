/*
   	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
*/
public class NestedLoop
{
	public static void main(String ar[])
	{
		for(int i=1 ; i<=3 ; i++)   // Row
		{
			for(int j=1 ; j<=5 ; j++)   //  column
			{
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}