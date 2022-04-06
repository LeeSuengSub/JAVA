package 상속;

class Account{//계좌
	int deposit;//입금
	int withdraw;//출금
	int totalMoney;//잔고
	
	//getter,setter
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		if(deposit>500000) {
			System.out.println("입금 금액이 초과하였습니다.");
		}else {
			System.out.println("입금한 금액은 =>"+deposit+"원 입니다.");
			this.deposit += deposit;//+를 해준다. //총 입금금액 
			this.totalMoney += deposit;//잔고
			
		}
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {//출금.
		if(this.totalMoney < withdraw) {
			System.out.println("이체할 수 없습니다.");
		}else {
		System.out.println("출금한 금액은 =>"+withdraw+"원 입니다.");
		this.withdraw += withdraw;//출금한 금액은 더해주고
		this.totalMoney -= withdraw;//잔액에서는 빼준다.
		}
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int interest) {//이자를 더해준다.
		this.totalMoney += interest;
	}
	
}

public class 은행 {//은행
	
	//이자를 주는 함수
	public static double paldinterestOnAccount(int money) {
		final double INTEREST_RATE = 0.1;
		return money*INTEREST_RATE;
	}
	
	public static void main(String[] args) {
	Account account = new Account();
	account.setDeposit(1000);
	if(account.getTotalMoney() > 0 && account.getTotalMoney()< 1000000) {
		System.out.println("현재 잔고==>"+account.getTotalMoney()+"원");
		account.setWithdraw(500);
		System.out.println("현재 잔고==>"+account.getTotalMoney()+"원");
		account.setDeposit(500000);//월급이 50만원
		System.out.println("현재 잔고==>"+account.getTotalMoney()+"원");
		account.setDeposit(500000);//보너스가 50만원
		System.out.println("현재 잔고==>"+account.getTotalMoney()+"원");
		account.setDeposit(500000);//야급수당이 50만원
		System.out.println("현재 잔고==>"+account.getTotalMoney()+"원");
		int myMoney  = account.getTotalMoney();
		if(account.getTotalMoney() > 1000000) { //입금 후 잔액이 100만원 이상이면
			int interestMoney = (int)paldinterestOnAccount(myMoney);
			System.out.println("이자는 ===>"+interestMoney);
			account.setTotalMoney(interestMoney);
			System.out.println("현재 잔고는 ===>"+account.getTotalMoney()+"원");
		}
	}
	//은행 bank = new 은행(); <== 은행 함수가 static이 아닌경우 불러오는 방법.
	
}
}
