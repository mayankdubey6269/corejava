package Advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Studentmodel {

	public static void main(String[] args) throws Exception {

		add(null);

	}

	public static void add(Studentbean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project4", "root", "root");
		PreparedStatement ps = conn.prepareStatement("Insert into studentmgt values(?,?,?,?,?)");
		ps.setInt(1, bean.getID());
		ps.setString(2, bean.getRollNo());
		ps.setString(3, bean.getFirstName());
		ps.setString(4, bean.getLastName());
		ps.setString(5, bean.getSession());
		int i = ps.executeUpdate();
		ps.close();

		conn.close();

	}

	public static void delete(Studentbean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project4", "root", "root");
		PreparedStatement ps = conn.prepareStatement("delete from studentmgt where ID=?");
		ps.setInt(1, bean.getID());
		int i = ps.executeUpdate();
		ps.close();
		conn.close();
	}

	public static void update(Studentbean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project4", "root", "root");
		PreparedStatement ps = conn
				.prepareStatement("UPDATE STUDENTMGT SET RollNo=?, FirstName=?, LastName=?, Session=? WHERE ID=?");
		ps.setInt(5, bean.getID());
		ps.setString(1, bean.getRollNo());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getSession());
		int i = ps.executeUpdate();
		conn.commit();
		ps.close();
		conn.close();
	}

		public static Studentbean get (Studentbean bean) throws Exception {
		int i = 0;
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project4", "root", "root");
		
		PreparedStatement ps = conn.prepareStatement("SELECT ID, ROLLNO, FIRSTNAME,LASTNAME,SESSION FROM StudentMgt WHERE ID = ?");
        
		ps.setInt(1, bean.getID());

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			bean.setID(rs.getInt(1));
			bean.setRollNo(rs.getString(2));
			bean.setFirstName(rs.getString(3));
			bean.setLastName(rs.getString(4));
			bean.setSession(rs.getString(5));
		}
		return bean;

	}

	public static ArrayList<Studentbean> Search() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project4", "root", "root");

		PreparedStatement ps = conn.prepareStatement("SELECT ID, RollNo, FirstName, LastName, Session FROM STUDENTMGT");

		ArrayList<Studentbean> l = new ArrayList<Studentbean>();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Studentbean bean = new Studentbean();
			bean.setID(rs.getInt(1));
			bean.setRollNo(rs.getString(2));
			bean.setFirstName(rs.getString(3));
			bean.setLastName(rs.getString(4));
			bean.setSession(rs.getString(5));
			l.add(bean);
		}
		ps.close();
	    conn.close();

		return l;

	}
    
	

}