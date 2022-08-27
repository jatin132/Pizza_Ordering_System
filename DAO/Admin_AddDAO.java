package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Bean.AdminDAO_Bean;

public class Admin_AddDAO {

	public static void check(AdminDAO_Bean abd) {
		try {
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_ordering_software", "root", "root");
			PreparedStatement pstmt = con.prepareStatement("insert into items values(default,?,?)");
			pstmt.setString(1, abd.getItem_name());
			pstmt.setString(2, abd.getItem_price());

			@SuppressWarnings("unused")
			int i = pstmt.executeUpdate();
			 System.out.println("Items Added Successfully!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
	}

}
