package Controller;

import java.util.Scanner;
import Bean.Customer_Bean;
import DAO.Customer_LoginDAO;

public class Customer_Login {
	Scanner sc = new Scanner(System.in);
	String name;
	String password;
	Customer_Bean cb = new Customer_Bean();

	public void customer_login() {
		System.out.println("Enter your UserI'd and Password: ");
		name = sc.nextLine();
		password = sc.nextLine();
		cb.setName(name);
		cb.setPassword(password);
		if (Customer_LoginDAO.check(cb)) {
			System.out.println("Welcome User!");
		}
	}

}
