package test;

class eed{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class �������4 {

	public static eed call() {
		eed e = new eed();
//		e.setName("�Ƹ޸�ī��");
		return e;//.getName();
//		e.setName("Į��");
	}
	
	public static void main(String[] args) {
		//call()�޼ҵ带 �̿��ؼ� �Ƹ޸�ī�� ���
		call().setName("�Ƹ޸�ī��");
		System.out.println(call().getName());//�޼ҵ�� �ö󰡼� �ʱ�ȭ�� �Ǿ� null�� ��µȴ�.
		eed e = call();
		e.setName("�Ƹ޸�ī��");
		System.out.println(e.getName());
		
	}
}
