package Controller;

import java.util.Scanner;

import Bean.AdminDAO_Bean;
import DAO.Admin_UpdateDAO;

public class Admin_Update {
	Scanner sc = new Scanner(System.in);
	String item_name;
	String item_price;
	AdminDAO_Bean abd = new AdminDAO_Bean();

	public void admin_update() {
		System.out.println("Enter item name:");
		item_name = sc.nextLine();
		System.out.println("Enter item price:");
		item_price = sc.next();
		
		abd.setItem_name(item_name);
		abd.setItem_price(item_price);

		Admin_UpdateDAO.check(abd);
	}

}
