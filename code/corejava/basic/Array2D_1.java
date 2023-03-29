public class Array2D_1
{
	public static void main(String args[])
	{
		double studPercent[][];
		studPercent = new double[4][6];
		studPercent[1][4] = 89.98;
		studPercent[3][3] = 77.66;

		for(int r = 0 ; r<=3 ; r++)    // row
		{
			for(int c = 0 ; c<=5 ;c++)       // column
			{
				System.out.print(studPercent[r][c] + "\t");
			}
			System.out.println();
		}

	}
}