package 상속;

class Cash{
	int inCash;
	int outCash;
	int totalCash;
	
	public int getInCash() {
		return inCash;
	}
	public void setInCash(int inCash) {
		if(inCash < 500000) {
			this.inCash += inCash;
			this.totalCash += inCash;
			System.out.println(inCash+"원을 입금하였습니다.");
		}else {
			System.out.println("입금금액을 초과하였습니다.");
		}
	}
	public int getOutCash() {
		return outCash;
	}
	public void setOutCash(int outCash) {
		if(this.totalCash > outCash) {			
		this.outCash += outCash;
		this.totalCash -= outCash;
		System.out.println(outCash+"원을 출금합니다.");
		}else {
			System.out.println("통장에 돈이 모잘랐니다.");
		}
	}
	public int getTotalCash() {
//		System.out.println("현재 통장의 잔고는 "+this.totalCash+"입니다.");
		return totalCash;
	}
	public void setTotalCash(int totalCash) {
		this.totalCash += totalCash;
	}
	
}

public class BankP {

	public static double bonus(int money) {
		final double interest_rest = 0.1;
		return money*interest_rest;
	}
	
	public static void main(String[] args) {
		Cash cash = new Cash();
		cash.setInCash(10000);
		if(cash.getTotalCash() > 0) {
			cash.setInCash(50000);
			cash.setInCash(400000);
			cash.setInCash(400000);
			cash.setInCash(400000);
			System.out.println("현재 통장에 잔고는 "+cash.getTotalCash()+"원 입니다.");
			int myMoney = cash.getTotalCash();
			if(cash.getTotalCash() > 1000000) {
				int interestMoney = (int)bonus(myMoney);
				System.out.println("이자는 ==> "+interestMoney);
				cash.setTotalCash(interestMoney);
				System.out.println("통장 잔고는 => "+cash.getTotalCash());
			}
		}
		
	}

}

// 마지막에 이자를 더한 금액이 안나온 이유: setTotalCash부분을 +=가 아닌 =로 더하는게 아님 대입으로 표시되어있었음.