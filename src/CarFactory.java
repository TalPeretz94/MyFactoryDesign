
public class CarFactory {
	

	public static Car createCar(String userInput) {
		Car myCar;
		switch (userInput) {
		case "B":
			myCar = new BMW("Blue");
			break;

		case "F":
			myCar = new Ferrari("Yellow");
			break;

		case "M":
			myCar = new Mercedes("Green");
			break;
		default:
			System.out.println("not a valid input");
			return null;

		}

		return myCar;

	}

}
