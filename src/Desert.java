import java.util.HashMap;


class Desert {
	String desertDishName;
	double price;
	static HashMap<String, Double> desertmap = new HashMap<String, Double>();

	public void addDesertDish(String desertDishName, double price) {
		desertmap.put(desertDishName, price);
	}

	public void updateDesertDish(String desertDishName, double price) {
		desertmap.put(desertDishName, price);
	}

	public HashMap<String, Double> getDesertMap() {
		return desertmap;
	}

}
