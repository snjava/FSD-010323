
public class SuperDemo {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.printDetails();
	}
}

class Test1 {
	int a = 10;
	public void m() {
		System.out.println("methods from Test1");
	}
}

class Test2 extends Test1 {
	int a = 20;
	public void m() {
		System.out.println("methods from Test2");
	}
	public void printDetails() {
		System.out.println(super.a);
		super.m();
	}
}
