package jdbcformvalidation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class login1 {
	String username;
	String password;
	public login1(String username,String password) {
		this.username = username;
		this.password = password;
	}
	void validate() throws SQLException, ClassNotFoundException {
		Connection con = dbconnection.dbconnections();
		String query = "select * from datass";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		int count =0;
		while(rs.next()) {
			//System.out.println(rs.getString(2)+" "+rs.getString(3));
			if(username.equals(rs.getString(2)) && password.equals(rs.getString(3))) {
				count =1;
				System.out.println("YOU LOGIN IS SUCCESSFUL");
				System.exit(0);
			}
		}
		if(count != 1) {
			System.out.println("ENTER CORRECT USERID PASSWORD");
		}
		//System.out.println("the signin process is done successfully");
		//System.exit(0);
		con.close();
	}
}