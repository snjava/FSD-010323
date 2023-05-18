import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = scan.next();
		System.out.println("Enter Email : ");
		String email = scan.next();
		System.out.println("Enter Contact : ");
		String contact = scan.next();
		scan.close();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd01march","root","root"); 
			PreparedStatement stmt = con.prepareStatement("insert into empinfo values(0, ?, ?, ?)"); // Parameterized Query
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, contact);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " : Rows Inserted...");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
