package jdbcformvalidation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
	//Class.forName("com.mysql.cj.jdbc.Driver");
	private static final String url = "jdbc:mysql://localhost:3306/form";
	private static final String user = "root";
	private static final String pass = "root";
	public static Connection dbconnections() throws SQLException {
		return DriverManager.getConnection(url,user,pass);
		
	}
}
