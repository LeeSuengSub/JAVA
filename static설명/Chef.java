package 스태틱;

public class Chef {

	private static Chef chef = null;//스태틱으로 선언된 클래스 변수
	
	public static Chef getInstance() { //스태택으로 선언된 메소드
		if(chef ==null) {
			chef = new Chef();
		}
		return chef;
	}
	
	public void printHello() {
		System.out.println("Hello world");
	}
}
