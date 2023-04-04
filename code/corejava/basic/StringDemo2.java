public class StringDemo2
{
	public static void main(String a[])
	{
		String s1 = "       Hello Java ";
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s1.trim());
		
		String s2 = "Welcome to String";		
		System.out.println(s2);
		String s3 = s2.toLowerCase();
		System.out.println(s2);
		System.out.println(s3);


		String s4 = "demo";
		String s5 = new String("DEMO");
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));

		String s6 = "String in Java";
		System.out.println(s6.indexOf('i'));
		System.out.println(s6.charAt(5));
		System.out.println(s6.substring(0,6));

		String s7 = "profile.docx";
		System.out.println(s7.endsWith(".pdf"));
		System.out.println(s7.startsWith("profile"));

		String s8 = "c:\\users\\";

		System.out.println(s8.concat(s7));	
		System.out.println(s8+s7);	

		String s9 = "Abc-12.30-10";
		String[] arr = s9.split("-");
		for(String val : arr) {
			System.out.println(val);
		}

		char ch[] = s9.toCharArray();
		for(char val : ch) {
			System.out.println(val);
		}
	}
}














