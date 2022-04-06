package 자습;

class Account{
	int inCash;//입금
	int outCash;//출금
	int totalCash;//잔고	
	
	public int getInCash() {
		return inCash;
	}
	public void setInCash(int inCash) {
		if(inCash <500000) {			
		System.out.println(inCash+"를 입금하였습니다.");
		this.inCash += inCash;
		this.totalCash+= inCash;
		}else {
			System.out.println("입금 금액이 초과하였습니다.");
		}
	}
	public int getOutCash() {
		return outCash;
	}
	public void setOutCash(int outCash) {
		if(this.totalCash > outCash) {			
			this.outCash += outCash;
			this.totalCash -= outCash;
			System.out.println(outCash+"원이 출금되었습니다.");
		}else {			
			System.out.println("통장 잔고가 부족합니다.");
		}
	}
	public int getTotalCash() {
		System.out.println("현재 통장의 잔고는 "+ this.totalCash);
		return totalCash;
	}
	public void setTotalCash(int totalCash) {
		this.totalCash = totalCash;
	}
	
}

public class Bank {
	public static double bonus(int money) {
		final double interest_Rate = 0.1;
		return money * interest_Rate;
	}
	
	public static void main(String[] args) {
		Account a = new Account();
//		if(a.getTotalCash() > 0) {
			a.setInCash(100000);
			a.setOutCash(400);
			a.getTotalCash();
			a.setInCash(80000);
			a.setOutCash(400);
			a.getTotalCash();
			a.setInCash(400000);
			a.setInCash(300000);
			int money = a.getTotalCash();
			if(a.getTotalCash() > 1000000) {
				System.out.println("이자가 10%");
				int intersetMoney = (int)bonus(money);
				System.out.println("이자는 => "+intersetMoney);
				a.setTotalCash(intersetMoney);
				a.getTotalCash();
			}
			
//		}
		
	}

}
