package ����ƽ;
//static�� ���� Ŭ����
public class Chef2 {
	static Chef2 c2;
	
	public static Chef2 getInstance() {
		c2 = new Chef2();//static �޼ҵ忡�� static�� �ü� �ִ�.
		
		return new Chef2();
	}
	
	public void printHello() {
		System.out.println("Hello world");
	}
}
