package model;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.DBConnection;
import dao.UserDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login {
	public boolean execute(HttpServletRequest req) {
		boolean state = false;

		HttpSession session = req.getSession(false);

		//ブラウザバックしてもセッションが残らないようにする
		if (session != null) {
			session.invalidate();
		}

		String id = req.getParameter("ID");

		DBConnection db = new DBConnection();

		try {
			UserDAO dao = new UserDAO(db);
			User user = dao.find(id);

			if (user != null) {
				session = req.getSession(true);
				session.setAttribute("user", user);
				state = true;
			}
		} catch (Exception e) {
			state = false;
		} finally {
			try {
				db.closeConnect();
			} catch (Exception e) {
				state = false;
			}
		}
		return state;
	}

}
