package inflearn;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
		//this를 지워도 오류는 안나지만 setYear에 파라미터에 있는 year를 참조하게 된다.
		
	}
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		
		System.out.println(b2);
		b2.printThis();
	}

}
