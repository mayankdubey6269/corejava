package Advance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationClt")
public class RegistrationClt extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Registrationbean bean = new Registrationbean();
//	bean.setId(Integer.parseInt(request.getParameter("id")));
	
	String id = request.getParameter("id");
	if(DataValidator.isNull(id)){
		RequestDispatcher rs = request.getRequestDispatcher("RegistrationView.jsp");
		request.setAttribute("errorId", "Invalid Id");
		rs.forward(request, response);
	}
	bean.setId(Integer.parseInt(request.getParameter("id")));
	
//	bean.setFname(request.getParameter("fname"));
	
	String name = request.getParameter("fname");
	if(DataValidator.isNull(name)){
		RequestDispatcher rs = request.getRequestDispatcher("RegistrationView.jsp");
		request.setAttribute("errorName", "Invalid Name");
		rs.forward(request, response);			
	}
	bean.setFname(request.getParameter("fname"));
	
//	bean.setLname(request.getParameter("lname"));
	String lname = request.getParameter("lname");
	if(DataValidator.isNull(lname)){
		RequestDispatcher rs = request.getRequestDispatcher("RegistrationView.jsp");
		request.setAttribute("errorlName", "Invalid lName");
		rs.forward(request, response);			
	}
	bean.setLname(request.getParameter("lname"));
			
	
//	bean.setEmail(request.getParameter("email"));
	String Email = request.getParameter("email");
	if(DataValidator.isNull(Email)){
		RequestDispatcher rs = request.getRequestDispatcher("RegistrationView.jsp");
		request.setAttribute("erroremail", "Invalid email");
		rs.forward(request, response);			
	}
	bean.setEmail(request.getParameter("email"));
	
//	bean.setPass(request.getParameter("password"));
	String password = request.getParameter("Cpass");
	if(DataValidator.isNull(password)){
		RequestDispatcher rs = request.getRequestDispatcher("RegistrationView.jsp");
		request.setAttribute("errorCpass", "Invalid Cpass");
		rs.forward(request, response);			
	}
	bean.setPass(request.getParameter("password"));
	
	bean.setGender(request.getParameter("gender"));
	bean.setDob(request.getParameter("dob"));
	
	Registrationmodal model = new Registrationmodal();

	PrintWriter out = response.getWriter();
	
	try {
		model.add(bean);
		out.println("success");
	} catch (Exception e) {
		out.println(e.getMessage());
	}
	
	}
}
