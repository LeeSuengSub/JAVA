package 추상화;

//회사에서 안씀, 인터페이스를 설명하기위한 예
abstract class Chef{//추상 클래스 abstract가 있으면 클래스는 추상클래스로 변한다.
	//**(추상메소드 or 일반메소드)를 정의할 수 있음.
	public void 요리를하다() {//일반 메소드
		if(2<4) {
			System.out.println();
		}
	}
	//목적 : 오버라이딩
	abstract public void 비법을전수하다(); //추상메소드, 중괄호가 없다. 
	//호출이 안됨. 상속만 가능함.
}
class Food extends Chef{
	//Food가 오버라이딩을 하면 Food클래스는 인스턴스화(==new 호출) 할 수 있다.
	@Override
	public void 비법을전수하다() {
		if(2<4) {
			//로직구현
		}
		
	}
	
}

public class 추상화를배우자 {
	
	public static void main(String[] args) {
		Food f = new Food();
	}
}
