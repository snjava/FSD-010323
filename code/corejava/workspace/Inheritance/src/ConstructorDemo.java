public class ConstructorDemo {
	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.print();
		System.out.println("====================");
		Student stud2 = new Student(121, "Abc", "9988007812");
		stud2.print();
		
	}
}
class Student
{
	int id; // -1
	String name; // NA
	String contact; // NA
	public Student() { // no-param constructor 
		id = -1;
		name = "NA";
		contact = "NA";
	}
	public Student(int id, String name, String contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		this.contact = "";
	}
	public void print() 
	{
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Contact : " + contact);
	}
}
