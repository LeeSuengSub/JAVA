package inflearn;

class Person{
	String name;
	int age;
	
	public Person() {
//		name = "이름없음";
//		age = 00;
		this("이름없음",00);
		//this앞에는 어떠한 것도 올수 없다. this 뒤에는 가능.
	}
	public Person returnSelf() {
		return this;
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CallAnitherConst {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf());
	}

}
