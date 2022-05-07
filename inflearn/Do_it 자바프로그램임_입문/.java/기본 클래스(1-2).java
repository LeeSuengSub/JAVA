package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID)
				return true;
			else
				return false;
		}
		return false;
	}
	
	public int hashCod() {
		return studentID;
	}
}

public class EquealsTest {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2);//힙메모리가 다름
		System.out.println(str1.equals(str2));
	
		Student std1 = new Student(10001,"Tomas");
		Student std2 = new Student(10001,"Tomas");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
	
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(System.identityHashCode(std2));
		
		System.out.println(std1.hashCode());//해시코드 메모리가 재정의 되었기 때문에 결과같이 같다.
		System.out.println(std2.hashCode());
	}
}
