package 컬렉션즈;

import java.util.ArrayList;

class Student{
	String name;
	int age;
	String addr; //사는 곳
	
	public Student(String name, int age, String addr) {//파라미터가 있는 생성자
		//this == Student
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public Student(){//기본 생성자
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
}
public class ArrayList_study2 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동",26,"부산");//s1에는 student클래스 전체가 다 들어옴. 현재 생성자와 메소드 모두 들어가 있음.
		Student s2 = new Student("아무개",22,"서울");//연습
		
		ArrayList<Student> list = new ArrayList<>();
		ArrayList<Student> li = new ArrayList<>();
		list.add(s1);//student 클래스 추가!
		
		String name = list.get(0).name;//student클래스 불러옴!(생성자 호출 방법)
		int age = list.get(0).age;
		String addr = list.get(0).addr;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		
		int agee = list.get(0).getAge();//student클래스 메소드(함수) 불러옴!(메소드 호출 방법)
		System.out.println(agee);
		
		//age에 나이 대입하는 방법.
		list.get(0).setAge(35);//나이를 대입
		age = list.get(0).getAge();//age에 나이를 불러오기
		System.out.println(age);//age 출력
		
		//연습
		li.add(s2);//클래스 추가
		
		name = li.get(0).name;
		age = li.get(0).age;
		addr = li.get(0).addr;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		
		li.get(0).setAge(21);
		age = li.get(0).getAge();
		System.out.println(age);
		
		
	}

}