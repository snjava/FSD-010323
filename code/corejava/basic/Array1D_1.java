public class Array1D_1
{
	public static void main(String args[])
	{
		int arr[] = {12,43,34,75,658,234,457,679,43,43,7};

		System.out.println(arr.length);
		int lastIndex = arr.length - 1;
		System.out.println(lastIndex);
		System.out.println("=====ForLoop=====");
		for(int i =0 ; i <= arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("=====EnhanceForLoop=====");
		for(int val : arr)
		{
			System.out.println(val);
		}
	}
}