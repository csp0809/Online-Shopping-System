package Project;
import java.sql.*;
public class ConnectionProvider {
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineDB", "root", "8451086651");
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
