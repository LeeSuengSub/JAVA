package inflearn;

public class OperationEX {

	public static void main(String[] args) {
		int age = 24;
		System.out.println(age);
		
		int num = 10;
		int num2 = -num;
		System.out.println(num);
		System.out.println(num2);
		
		num = -num;
		System.out.println(num);
		
		int number = 10;
		System.out.println(number--);
		
		System.out.println(number);
		
		System.out.println(3<5);
		int num3 = 10;
		int num4 = 5;
		boolean flag = (num3 >num4);
		System.out.println(flag);
		
		int num5 = 10;
		int i = 2;
		boolean value = ((num5 = num5+10) <10) || ((i = i+2) <10);
		System.out.println(value);
		System.out.println(num5);
		System.out.println(i);
		
		int num6 = 10;
		System.out.println(num6+=1);
		
		System.out.println(num6%=10);
		num6 -= 1;//num6 = num6-1;
		System.out.println(num6);
		
		int num7 = (5<3) ? 10:20;
		System.out.println(num7);
		
		int num8 = 5;
		int num9 = 10;
		
		int result = num8|num9;
		System.out.println(result);
	
		int num10 = 5;//0000101;
		System.out.println(num10 <<1);//대입을 하지 않았다.(=)X
		System.out.println(num10);//위에서 대입을 하지 않아서 num10은 5이다.
		System.out.println(num10<<2);
		System.out.println(num10<<3);
		
		System.out.println(num10>>1);//0000010;
		
	}

}
