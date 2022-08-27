package Controller;

import java.util.Scanner;

import Bean.AdminDAO_Bean;
import DAO.Admin_DeleteDAO;

public class Admin_Delete {
	Scanner sc = new Scanner(System.in);

	public void admin_delete() {
		String name;
		AdminDAO_Bean abd = new AdminDAO_Bean();
		System.out.println("Enter  item name you want to delete: ");
		name = sc.nextLine();
		abd.setItem_name(name);
		Admin_DeleteDAO.check(abd);
	}

}
