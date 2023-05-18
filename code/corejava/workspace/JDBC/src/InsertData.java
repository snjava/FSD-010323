import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd01march","root","root"); 
			PreparedStatement stmt = con.prepareStatement("insert into empinfo values(0, 'Demo1', 'demo1@gmail.com','9988776655')");
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " : Rows Inserted...");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
