package abstractEX;

public abstract class Computer {
	 //{}//중괄호를 여닫는 행위 : body
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	//추상클래스를 만드는 이유 : 상속을 하기 위해서
}
