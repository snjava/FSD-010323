public class EmployeeDetails {
	public static void main(String arr[]) {
		Employee emp = new Employee();
		emp.id = 20;
		emp.salary = 234234.23;
		emp.printEmpDetails();
	}
}
class Employee {
	int id;
	double salary;
	public void printEmpDetails() {
		int id = 111;
		System.out.println(id);
		System.out.println(salary);
	}	
}