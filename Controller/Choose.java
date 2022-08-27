package Controller;

import java.util.Scanner;

public class Choose {
	Scanner sc = new Scanner(System.in);
	int choose;

	public void choose() {
		while (true) {
			System.out.println("PRESS 1 if you are ADMIN: ");
			System.out.println("PRESS 2 if you are a CUSTOMER: ");
			System.out.println("PRESS 3 if you are already a CUSTOMER: ");
			System.out.println("PRESS 4 for MENU: ");
			System.out.println("PRESS 5 for ORDER ID");
			System.out.println("PRESS 6 for EXIT: ");
			choose = sc.nextInt();
			if (choose == 1) {
				Admin a = new Admin();
				a.admin_login();
			} else if (choose == 2) {
				Customer_Register c = new Customer_Register();
				c.customer_register();
			} else if (choose == 3) {
				Customer_Login cl = new Customer_Login();
				cl.customer_login();
			} else if (choose == 4) {
				Admin_Select as = new Admin_Select();
				as.admin_select();
			} else if (choose == 5) {
				Order_Track ot = new Order_Track();
				ot.order_track();
			} else if (choose == 6) {
				break;
			} else {
				System.out.println("Wrong Input... Try Again!");
			}
		}
	}

	public static void main(String[] args) {
		Choose c = new Choose();
		c.choose();
	}
}
