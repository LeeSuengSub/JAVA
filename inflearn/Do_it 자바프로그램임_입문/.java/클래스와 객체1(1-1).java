package inflearn;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String addr;
	
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
}
