package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User;

public class UserDAO {
	private DBConnection db;

	public UserDAO(DBConnection db) {
		this.db = db;
	}

	public User find(String id) throws Exception {
		User user = null;
		String sql = "SELECT id, name FROM Users WHERE id = ?";

		Connection con = db.getConnect();

		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, id);

		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {
			String userId = rs.getString("id");
			String name = rs.getString("name");

			user = new User(userId, name);
		}
		return user;
	}

}
