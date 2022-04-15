package inflearn;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String addr;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfor() {
		System.out.println(studentName + ", "+addr);
	}
//	public static void main(String[] args) {
//		Student studentLee = new Student();
//		studentLee.studentName = "이순신";
//		studentLee.addr = "대전광역시 중구 선화동";
//		
//		studentLee.showStudentInfor();
//	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	public static void main(String[] args) {
		
		int i = 10;
		//디폴트 생성자로 작성시
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.addr = "대전시 중구 선화동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.addr = "미국 산호세";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		
	}
}
