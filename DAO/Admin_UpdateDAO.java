package DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import Bean.AdminDAO_Bean;

public class Admin_UpdateDAO {
	static Connection con = null;

	public static void check(AdminDAO_Bean abd) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_ordering_software", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from items where item_name = '" + abd.getItem_name() + "'");
			if (rs.next()) {
				int i = stmt.executeUpdate("update items set item_price='" + abd.getItem_price()
						+ "' where item_name = '" + abd.getItem_name() + "'");
				System.out.println("Items Updated Successfully!");
			} else {
				System.out.println("Wrong Input... Try Again!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
