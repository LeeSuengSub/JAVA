package 상속;

public class Home {
	
	public static void main(String[] args) {
		//생성자를 이용해서 코드를 단축시킨다.
		Dw dw = new Dw("홍길동","반응형개발", 13);//인스턴스화 하다.(== 파일을 불러오다.)
		Dw dw05 = new Dw("김길동","멀티플랫폼개발",30);
		System.out.println(dw.name);
		System.out.println(dw.className);
		System.out.println(dw.studentCount);
		
		System.out.println(dw05.name);
		System.out.println(dw05.className);
		System.out.println(dw05.studentCount);
		Dw dw02 = null;
		if(dw02 == null) {
			dw02 = new Dw();
		}
		//위, 아래 모두 같은 식이다.
		int x = 0;
		if(x==0) {
			x = 10;
		}
	}
}