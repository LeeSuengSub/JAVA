package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
	/*	Customer customer = new Customer(100010,"Lee");
		int price = customer.calcPrice(10000);
		System.out.println("지불 금액은 : "+price+" 이고, "+customer.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(100011,"Kim", 100);
		price = customerKim.calcPrice(10000);
		System.out.println("지불 금액은 : "+price+" 이고, "+customerKim.showCustomerInfo());
	*/
		Customer customerWho = new VIPCustomer(100010, "Who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("지불 금액은 : "+price+" 이고, "+customerWho.showCustomerInfo());
	
		Customer customerGold = new GoldCustomer();
		
	
	}

}
