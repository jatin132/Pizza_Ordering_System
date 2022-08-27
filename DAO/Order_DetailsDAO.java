package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Bean.Order_Bean;

public class Order_DetailsDAO {
	static Connection con = null;
	static PreparedStatement pstmt = null;
	static int total, price, gt;

	public static void check(Order_Bean ob) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_ordering_software", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from items where item_id = '" + ob.getItem_id() + "'");
			while (rs.next()) {
				price = rs.getInt(3);
				total = price * ob.getQuantity();
				gt = gt + total;
			}
			pstmt = con.prepareStatement("insert into orders_track values(default,?,?,?,?)");
			pstmt.setInt(1, ob.getCustomer_id());
			pstmt.setInt(2, ob.getItem_id());
			pstmt.setInt(3, ob.getQuantity());
			pstmt.setInt(4, gt);
			int i = pstmt.executeUpdate();
			System.out.println("Order Placed Successfully!");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public static void update(Order_Bean ob) {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_ordering_software", "root", "root");
//			u = pstmt.executeUpdate("insert into orders_track(customer_id)"
//					+ "select customer_id from customer where customer_id = '"+ob.getCustomer_id()+"'");
//			@SuppressWarnings("unused")
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
