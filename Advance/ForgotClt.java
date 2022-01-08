package Advance;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ForgotClt")
public class ForgotClt extends HttpServlet {
String user=null;
String pass=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		user = (String) request.getAttribute("email");
		PrintWriter out = response.getWriter();
		try {
			reset();
		} catch (Exception e) {
			out.println(e.getMessage());
		}
		RequestDispatcher rd = request.getRequestDispatcher("ForgotView.jsp");
		request.setAttribute("pass", pass);
		rd.forward(request, response);
		
	
	
	}

	private void reset() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mayank", "root", "root");

		PreparedStatement ps = conn.prepareStatement("SELECT PASSWORD FROM registration WHERE EMAIL= ?");
		ps.setString(1, user);
		ResultSet rs = ps.executeQuery();
		

		while (rs.next()) {
			pass = rs.getString(1);
		}
		
		
	}
}
