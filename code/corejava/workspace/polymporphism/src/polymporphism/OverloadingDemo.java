package polymporphism;

public class OverloadingDemo {
	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(2.3, 5.4);
	}
	
	public static void main(int[] args) {
		
	}
}

class Addition {
	public final void add(int a, int b) {
		int ans = a + b;
		System.out.println("Add of 2 int : " + ans);
	}
	
	protected static int add(int a, int b, int c) {
		int ans = a + b + c;
		System.out.println("Add of 3 int : " + ans);
		return ans;
	}
	
	void add(double a, double b) {
		double ans = a + b;
		System.out.println("Add of 2 double : " + ans);
	}
	
	public void add(String a, String b) {
		String ans = a + b;
		System.out.println("Add of 2 String : " + ans);
	}
	
	public void add (String a , int b) {
		
	}
	
	public void add (int a , String b) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}