package ����ƽ;

public class MainStatic {

	public static void main(String[] args) {
		StaticStudy s = new StaticStudy();
		s.count++;
		System.out.println(s.count);
		
		StaticStudy s2 = new StaticStudy();
		System.out.println(s2.count);//static�� ������ �ϱ� ������ s2�� count�� 0�� �ƴ� 1�� ��µ�
		
		//����ƽ���� ����� ����, �޼ҵ�� new (�ν��Ͻ�ȭ�� X) ����� �� �ִ�.
		System.out.println(StaticStudy.GAMGI);
		
		Chef c = Chef.getInstance();//�ν��Ͻ�ȭ�� �� �޼ҵ鸣 ����ƽ���� ������
		//�ַ� ����� ��ü(Ŭ����)�� ������ �����ؼ� ����ϴ� ��Ȳ���� ���� ���.
		
		c.printHello();
	}

}
