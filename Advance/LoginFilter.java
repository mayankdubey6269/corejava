package Advance;

import java.io.IOException;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.log.Log;

@WebFilter("*.do")
public class LoginFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse rec = (HttpServletResponse) response;
		HttpSession s = req.getSession();
		if (s.getAttribute("Login") == null) {
			RequestDispatcher rs = request.getRequestDispatcher("LoginView.jsp");
			request.setAttribute("error", "Session is expiry");
			rs.forward(request, response);

		} else {
			chain.doFilter(req, rec);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void destroy() {
	}
}
