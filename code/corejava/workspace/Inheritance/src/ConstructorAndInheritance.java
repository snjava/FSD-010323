public class ConstructorAndInheritance {
	public static void main(String[] args) {
		C2 obj = new C2(10);
	}
}

class C1 {
	public C1() {
		super();
		System.out.println("Class C1");
	}
	public C1(int a) {
		super();
		System.out.println("Class C1 - 1 param constrcutor");
	}
}

class C2 extends C1 {
	public C2() {
		super();
		System.out.println("Class C2");
	}
	public C2(int a) {
		super(121);
		System.out.println("Class C2 - 1 param constrcutor");
	}
}



