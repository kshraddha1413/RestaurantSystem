import java.util.HashMap;

class Appetizer implements FoodItem {
	String apeName;
	double price;
	static HashMap<String, Double> aptMap = new HashMap<>();

	public void addFoodItem(String apeName, double price) {
		aptMap.put(apeName, price);
	}

	public void updateFoodItem(String ApeName, Double price) {
		aptMap.put(ApeName, price);
	}

	public HashMap<String, Double> getFoodListMap() {
		return aptMap;
	}
}