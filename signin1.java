package jdbcformvalidation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class signin1 {
	String username;
	String password;
	public signin1(String username,String password) {
		this.username = username;
		this.password = password;
	}
	void store() throws SQLException, ClassNotFoundException {
		Connection con = dbconnection.dbconnections();
		String query = "insert into datass(userid,pass) values(?,?)";
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, username);
		st.setString(2, password); 
		st.executeUpdate();
		System.out.println("the signin process is done successfully");
		con.close();
	}
}
