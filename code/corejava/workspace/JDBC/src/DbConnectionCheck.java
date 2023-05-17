import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionCheck {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd01march","root","root");
			System.out.println("Connection Successful...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
