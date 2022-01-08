package Advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginModel {

	public static String auth(LoginBean bean) throws Exception {

		String result = null;
		String pass = null;
		String name = null;

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mayank", "root", "root");

		PreparedStatement ps = conn.prepareStatement("SELECT FirstName,PASSWORD FROM registration WHERE EMAIL= ?");
		ps.setString(1, bean.getUser());
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			pass = rs.getString(2);
			bean.setName(rs.getString(1));

		}

		if (bean.getPwd().equals(pass)) {
			result = "success";
		} else {
			result = "Not";
		}

		ps.close();
		rs.close();
		conn.close();

		return result;
	}

}