package Advance;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/StudentProCtl")
public class StudentProCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Studentbean bean = new Studentbean();
		String id = (String) request.getAttribute("id");
		bean.setID(Integer.parseInt(id));
		
		try {
			bean = Studentmodel.get(bean);
			RequestDispatcher rd =request.getRequestDispatcher("StudentProfileView.jsp");
			request.setAttribute("beanid", bean.getID());
			request.setAttribute("RollNo", bean.getRollNo());
			request.setAttribute("fName", bean.getFirstName());
			request.setAttribute("lName", bean.getLastName());
			request.setAttribute("ses", bean.getSession());
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	
}
