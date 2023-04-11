
public class ThisDemo {
	public static void main(String[] args) {
		Employee emp = new Employee(121, "Abc Pvt.Ltd.");
		emp.print();
	}
}

class Person {
	int id = 500;
	String name;
	String city;
	public Person() {
		name = "NA";
		city="NA";
	}
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
}
class Employee extends Person {
	int id;
	String companyName;
	Employee(int id) {
		this.id = id;
	}
	public Employee(int id, String companyName) {
		this(id);
		this.companyName = companyName;
	}
	public void print() {
		int id = 111; 
		System.out.println("ID : " + this.id);
		System.out.println("Id " + super.id);
	}
	
	
	
}

















