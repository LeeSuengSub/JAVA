package inflearn;

public class Bit_print {

	public static void main(String[] args) {
		int Num = 10;//10진수
		int bNum = 0B1010;//2진수
		int oNum = 012;//8진수
		int hNum = 0XA;//16진수
		
		System.out.println("10진수의 숫자 10은 => "+Num);
		System.out.println("2진수의 숫자 10은 => "+bNum);
		System.out.println("8진수의 숫자 10은 => "+oNum);
		System.out.println("16진수의 숫자 10은 => "+hNum);
		
		
		  int num1 = 0B00000000000000000000000000000101; //5

		  int num2 = 0B11111111111111111111111111111011; //-5

		  int sum = num1 + num2;

		  System.out.println("양수 5 => "+num1);

		  System.out.println("음수 5=>"+num2);

		  System.out.println("두개의 식을 더하면 =>"+sum);
	}

}