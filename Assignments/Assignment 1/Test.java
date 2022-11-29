package Room1;
public class Test {

	public static void main(String[] args) {

		Customer c = new Customer();
		c.setFirstName("abhi");
		c.setLastName("kumar");
		c.setbankbalance("150000");

		System.out.println("First Name:" + c.getFirstName());
		System.out.println("Last Name:" + c.getLastName());
		System.out.println("Credit Card:" + c.getCreditCard());
	}

}
