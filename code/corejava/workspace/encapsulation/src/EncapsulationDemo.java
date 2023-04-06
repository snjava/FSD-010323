
public class EncapsulationDemo {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.setId(121);
		emp1.setName("Abc");
		emp1.setSalary(45645.45);
		
		emp1.printEmployeeInfo();
	}
}
