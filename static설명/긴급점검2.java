package 스태틱;

class Dw{
	//접근지정자 디폴트는 퍼블릭
	public String className;
	String studentName;
	
//	public Dw() {//오버로딩
//		
//	}
	//생성자 목적 : 초기화
	public Dw(String className,String studentName) {
		this.className = className;
		this.studentName = studentName;
	}
}

public class 긴급점검2 {
	
	public static int getNumber() { //무조건 20이상 리턴 해야함!
		int x = 0;
		if(x<=20) {
			x = 20;
		}
		return x;
		//return new Dw("스마트웹&앱과정","홍길동"); 같은 원리
	}
	
	public static Dw printStudent() {
//		Dw d = new Dw("스마트웹&앱과정", "홍길동");
//		return d;
		return new Dw("스마트웹&앱과정","홍길동");
	}
	
	public static void main(String[] args) {
		//방법1.
		Dw d = printStudent();
		System.out.println(d.className+" ,"+d.studentName);
		
		System.out.println("===============");
		//방법2.
		System.out.println(printStudent().className);
		System.out.println(printStudent().studentName);
		
		System.out.println("===============");
		System.out.println(getNumber());
	}

}
