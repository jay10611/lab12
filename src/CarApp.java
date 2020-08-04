import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {
	public static Scanner scnr = new Scanner(System.in);
	public static List<Cars> cars = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to the Gran Circus Motors console!");
		
			
		addCars();
		System.out.println("Currently we have these veichles in stock");
		
		inventory();
		
	}

	public static void addCars() {
		System.out.println("How many cars would you like to enter?\n");
		int numberOfCars = scnr.nextInt();
		
		
		for (int i = 0; i < numberOfCars; i++) {
			Cars car = new Cars();
			scnr.nextLine();
			System.out.println("Please enter car #" + (i + 1) + " Make");
			car.setMake(scnr.nextLine());
			System.out.println("Please enter car #" + (i + 1) + " Model");
			car.setModel(scnr.nextLine());
			System.out.println("What year was car #" + (i + 1) + " made?");
			car.setYear(scnr.nextInt());
			System.out.println("please enter car #" + (i + 1) + " price");
			car.setPrice(scnr.nextDouble());
			cars.add(car);
		}
	}

	public static void inventory() {
		
		System.out.printf("%-15s%-15s%-15s%-16s\n", "Make","Model","Year","Price");
		System.out.println("====================================================");
		for (int i = 0;i< cars.size();i++) {
		System.out.printf("%-15s%-15s%-15d%-1s%-15.2f\n", Cars.getMake(), Cars.getModel(), Cars.getYear(),"$",Cars.getPrice());}

	}
}