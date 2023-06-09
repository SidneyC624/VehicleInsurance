import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your vehicle type: ");
		System.out.println("car, truck, bus, motorcycle");
		String type = scanner.nextLine();
		int premium = 0;
		
		switch(type) {
		case "car":
			premium = 200;
			break;
		case "truck":
			premium = 300;
			break;
		case "bus":
			premium = 400;
			break;
		case "motorcycle":
			System.out.println("Enter your motorcycle type: ");
			System.out.println("1 (low power), 2 (medium), 3 (high)");
			String motorcycleType = scanner.nextLine();
			int motorcycleInt = Integer.parseInt(motorcycleType);
			
			switch(motorcycleInt) {
			case 1:
				premium = 300;
				break;
			case 2:
				premium = 400;
				break;
			case 3:
				premium = 500;
				break;
			default:
				System.out.println("Unknown motorcycle type");
			}
			break;
		default: 
			System.out.println("Unknown vehicle type");
					
		}
		
		scanner.close();
		System.out.println("The premium is $" + premium);

	}

}
