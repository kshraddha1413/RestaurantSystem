public class Food {

	public static void main(String[] args) {
		Menu menu = InitialData();
		menu.printMenu();

		Order order = new Order();
		order.AdditemToCustomerOrder("samosa", 2);
		order.AdditemToCustomerOrder("dal", 1);

		System.out.println("********customer order list*********xs");
		order.CoustmerOrderPrint();

		Bill bill = new Bill(order.orderId);
		System.out.println("********print bill********");
		bill.CustomerBillCalculate(order.CustomerOrderMap);
		bill.getBillPrint();

		Order or = new Order();
		or.AdditemToCustomerOrder("paneer", 1);
		System.out.println("********customer order list*********xs");
		or.CoustmerOrderPrint();

		Bill bi = new Bill(order.orderId);
		System.out.println("********print bill********");
		bi.CustomerBillCalculate(or.CustomerOrderMap);
		bi.getBillPrint();
	}

	public static Menu InitialData() {
		Menu menu = new Menu();
		menu.addNewItem(ConstantFood.APPETIZER, "bhajji", 6.0);
		menu.addNewItem(ConstantFood.APPETIZER, "samosa", 5.0);
		menu.addNewItem(ConstantFood.DESSERT, "lassi", 10);
		menu.addNewItem(ConstantFood.DESSERT, "brownee", 12);
		menu.addNewItem(ConstantFood.MAINDISH, "dal", 30.0);
		menu.addNewItem(ConstantFood.MAINDISH, "paneer", 30.0);
		return menu;
	}
}
