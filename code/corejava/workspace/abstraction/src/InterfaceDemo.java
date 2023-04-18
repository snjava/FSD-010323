
public class InterfaceDemo {
	public static void main(String[] args) {
		Inter obj = new Demo();
	}
}

interface Inter {
	int a = 10;	// public static final int a = 10;
	void m1();	// public abstract void m1();
}

interface Inter2 {
	int b = 20;
	void m2();
}
// Multiple inheritance
interface Inter3 extends Inter, Inter2 {
	int c = 20;
	void m3();
}

// can implements more than one interface on class
abstract class Test implements Inter, Inter2 {
	
}

// can extends one class and at the same time can implements the interface.
class Demo extends Test implements Inter {
	public void m1() {
		System.out.println("m1 from Demo class...");
	}
	public void m2() {
		System.out.println("m2 from Demo class...");
	}
}










