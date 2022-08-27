package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Bean.AdminDAO_Bean;

public class Admin_Select_CustomerDAO {

	public static void check(AdminDAO_Bean abd) {
		try {
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_ordering_software", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from orders_track");
			while (rs.next()) {
				int order_id = rs.getInt(1);
				int customer_id = rs.getInt(2);
				int item_id = rs.getInt(3);
				int qty = rs.getInt(4);
				int bill = rs.getInt(5);

				System.out.println("Order Id: " + order_id);
				System.out.println("Customer Id: " + customer_id);
				System.out.println("Item Id: " + item_id);
				System.out.println("Quantity: " + qty);
				System.out.println("Total bill: " + bill);
				System.out.println("+++++++++++++++++++++++");
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
	}

}
