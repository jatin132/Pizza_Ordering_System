package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Bean.Customer_Bean;

public class Customer_RegisterDAO {
	static int i;
	public static void check(Customer_Bean cb) {
		try {
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_ordering_software", "root", "root");
			PreparedStatement pstmt = con.prepareStatement("insert into customer values(default,?,?,?,?)");
			pstmt.setString(1, cb.getName());
			pstmt.setString(2, cb.getEmail());
			pstmt.setString(3, cb.getPassword());
			pstmt.setString(4, cb.getPhone());

			i = pstmt.executeUpdate();
			System.out.println("Registered Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}	
	}
	
}
