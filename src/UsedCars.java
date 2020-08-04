import java.util.ArrayList;
import java.util.List;

public class UsedCars extends Cars {
	private static Double Milage;

	public static void main(String[] args) {

	}

	public UsedCars(String Make, String Model, Integer Year, Double Price, Double Milage) {
		super(Make, Model, Year, Price);


	}

	public void setMilage(Double milage) {
		Milage = milage;
	}

	public static Double getMilage() {
		return getMilage();
	}

	public String toString() {

		return "Make is: " + getMake() + "-" + "Model is: " + getModel() + "Year: " + getYear() + "Price: " + getPrice()
				+ "used" + "Milage is: " + getMilage();
	}
}