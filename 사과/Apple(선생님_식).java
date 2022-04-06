package 상속;

public class Apple {

	int count;
	//선생님 식
	public int getAppleCount() {//현재 사과 수량
		return this.count;
	}
	
	public void buyApple(int count) {
		System.out.println("구매한 사과는 "+count+"입니다.");
		this.count += count;
	}
	public void eatApple(int count) {
		if(this.count >=count) {			
		System.out.println("사과를 "+count+"개 먹었어요~");
		this.count -= count;
		}else {
			System.out.println("사과가 부족해요.");
		}
	}
	
	
//	내가 쓴 식
//	public int buyApple(int count){
//		int buy = this.count += count;
//		return buy;
//	}
//	public int eatApple(int count) {
//		int eat = this.count -=count;
//		return eat;
//	}

}
