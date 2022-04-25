package test;

class eed{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class 긴급점검4 {

	public static eed call() {
		eed e = new eed();
//		e.setName("아메리카노");
		return e;//.getName();
//		e.setName("칼도");
	}
	
	public static void main(String[] args) {
		//call()메소드를 이용해서 아메리카노 출력
		call().setName("아메리카노");
		System.out.println(call().getName());//메소드로 올라가서 초기화가 되어 null이 출력된다.
		eed e = call();
		e.setName("아메리카노");
		System.out.println(e.getName());
		
	}
}
