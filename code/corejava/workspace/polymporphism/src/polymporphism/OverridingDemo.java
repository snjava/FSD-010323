package polymporphism;
public class OverridingDemo {
	public static void main(String[] args) {
		SoftwareDev sd = new SoftwareDev();
		sd.intro();
	}
}

class A{
}
class B extends A{
}
class C extends B{
}
class D extends A{
}

class Person {
	A intro() {
		System.out.println("Hello, I am a Person.");
		return new A();
	}
}

class SoftwareDev extends Person {
	public C intro() {
		System.out.println("Hi, I am a Software Developer.");
		return new C();
	}
}

class Doctor extends Person {
	public D intro() {
		System.out.println("Hello, I am a Doctor..");
		return new D();
	}
}

