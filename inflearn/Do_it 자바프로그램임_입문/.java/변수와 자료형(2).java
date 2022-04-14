package inflearn;

public class Variable {

	public static void main(String[] args) {
		//선언만 한 후 나중에 지정이 가능하다.
		int num;
		num = 10;
		System.out.println(num);//지정이 잘 되었는지 확인.
		
		int level = 20;
		System.out.println(level);
		
		int ns;
		int numberOfStudent;//나중에 봐도 알아볼수 있게 의미를 명확하게 적어라.
		
		byte bData = -128;//byte는 2의 -7제곱 까지 지원함.
		System.out.println(bData);
		
		byte bData2 = 127;//byte는 2의 7제곱 -1(127)까지만 지원을 한다.
		System.out.println(bData2);
		
		long number = 12345678900L;//L을 적으면 에러가 안남.
		System.out.println(number);//프린트를 해보면 L은 표시 안됨.
		
		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		ch =66;
		
		System.out.println(ch);
		
		int ch2 = 67;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		double dNum = 3.14;
		float fNum = 3.14F;
		
		System.out.println(dNum);
		System.out.println(fNum);
		
	}

}
