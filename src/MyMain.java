import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		CarFactory myCar;
		Scanner sc = new Scanner(System.in);
		String userChose;

		System.out.println("chose your car:\n" + "for BMW press -> 'B' \n" + "for Ferrari press -> 'F' \n"
				+ "for Mercedes press -> 'M' \n");
		userChose = sc.nextLine();

		switch (userChose) {
		case "B":
			myCar = new BMW();
			break;

		case "F":
			myCar = new Ferrari();
			break;

		case "M":
			myCar = new Mercedes();
			break;
		default:
			System.out.println("not a valid input");
			return;

		}
		
		myCar.drive();

	}

}
