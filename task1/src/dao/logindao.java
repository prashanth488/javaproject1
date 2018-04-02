package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import userbean.userbean;

public class logindao {
public static void insert(userbean user) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","prashanth","oracle");
		PreparedStatement pstmt=conn.prepareStatement("select * from task1 where username=? and password=?");
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		ResultSet rs=pstmt.executeQuery();
		boolean req=rs.next();
		if(req) {
		user.setValid(true);
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setEmailid(rs.getString("Emailid"));
		}
		else {
			user.setValid(false);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
