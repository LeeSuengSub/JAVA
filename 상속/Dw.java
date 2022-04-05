package 상속;

//항상 클래스이름 앞에는 대문자
public class Dw {
	//필드변수 3개
	String name; //학생 이름
	String className; //과정 이름
	int studentCount; //학생 수
	
	public Dw() {
		//오버로딩이라는 매커니즘으로 인해 가능하다.
		//오버로딩: 메소드이름은 같아도 된다. 단, 파라미터값은 달라야한다.
	}
	
	//생성자 특징
	//생성자이름은 class이름과 동일.
	//return type이 없다.
	//생성자이름이 class이름과 다르면 함수로 인식을 하여 오류가 난다.
	public Dw(String name, String className, int studentCount) {
		this.name = name;
		this.className = className;
		this.studentCount = studentCount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	//1. 생성자에 파라미터없이 필드변수 초기화.
	//getter, setter를 이용
	
	
}
