import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		Car myCar;
		Scanner sc = new Scanner(System.in);
		String input;

		System.out.println("chose your car:\n" + "for BMW press -> 'B' \n" + "for Ferrari press -> 'F' \n"
				+ "for Mercedes press -> 'M' \n");
		input = sc.nextLine();

		myCar = CarFactory.createCar(input);
		
		myCar.drive();

	}

}
