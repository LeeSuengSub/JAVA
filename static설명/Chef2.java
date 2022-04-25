package 스태틱;
//static이 없는 클래스
public class Chef2 {
	static Chef2 c2;
	
	public static Chef2 getInstance() {
		c2 = new Chef2();//static 메소드에는 static만 올수 있다.
		
		return new Chef2();
	}
	
	public void printHello() {
		System.out.println("Hello world");
	}
}
