package Controller;

import java.util.Scanner;
import Bean.Order_Bean;
import DAO.Order_DetailsDAO;

public class Order_Details {
	Scanner sc = new Scanner(System.in);
	int customer_id;
	int item_id;
	int quantity;
	int bill;
	int i;
	Order_Bean ob = new Order_Bean();

	public int order_details() {
		do {
			System.out.println("Enter your id: ");
			customer_id = sc.nextInt();
			System.out.println("Enter item id:");
			item_id = sc.nextInt();
			System.out.println("Enter item quantity:");
			quantity = sc.nextInt();

			System.out.println("Press 1 for continue buying");
			i = sc.nextInt();
		} while (i == 1);
		ob.setCustomer_id(customer_id);
		ob.setItem_id(item_id);
		ob.setQuantity(quantity);
		ob.getBill();
		Order_DetailsDAO.check(ob);
//		Order_DetailsDAO.update(ob);
		return quantity;
	}
}
