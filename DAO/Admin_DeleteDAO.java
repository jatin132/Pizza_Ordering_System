package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Bean.AdminDAO_Bean;

public class Admin_DeleteDAO {

	public static boolean check(AdminDAO_Bean abd) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_ordering_software", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from items where item_name = '" + abd.getItem_name() +"'");
			boolean a = rs.next();
			if (a) {
				stmt.executeUpdate("Delete from items where item_name = '"+ abd.getItem_name()+"'");
				System.out.println("Item deleted Succesfully!");
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
