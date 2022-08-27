package Controller;

import java.util.Scanner;

import Bean.AdminDAO_Bean;
import DAO.Admin_AddDAO;

public class Admin_Add {
	Scanner sc = new Scanner(System.in);
	String item_name;
	String item_price;
	AdminDAO_Bean abd = new AdminDAO_Bean();

	public void admin_add() {
		System.out.println("Enter item name:");
		item_name = sc.nextLine();
		System.out.println("Enter item price:");
		item_price = sc.nextLine();
		abd.setItem_name(item_name);
		abd.setItem_price(item_price);

		Admin_AddDAO.check(abd);
	}

}
