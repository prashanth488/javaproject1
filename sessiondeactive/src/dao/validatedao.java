package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import userbean.userbean;

public class validatedao {
public void validate(userbean user) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","prasanth","prasanth");
		PreparedStatement pstmt=conn.prepareStatement("select * from usertable where username=? and password=?");
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		ResultSet rs=pstmt.executeQuery();
		boolean b=rs.next();
		if(b) {
			user.setValid(true);
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setEmail(rs.getString("email"));
		}else {
			user.setValid(false);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
