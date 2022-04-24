package inheritance;

public class GoldCustomer extends Customer {

	public GoldCustomer() {
		bonusRatio = 0.05;
	}
	@Override //에노테이션
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo();
	}



}
