package Controller;

import java.util.Scanner;

public class Admin_Choose {
	Scanner sc = new Scanner(System.in);
	public void admin_choose(){
		while (true) {
			System.out.println("PRESS 1 for ADD Items: ");
			System.out.println("PRESS 2 for DELETE Items: ");
			System.out.println("PRESS 3 for UPDATE Items: ");
			System.out.println("PRESS 4 for SELECT Items: ");
			System.out.println("PRESS 5 for SELECT Customers : ");
			System.out.println("PRESS 6 for EXIT: ");
			int press = sc.nextInt();
			if (press == 1) {
				Admin_Add aa = new Admin_Add();
				aa.admin_add();
			}
			else if (press == 2) {
				Admin_Delete ad = new Admin_Delete();
				ad.admin_delete();
			}
			else if (press == 3) {
				Admin_Update au = new Admin_Update();
				au.admin_update();
			}
			else if (press == 4) {
				Admin_Select as = new Admin_Select();
				as.admin_select();
			}
			else if (press == 5) {
				Admin_Select_Customer asc = new Admin_Select_Customer();
				asc.admin_select_customer();
			}
			else if (press == 6) {
				break;
			}
			else {
				System.out.println("Wrong Input... Try Again!");
			}
		}
	}
}
