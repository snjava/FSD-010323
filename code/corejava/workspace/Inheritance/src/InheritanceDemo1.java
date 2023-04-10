public class InheritanceDemo1 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1.toString());
		e1.setEmpData(121, "Xyz", "Pune");
		e1.printEmpData();
		
		System.out.println("===================");
		SoftwareDeveloper sfDev = new SoftwareDeveloper();
		sfDev.setDevData(111, "Demo1", "Delhi", "Corejava, Spring, Angular");
		sfDev.printDevData();	
		
		Person p = new Doctor(); // Polymorphic object
	}
}

class Person extends Object {
	String name;
	String address;
	public void setPersonData(String n, String a) {
		name = n;
		address = a;
	}
}
// Employee IS-A Person
class Employee extends Person {
	int id;
	public void setEmpData(int i, String n, String a) {
		id = i;
		setPersonData(n, a);
	}
	public void printEmpData() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}

// SoftwareDeveloper IS-A Employee 
class SoftwareDeveloper extends Employee {
	String technology;
	public void setDevData(int id, String name, String add, String tech) {
		technology = tech;
		setEmpData(id, name, add);
	}
	
	public void printDevData() {
		printEmpData();
		System.out.println("Technologies : " + technology);
	}
}
//Doctor IS-A Person
class Doctor extends Person {
	String licenceNo;
	public void setDocDetails(String licence, String name, String add) {
		licenceNo = licence;
		setPersonData(name, add);
	}
	public void printDocData() {
		System.out.println("Licence Nuber : " + licenceNo);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}











