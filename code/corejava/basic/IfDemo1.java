/*
Create a varaible percent
and print the followin output
if Percent is >40 then print "You are Pass"
	if percent between 75-100 then print "Dist" 
	if percent between 60-75 then print "1st Class"
	if percent between 50-60 then print "2nd Class"
	if percent between 40-50 then print "Pass Class"	
if Percent is <40 then print "Sorry.. You are Fail" 
*/

public class IfDemo1 {
	public static void main(String ar[])	
	{
		double percent = 46.66;
		if(percent>=40 && percent<=100) 
		{
			System.out.println("Congrats..You are Pass.");

			if(percent>=75) {
				System.out.println("You got Dist...");
			} 
			else if(percent>=60 && percent<75) {
				System.out.println("You got 1st Class");
			}
			else if(percent>=50 && percent<60) {
				System.out.println("You got 2nd Class");
			}
			else {
				System.out.println("You got Pass Class");
			}
		}
		else if(percent>=0 && percent<40)
		{
				System.out.println("Sorry.. You are Fail");
		}
		else {
				System.out.println("Invalid Percent...!!!");
		}
	}
}