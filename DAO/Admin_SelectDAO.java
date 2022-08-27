package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Bean.AdminDAO_Bean;

public class Admin_SelectDAO {

	public static void check(AdminDAO_Bean abd) {
		try {
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_ordering_software", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from items");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);

				System.out.println("Id \t" + id);
				System.out.println("Name \t" + name);
				System.out.println("Price \t" + price);
				System.out.println("+++++++++++++++++++++++");
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
	}

}
