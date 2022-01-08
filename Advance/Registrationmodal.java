package Advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registrationmodal {

		
	public void add(Registrationbean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mayank", "root", "root");

		con.setAutoCommit(false);
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO REGISTRATION VALUES(?,?,?,?,?,?,?)");
		
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setString(4, bean.getEmail());
		ps.setString(5, bean.getPass());
		ps.setString(6, bean.getGender());
		ps.setString(7, bean.getDob());
		
		ps.executeUpdate();
		ps.close();
		
		con.commit();
		con.close();
	}
}
