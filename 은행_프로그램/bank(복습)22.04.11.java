package 상속;

class cash{
	int nowMoney;
	int inMoney;
	int outMoney;
	
	public int getNowMoney() {
		return nowMoney;
	}
	public void setNowMoney(int nowMoney) {
//		System.out.println("현재 통장에는 "+this.nowMoney+"원이 있습니다.");
		this.nowMoney += nowMoney;
	}
	public int getInMoney() {
		return inMoney;
	}
	public void setInMoney(int inMoney) {
		this.inMoney += inMoney;
		this.nowMoney += inMoney;
		System.out.println(inMoney+"원이 입금되었습니다.");
	}
	public int getOutMoney() {
		return outMoney;
	}
	public void setOutMoney(int outMoney) {
		if(this.nowMoney > outMoney) {			
		this.outMoney += outMoney;
		this.nowMoney -= outMoney;
		System.out.println(outMoney+"원이 빠져나갔습니다.");
		}else {
			System.out.println("통장에 돈이 없습니다.");
		}
	}
}

public class Bank {
	
	public static double bonus(int bonus) {
		final double plus = 0.1;
		return bonus*plus;
	}
	
public static void main(String[] args) {
	cash c = new cash();
	c.setInMoney(3000);
	System.out.println(c.getNowMoney());
	c.setOutMoney(500);
	System.out.println(c.getNowMoney());
	c.setInMoney(500000);
	c.setInMoney(600000);
	System.out.println(c.getNowMoney());
	int myMoney = c.getNowMoney();
	if(c.nowMoney > 1000000) {
		int bonusMoney = (int) bonus(myMoney);
		System.out.println("이자는 "+ bonusMoney);
		c.setInMoney(bonusMoney);
		System.out.println("총 금액은 "+c.getNowMoney());
	}

}
}
