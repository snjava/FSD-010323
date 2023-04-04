public class StringBuilderDemo
{
	public static void main(String a[])
	{
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb); // Hello
		sb.append(" Java");
		System.out.println(sb); // Hello Java
		sb.insert(5, " welcome");
		System.out.println(sb); // Hello welcome Java
		sb.insert(0, "Hi ");
		System.out.println(sb); // Hi Hello welcome Java
		
	}
}