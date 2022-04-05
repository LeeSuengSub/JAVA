package 상속;

class Student_C{
	public void 공부하다() {
		System.out.println("JAVA 공부 중...");
	}
}
class Student_B{
	public void 공부하다() {
		System.out.println("SQL 공부 중...");
	}
}
class Student_A{
	public void 공부하다() {
		System.out.println("HTML 공부 중...");
	}
}

public class School {

	public static void main(String[] args) {
		Student_A a = new Student_A();
		Student_B b = new Student_B();
		Student_C c = new Student_C();
		a.공부하다();
		b.공부하다();
		c.공부하다();
		
	}

}
