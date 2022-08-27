package Controller;

import java.util.Scanner;
import Bean.Admin_Bean;
import DAO.AdminDAO;

public class Admin {
	Scanner sc = new Scanner(System.in);
	String userid;
	String password;
	Admin_Bean ab = new Admin_Bean();

	public void admin_login() {
		System.out.println("Enter your UserI'd and Password: ");
		userid = sc.nextLine();
		password = sc.nextLine();
		ab.setAdmin_user_id(userid);
		ab.setAdmin_password(password);
		if (AdminDAO.check(ab)) {
			System.out.println("Welcome User!");
		}
	}
}
