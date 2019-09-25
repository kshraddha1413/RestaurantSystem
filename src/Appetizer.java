import java.util.HashMap;

class Appetizer {
	String apeName;
	double price;
	static HashMap<String, Double> aptMap = new HashMap<>();

	public void addApetiser(String apeName, double Price) {
		aptMap.put(apeName, Price);
	}

	public void updateapetizer(String ApeName, Double price) {
		aptMap.put(ApeName, price);
	}

	public HashMap<String, Double> getAptMap() {
		return aptMap;
	}
}