import java.util.HashMap;

class MainCourse {
	String maindishName;
	double price;
	static HashMap<String, Double> mainCourseMap = new HashMap<String, Double>();

	public void addMainDish(String dishName, Double price) {
		mainCourseMap.put(dishName, price);

	}

	public void updateMainDish(String dishName, Double price) {
		mainCourseMap.put(dishName, price);
	}

	public HashMap<String, Double> getmainmap() {
		return mainCourseMap;
	}
}