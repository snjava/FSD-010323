import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionCheck {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. Register Driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd01march","root","root"); // 2. Create Connection
			System.out.println("Connection Successful...");
			con.close(); // 5. Close Connection
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
