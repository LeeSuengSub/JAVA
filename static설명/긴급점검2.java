package ����ƽ;

class Dw{
	//���������� ����Ʈ�� �ۺ�
	public String className;
	String studentName;
	
//	public Dw() {//�����ε�
//		
//	}
	//������ ���� : �ʱ�ȭ
	public Dw(String className,String studentName) {
		this.className = className;
		this.studentName = studentName;
	}
}

public class �������2 {
	
	public static int getNumber() { //������ 20�̻� ���� �ؾ���!
		int x = 0;
		if(x<=20) {
			x = 20;
		}
		return x;
		//return new Dw("����Ʈ��&�۰���","ȫ�浿"); ���� ����
	}
	
	public static Dw printStudent() {
//		Dw d = new Dw("����Ʈ��&�۰���", "ȫ�浿");
//		return d;
		return new Dw("����Ʈ��&�۰���","ȫ�浿");
	}
	
	public static void main(String[] args) {
		//���1.
		Dw d = printStudent();
		System.out.println(d.className+" ,"+d.studentName);
		
		System.out.println("===============");
		//���2.
		System.out.println(printStudent().className);
		System.out.println(printStudent().studentName);
		
		System.out.println("===============");
		System.out.println(getNumber());
	}

}
