import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectQuery {
	public static void main(String[] args) {
		String query ="select * from empinfo where id between 2 AND 5";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd01march","root","root");
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("Id : " + rs.getInt("id"));
				System.out.println("Name : " + rs.getString("name"));
				System.out.println("Email : " + rs.getString("email"));
				System.out.println("Contact : " + rs.getString("contact"));
				System.out.println("------------------------------");
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
