import java.util.Scanner;

public class Main {
	static boolean res;

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Tuna", "Torun", 2002);
		Scanner girdi = new Scanner(System.in);
		int shop;

		do {
			System.out.println("\nWhich shop would you like to shop from?\n ShopY = 1\n ShopX = 2\nEnter your choose:");

			shop = girdi.nextInt();
			if (shop == 1) {
				YShopManager yShopManager = new YShopManager();
				res = yShopManager.confirmative(customer1);
				if (res == true) {
					yShopManager.save(customer1);
				} else {
					System.out.println("Unsucsess Verification ");
				}
			} else if (shop == 2) {
				XShopManager xShopManager = new XShopManager();
				xShopManager.save(customer1);
			}

			else {
				System.out.println("Hatalý giriþ");
			} 
		} while (shop == 1 || shop == 2);
	}
}
