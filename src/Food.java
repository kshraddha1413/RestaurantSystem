import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Food {

	public static void main(String[] args) {

		Menu menu = InitialData();
		menu.printMenu();

		Order order = new Order();
		order.AdditemToCustomerOrder("samosa", 2);
		order.AdditemToCustomerOrder("paneer", 1);
		order.AdditemToCustomerOrder("lassi", 2);
		System.out.println("********customer order list*********xs");
		order.CoustmerOrderPrint();

		Bill bill = new Bill();
		System.out.println("********print bill********");
		bill.CustomerBillCalculate(Order.CustomerOrderMap);
		System.out.println("********get total********");
		bill.getBillPrint();
	}
	
	public static Menu InitialData() {
		Menu menu = new Menu();
		menu.addNewItem("apetizer", "bhajji", 6.0);
		menu.addNewItem("apetizer", "samosa", 5.0);
		menu.addNewItem("desert", "lassi", 10);
		menu.addNewItem("desert", "brownee", 12);
		menu.addNewItem("maindish", "dal", 30.0);
		menu.addNewItem("maindish", "paneer", 30.0);
		return menu;
	}
}


