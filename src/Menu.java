import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Menu {

	Appetizer ape;
	MainCourse main;
	Desert des;
	static HashMap<String, Double> MenuItems = new HashMap<>();

	Menu() {
		ape = new Appetizer();
		main = new MainCourse();
		des = new Desert();
	}

	public void addNewItem(String itemType, String itemName, double price) {

		if (itemType == "apetizer") {
			Appetizer apeObj = new Appetizer();
			HashMap<String, Double> apelList = apeObj.getAptMap();
			apelList.put(itemName, price);
		} else if (itemType == "maindish") {
			MainCourse mainobj = new MainCourse();
			HashMap<String, Double> mainDishList = mainobj.getmainmap();
			mainDishList.put(itemName, price);
		}
		if (itemType == "desert") {
			Desert desrtobj = new Desert();
			HashMap<String, Double> desertList = desrtobj.getDesertMap();
			desertList.put(itemName, price);
		}

	}

	public HashMap<String, Double> getMenuItems() {
		MenuItems.putAll(ape.getAptMap());
		MenuItems.putAll(main.getmainmap());
		MenuItems.putAll(des.getDesertMap());
		return MenuItems;
	}

	public void printMenu() {
		System.out.println("******Apetizers :**********");
		HashMap<String, Double> aptmap = (ape.getAptMap());
		for (Map.Entry<String, Double> i : aptmap.entrySet()) {
			System.out.println(i.getKey() + " : " + i.getValue());

		}
		System.out.println("\b******Main Course dishes :\b*****");
		HashMap<String, Double> mainmap = (main.getmainmap());
		for (Entry<String, Double> i : mainmap.entrySet()) {
			System.out.println(i.getKey() + " : " + i.getValue());

		}
		System.out.println("\b******Desert Items :\b*****");
		HashMap<String, Double> desertmap = (des.getDesertMap());
		for (Entry<String, Double> i : desertmap.entrySet()) {
			System.out.println(i.getKey() + " : " + i.getValue());
		}
	}
}
