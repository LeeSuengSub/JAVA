package 스태틱;

public class MainStatic {

	public static void main(String[] args) {
		StaticStudy s = new StaticStudy();
		s.count++;
		System.out.println(s.count);
		
		StaticStudy s2 = new StaticStudy();
		System.out.println(s2.count);//static은 공유를 하기 때문에 s2의 count는 0이 아닌 1이 출력됨
		
		//스태틱으로 선언된 변수, 메소드는 new (인스턴스화를 X) 사용할 수 있다.
		System.out.println(StaticStudy.GAMGI);
		
		Chef c = Chef.getInstance();//인스턴스화가 된 메소들르 스태틱으로 공유함
		//주로 공통된 객체(클래스)를 여러개 생성해서 사용하는 상황에서 많이 사용.
		
		c.printHello();
	}

}
