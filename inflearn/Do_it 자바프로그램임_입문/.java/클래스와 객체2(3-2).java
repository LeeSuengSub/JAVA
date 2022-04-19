package staticEx;

public class studentTest1 {
//	ID가 자동으로 증가하는 메소드 구현
	public static void main(String[] args) {
		System.out.println(Student.getSerialNum());
		Student studentJ = new Student();
//		studentJ.studentID = 1000;
		System.out.println(studentJ.getSerialNum());
		
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		//static변수는 바로 클래스이름으로 참조함.
		
		//System.out.println(Student.serialNum);
		//System.out.println(Student.serialNum);
		
	}

}
