package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Bean.Customer_Bean;
import Controller.Admin_Select;
import Controller.Order_Details;

public class Customer_LoginDAO {

	public static boolean check(Customer_Bean cb) {
		Connection con = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_ordering_software", "root", "root");
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select * from customer where customer_name = '" + cb.getName()
					+ "' and customer_password = '" + cb.getPassword() + "'");
			boolean a = rs.next();
			if (a) {
				System.out.println("Welcome!");
				Admin_Select as = new Admin_Select();
				as.admin_select();
				Order_Details od = new Order_Details();
				od.order_details();
				// rs = stmt.executeQuery("select * from items");
				// int id = rs.getInt(1);
				// String name = rs.getString(2);
				// int price = rs.getInt(3);
				//
				// System.out.println("Id: " + id);
				// System.out.println("Name: " + name);
				// System.out.println("Quantity: " + price);
				// System.out.println("+++++++++++++++++++++++");
				// System.out.println();
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
