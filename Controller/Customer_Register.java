package Controller;

import java.util.Scanner;

import Bean.Customer_Bean;
import DAO.Customer_RegisterDAO;


public class Customer_Register {
	Scanner sc = new Scanner(System.in);
	String name;
	String email;
	String password;
	String phone;
	Customer_Bean cb = new Customer_Bean();
	public void customer_register() {
		System.out.println("Enter your name :");
		name = sc.nextLine();
		System.out.println("Enter your email :");
		email = sc.nextLine();
		System.out.println("Enter your password :");
		password = sc.nextLine();
		System.out.println("Enter your phone number :");
		phone = sc.nextLine();
		cb.setName(name);
		cb.setEmail(email);
		cb.setPassword(password);
		cb.setPhone(phone);
		
		Customer_RegisterDAO.check(cb);
	}	
}
