package 추상화;

public class 백종원의요리교실 implements ServiceImple,UserImple{//클래스를 상속받을수 있고 인터페이스도 상속을 받을수 있다. 그러나 그렇게 쓰지는 않는다.
	//상속과 인터페이스의 차이는 오버라이딩이다.
	@Override
	public void 라면끓이는방법() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 찌개끓이는방법() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 요리를맛보다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 요리를평가하다() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
//		ServiceImple s = new ServiceImple(); 불가능, 인터페이스도 인스턴스화 불가능
	}

}
