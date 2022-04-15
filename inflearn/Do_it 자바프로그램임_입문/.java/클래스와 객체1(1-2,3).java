package inflearn;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "이순신");

		studentLee.addr = "대전광역시 중구 선화동";
		
		Student studentKim = new Student(101, "김유신");
		studentKim.addr = "미국 산호세";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
