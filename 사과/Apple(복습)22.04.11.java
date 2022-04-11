package 상속;

public class Apple {
	int count;
	
	public int countApple() {
		System.out.println("현재 사과의 갯수는 "+this.count+"개 입니다.");
		return this.count;
	}
	public void buyApple(int count) {
		this.count += count;
		System.out.println("사과를 "+count+"만큼 구매하였습니다.");
	}
	public void eatApple(int count) {
		if(this.count>count) {
		this.count -=count;
		System.out.println("사과를 "+count+"개 먹었습니다.");
		}else {
			System.out.println("사과가 부족합니다.");
		}
	}

	public static void main(String[] args) {
		Apple a = new Apple();
			a.buyApple(20);
			a.eatApple(30);
			a.countApple();
			a.eatApple(10);
			a.countApple();
	}
}
// 해멘 이유 : countApple() <= 파라미터값이 없어야 한다.