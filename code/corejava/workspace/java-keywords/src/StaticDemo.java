
public class StaticDemo {
	public static void main(String[] args) {
		System.out.println(AudiCar.companyName);
		AudiCar.logo();
	}
}

final class AudiCar {
	final static String companyName = "Audi";
	int a = 10;

	public final static void logo() {
		final int b = 10;
		System.out.println("Brand is Audi");
		System.out.println(companyName);
	}
}
/*
class Demo extends AudiCar {
	
}
*/