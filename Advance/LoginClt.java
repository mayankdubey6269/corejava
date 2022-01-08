package Advance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginClt")
public class LoginClt extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoginBean bean = new LoginBean();
		String login = request.getParameter("login");
	if (DataValidator.isNull(login) && !DataValidator.isEmail(login)) {
			RequestDispatcher rs = request.getRequestDispatcher("LoginView.jsp");
			request.setAttribute("errorE", "Invalid Email");
			rs.forward(request, response);
			return;
	}
		String pass = request.getParameter("password");
	if (DataValidator.isNull(pass)) {
			RequestDispatcher rs = request.getRequestDispatcher("LoginView.jsp");
	request.setAttribute("errorP", "Invalid Pass");
			rs.forward(request, response);
			return;

	}

		bean.setUser(login);
		bean.setPwd(request.getParameter("password"));
		String res = null;
	try {
						res = LoginModel.auth(bean);
		
		
		HttpSession session = request.getSession();
		session.setAttribute("Login", login);
		session.setAttribute("Password", pass);
		
		
	   
		}
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
		if (res == "success") {
			RequestDispatcher rs = request.getRequestDispatcher("welcomeView.jsp");
			request.setAttribute("error", "successfully login");
			rs.forward(request, response);
			return;


		}
		
		else {
			RequestDispatcher rs = request.getRequestDispatcher("LoginView.jsp");
			request.setAttribute("error", "Invalid Id and Pass");
			rs.forward(request, response);
			return;

		}
		
	}

}
