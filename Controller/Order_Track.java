package Controller;

import Bean.AdminDAO_Bean;
import DAO.Order_TrackDAO;

public class Order_Track {

	public void order_track() {
		AdminDAO_Bean abd = new AdminDAO_Bean();
		Order_TrackDAO.check(abd);	
	}

}
