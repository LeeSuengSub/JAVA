package inheritance;

public class CustomerTest1 {
	
	public static void main(String[] args) {
	/*
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10110);
		customerLee.setCustomerName("Lee");
	*/
		Customer customerKim = new VIPCustomer(10101, "Kim", 100);
		customerKim.setCustomerID(10111);
		customerKim.setCustomerName("Kim");
		
		customerKim.bonusPoint = 1000;
//		customerKim.
		
//		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
}
}
