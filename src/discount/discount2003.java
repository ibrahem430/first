package discount;
/**
 * welcame to my project of discont in Airport store
 * @author store
 * @version 0.1
 */
import java.util.Scanner;

public class discount2003 {

	/**
	 * 
	 * @param discount in stor
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

 // You ask the customer if he is Jordanian
 
		System.out.println("are you from jordan  (yes,no)");
		String nashonalityyy = scanner.nextLine();
		//if the customer is jordanian ask he if you have it sim card
		 
		if (nashonalityyy.equalsIgnoreCase("yes")) {
			System.out.println("are you have sim card (yes,no)");
			String sumcard = scanner.nextLine();
			if (sumcard.equalsIgnoreCase("yes")) {
				//if the customer have it sim card ask him of typy of sim card
				System.out.println("what the typy of sim card  (zain,umniah,other)");
				String typesumcard = scanner.nextLine();
				//if the sim card is zain 
				if (typesumcard.equalsIgnoreCase("zain")) {
					System.out.println("you have args discount equale 20%");
					System.out.println("what the Purchasing value");
					Float Purchasingvalue = scanner.nextFloat();
					System.out.println("the Purchasingvalue after the discont is equale");
					System.out.println(Purchasingvalue - (Purchasingvalue * 20 / 100));
				} else if (typesumcard.equalsIgnoreCase("umniah")) {
					System.out.println("you have args discount equale 15%");
					System.out.println("what the Purchasing value");
					Float Purchasingvalue2 = scanner.nextFloat();
					System.out.println("the Purchasingvalue after the discont is equale");
					System.out.println(Purchasingvalue2 - (Purchasingvalue2 * 15 / 100));
				} else {
					System.out.println("you have args discount equale 10%");
					System.out.println("what the Purchasing value");
					Float Purchasingvalue6 = scanner.nextFloat();
					System.out.println("the Purchasingvalue after the discont is equale");
					System.out.println(Purchasingvalue6 - (Purchasingvalue6 * 10 / 100));
				}
			}

			else if (sumcard.equalsIgnoreCase("no")) {
				System.out.println("you have args discount equale 5%");
				System.out.println("what the Purchasing value");
				Float Purchasingvalue5 = scanner.nextFloat();
				System.out.println("the Purchasingvalue after the discont is equale");
				System.out.println(Purchasingvalue5 - (Purchasingvalue5 * 5 / 100));
			}
		} else if (nashonalityyy.equalsIgnoreCase("no")) {
			System.out.println("you have args discount equale 5");
			System.out.println("what the Purchasing value");
			Float Purchasingvalue4 = scanner.nextFloat();
			System.out.println("the Purchasingvalue after the discont is equale");
			System.out.println(Purchasingvalue4 - 5);
		}

		System.out.println("Thanks for coming ");
	}
}
