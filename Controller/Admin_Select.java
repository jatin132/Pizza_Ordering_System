package Controller;

import Bean.AdminDAO_Bean;
import DAO.Admin_SelectDAO;

public class Admin_Select {

	public void admin_select() {
		AdminDAO_Bean abd = new AdminDAO_Bean();
		Admin_SelectDAO.check(abd);
	}

}
