package polymporphism;
public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		Bank bank = new ICICI();
		bank.homeInterestRate();
	}
}

class Bank {
	public void homeInterestRate() {
		System.out.println("Bank Home Interest Rate : 10.1");
	}
}
class SBI extends Bank {
	public void homeInterestRate() {
		System.out.println("SBI Home Interest Rate : 9.70");
	}
}

class ICICI extends Bank {
	public void homeInterestRate() {
		System.out.println("ICICI Home Interest Rate : 9.80");
	}
}