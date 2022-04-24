package inheritance;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		super();//자기의 바로 상위 클래스
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
//		System.out.println("VIPCostomer() 호출");
	}
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	public int getAgentID() {
		return agentID;
	}
}
