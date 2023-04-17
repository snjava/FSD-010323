public class AbstractClassDemo {
	public static void main(String[] args) {
		Car car = new Fortuner();
		car.brand();
		car.fuelType();
		car.noOfWheels();
	}
}
abstract class Car {
	public Car() {
		System.out.println("Car class COnstructor..");
	}
	public abstract void brand();
	public abstract void fuelType();
	public static final void noOfWheels() {
		System.out.println("Car has 4 wheels..");
	}
}

class Fortuner extends Car {
	public void brand() {
		System.out.println("Brand : Toyota");
	}
	public void fuelType() {
		System.out.println("Fuel Type : Diesel");
	}
}