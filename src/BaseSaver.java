
public abstract class  BaseSaver implements Saver {
	public void save(Customer customer) {
		System.out.println("User '"+customer.getFirstName()+"' saved on database.");

 }
}