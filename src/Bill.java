import java.util.HashMap;
import java.util.Map;

class Bill {
	static HashMap<Integer, BillHelper> billHelpermap = new HashMap<Integer, BillHelper>();

	public void CustomerBillCalculate(HashMap<String, Integer> customerOrderMap) {

		Menu menu = new Menu();
		double i, total = 0.0;
		Integer counter = 1;

		HashMap<String, Double> MenuMap = menu.getMenuItems();

		for (Map.Entry<String, Integer> m : customerOrderMap.entrySet()) {

			i = (m.getValue()) * (MenuMap.get(m.getKey()));
			String itemOrderd1 = m.getKey();
			double orderdItemPrice1 = MenuMap.get(m.getKey());
			int orderItemquantity1 = m.getValue();
			double totalItemPrice1 = i;
			BillHelper billHelperObj = new BillHelper(itemOrderd1, orderdItemPrice1, orderItemquantity1,
					totalItemPrice1);
			billHelpermap.put(counter++, billHelperObj);
		}
	}

	public double getTotal() {
		double total = 0.0;
		for (BillHelper bh : billHelpermap.values()) {
			total = total + bh.totalItemPrice;
		}
		return total;
	}

	public void getBillPrint() {
		System.out.println("FoodItem    priceperUnit 	Quantity   TotalPrice");
		System.out.println("***********************************");
		for (BillHelper bh : billHelpermap.values()) {
			System.out.println(bh.itemOrderd + " :	 " + bh.orderdItemPrice + "  : 		" + bh.orderItemquantity + " : 	" + bh.totalItemPrice);
		}
		System.out.println("***********************************");
		System.out.println("total amount :" + getTotal());
	}

}