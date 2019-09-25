import java.util.HashMap;
import java.util.Map;

class Order {
	int orderId;

	static HashMap<String, Integer> CustomerOrderMap = new HashMap<>();

	public void AdditemToCustomerOrder(String FoodItem, Integer quantity) {
		CustomerOrderMap.put(FoodItem, quantity);
	}

	public void CoustmerOrderPrint() {
		for (Map.Entry<String, Integer> i : CustomerOrderMap.entrySet()) {
			System.out.println(i.getKey() + " : " + i.getValue());
		}
	}
}
