package Advance;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/StudentCtl")
public class StudentCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Studentbean bean = new Studentbean();

		HttpSession session = request.getSession();
		bean.setID(Integer.parseInt(request.getParameter("ID")));
		bean.setRollNo(request.getParameter("RollNo"));
		String name = request.getParameter("FirstName");
		bean.setFirstName(name);
		bean.setLastName(request.getParameter("LastName"));
		bean.setSession(request.getParameter("Session"));

		// bean.setFname(request.getParameter("fname"));

		if (DataValidator.isNull(name)) {
			RequestDispatcher rs = request.getRequestDispatcher("StudentView.jsp");
			request.setAttribute("errorName", "Invalid Name");
			rs.forward(request, response);
		}
		String op = request.getParameter("operation");

		if (op.equals("Add")) {
			try {
				Studentmodel.add(bean);
				RequestDispatcher rs = request.getRequestDispatcher("StudentView.jsp");
				request.setAttribute("Success", "data add");
				rs.forward(request, response);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		else if (op.equals("Delete")) {

			try {
				Studentmodel.delete(bean);
			} catch (Exception e) {

				e.printStackTrace();
			}
			RequestDispatcher rs = request.getRequestDispatcher("StudentView.jsp");
			rs.forward(request, response);
		}

		else if (op.equals("Modify")) {

			try {
				Studentmodel.update(bean);
				RequestDispatcher rs = request.getRequestDispatcher("StudentView.jsp");
				request.setAttribute("Success", "Updateed Data");
				rs.forward(request, response);
			} catch (Exception e) {

				e.printStackTrace();
			}

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}