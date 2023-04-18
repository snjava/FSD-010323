
public class Jdk8Interface {
	public static void main(String[] args) {
	
	}
}

@FunctionalInterface
interface I1 {
	public void m1();
	public default void m2() {
		System.out.println("This is implemented method of interface");
	}
	public static void m3() {
		System.out.println("This is static implemented method of interface");
	}
}
