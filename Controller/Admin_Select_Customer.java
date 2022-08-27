package Controller;

import Bean.AdminDAO_Bean;
import DAO.Admin_Select_CustomerDAO;

public class Admin_Select_Customer {

	public void admin_select_customer() {
		AdminDAO_Bean abd = new AdminDAO_Bean();
		Admin_Select_CustomerDAO.check(abd);
	}

}
