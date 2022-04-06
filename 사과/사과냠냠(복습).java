package 자습;

public class Apple {

	int count;
	//가지고 있는 사과의 갯수
	public int getAppleCount() {
		System.out.println("현재 소유하고 있는 사과의 갯수는 "+ this.count+"입니다.");
		return this.count;
	}
	//구매한 사과의 갯수
	public void buyAppleCount(int count) {
		System.out.println("사과를 "+ count+"개 구입하였습니다.");
		this.count += count;
	}
	//먹은 사과의 갯수
	public void eatAppleCount(int count) {
		if(this.count>count) {
		System.out.println("먹은 사과의 갯수는 : "+count+"개 입니다.");
		this.count -= count;
		}else {
			System.out.println("사과의 갯수가 부족하여 먹지못합니다.");

		}
	}
}
