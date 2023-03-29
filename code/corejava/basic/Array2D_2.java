public class Array2D_2
{
	public static void main(String a[])
	{
		double marks[][] = {	{76.87,67,45,78},
									{76,78.78,67,87},
									{87.67,67,87,98} };
	
		System.out.println(marks.length); // return the number of rows	
		System.out.println(marks[1].length); // return the number of columns from 1st row	

		System.out.println("=========================");
		for(int r = 0; r<marks.length ; r++) {
			double sum = 0.0;
			for(int c = 0; c<marks[r].length ; c++) {
				System.out.print(marks[r][c] + "\t");
				sum=sum + marks[r][c];
			}
			double percent = (sum/400)*100;
			System.out.print(" = "+ percent);
			System.out.println();
		}

		System.out.println("=========================");
		for(double val[] : marks) {	// Row
			double sum = 0.0;
			for(double data : val) {  // Column
				System.out.print(data + "\t");
				sum=sum + data;
			}
			double percent = (sum/400)*100;
			System.out.print(" = "+ percent);
			System.out.println();
		}
	}
}








