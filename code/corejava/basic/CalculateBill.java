public class CalculateBill {
	public static void main(String args[])
	{
		double unitPrice = 3.5;
		double tax = 10;
		int consumeUnit = 80;
		double amount = unitPrice * consumeUnit;
		double taxAmount = amount * 0.1;
		double payableAmount = amount + taxAmount;
	
		System.out.println(payableAmount);
		
	}
}