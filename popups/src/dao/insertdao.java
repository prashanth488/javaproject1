package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import userbean.userbean;

public class insertdao {
public static void insert(userbean user) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","prashanth","oracle");
		PreparedStatement pstmt =conn.prepareStatement("insert into task2(firstname,lastname,emailid) values(?,?,?)");
		pstmt.setString(1, user.getFirstname());
		pstmt.setString(2, user.getLastname());
		pstmt.setString(3, user.getEmailid());
		int rs=pstmt.executeUpdate();
		
		if(rs==1) {
			user.setValid(true);
		}else {
			user.setValid(false);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		}
}
