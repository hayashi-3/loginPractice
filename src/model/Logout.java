package model;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout {
	public void execute(HttpServletRequest req) {
		HttpSession session = req.getSession(false);

		if (session != null) {
			session.invalidate();
		}
	}

}
