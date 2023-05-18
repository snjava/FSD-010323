import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd01march","root","root"); 
			PreparedStatement stmt = con.prepareStatement("update empinfo set contact='1111111111' where id=2");
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " : Rows Updated...");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
