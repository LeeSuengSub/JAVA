package ����ƽ;

public class Chef {

	private static Chef chef = null;//����ƽ���� ����� Ŭ���� ����
	
	public static Chef getInstance() { //���������� ����� �޼ҵ�
		if(chef ==null) {
			chef = new Chef();
		}
		return chef;
	}
	
	public void printHello() {
		System.out.println("Hello world");
	}
}
