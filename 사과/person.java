package 상속;

public class Person {

	public static void main(String[] args) {
//		내가 쓴 식.
//		System.out.println("현재 소유한 사과의 갯수 : "+A.count);
//		int buy = A.buyApple(10);
//		System.out.println("구매한 사과의 갯수 : "+buy);
//		if(A.count >0) {
//			int eat = A.eatApple(4);
//			System.out.println("먹고 남은 사과의 갯수 : "+eat);
//		}
//		선생님 식
		Apple A = new Apple();

		System.out.println("현재 사과는 : "+A.getAppleCount()+"개 있습니다.");
		A.buyApple(20);
		if(A.getAppleCount()>0) {
			System.out.println("현재 사과는 : "+A.getAppleCount()+"개 있습니다.");
			A.eatApple(30);
			System.out.println("현재 사과는 : "+A.getAppleCount()+"개 있습니다.");
			A.buyApple(20);
			System.out.println("현재 사과는 : "+A.getAppleCount()+"개 있습니다.");
			A.eatApple(30);
			System.out.println("현재 사과는 : "+A.getAppleCount()+"개 있습니다.");
		}
		
	}
}