
public class Cars {

	private static String Make;
	private static String Model;
	private static Integer Year;
	private static Double Price;

	public Cars(String Make, String Model, int Year, Double Price) {

		Make = "";
		Model = "";
		Year = 0;
		Price = (double) 0;
	}

	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public static String getMake() {
		return Make;

	}

	public static String getModel() {
		return Model;

	}

	public static Integer getYear() {
		return Year;
	}

	public void setYear(Integer year) {
		Year = year;
	}

	public static Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public void setMake(String make) {
		Make = make;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String toString() {

		return "Make is: " + getMake() + "-" + "Model is: " + getModel() + "Year: " + getYear() + "Price: "
				+ getPrice();

	}

}
