
public class YShopManager extends BaseSaver implements Verification{
	public void save(Customer customer) {
		System.out.println("YShop User '"+customer.getFirstName()+"' saved on database.");

 }

	Customer customerv = new Customer(1,"Tuna","Torun",2002);
	@Override
	public boolean confirmative(Customer cust) {
		if(cust.firstName == customerv.firstName
				&& cust.lastName == customerv.lastName
				&& cust.id == customerv.id
				&& cust.birthYear == customerv.birthYear) {
			System.out.println("User Verified");
			return true;
		}
		else {
			System.out.println("User Not Verified");
			return false;

		}
	}
}





