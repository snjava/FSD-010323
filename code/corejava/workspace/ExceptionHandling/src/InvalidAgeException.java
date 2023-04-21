
public class InvalidAgeException extends Exception {

	private String message;
	public InvalidAgeException(String message) {
		super(message);
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("Invalid Age.. Value must be between 1-120");
	}
}
