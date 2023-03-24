/*

  * * * * * * *	
	* * * * *
	  * * *
	    *
*/
public class StarPattern
{
	public static void main(String ar[])
	{
		int star = 7;
		for(int i=1 ; i<=4 ; i++)   // Row
		{
			for(int s=1 ; s<i ; s++)   //  column (Space)
			{
				System.out.print(" ");
			}
			for(int j=1 ; j<=star ; j++)   //  column (Star)
			{
				System.out.print("*");	
			}
			star-=2;
			System.out.println();
		}
	}
}