package prog2_1_objects;

public class Main {

	public static void main(String[] args) {
		Customer c1 = new Customer("Joe", "Smith", "332-221-4444");
		Address c1BA = new Address("10 Adams", "Fairfield", "IA", "52556");
		Address c1SA = new Address("110 Burlington", "Seattle", "WA", "12345");
		c1.setBillingAddress(c1BA);
		c1.setShippingAddress(c1SA);
		
		Customer c2 = new Customer("Paul", "Johnson", "342-251-4004");
		Address c2BA = new Address("110 Burlington", "Chicago", "IL", "12357");
		Address c2SA = new Address("1000 N 4th St", "Fairfield", "IA", "52557");
		c2.setBillingAddress(c2BA);
		c2.setShippingAddress(c2SA);
		
		Customer[] cArr = new Customer[]{c1, c2};
		String chkCity = "Chicago";
		for(Customer c : cArr) {
			if(c.getBillingAddress().getCity() == chkCity ) {
				System.out.println(c.toString());
			}
		}
	}

}
