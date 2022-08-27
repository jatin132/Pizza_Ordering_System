package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import Bean.Admin_Bean;
import Controller.Admin_Choose;

public class AdminDAO {
	public static boolean check(Admin_Bean ab) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_ordering_software", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from admin where admin_user_id = '" + ab.getAdmin_user_id()
					+ "' and admin_password = '" + ab.getAdmin_password() + "'");
			boolean a = rs.next();
			if (a) {
				Admin_Choose ac = new Admin_Choose();
				ac.admin_choose();
			} else {
				System.out.println("Wrong Input... Try Again!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
		return false;
	}
}
