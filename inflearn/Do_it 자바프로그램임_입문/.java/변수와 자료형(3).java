package inflearn;

public class contant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final float PI = 3.14f;
		
		final int STUDENT_NUM = 30;//상수는 대문자로 쓰면 변수와 구분하기 쉽다.
		
		int num = 0;
		if(num == 30) {}
		
		System.out.println(STUDENT_NUM);
		
		byte bNumber = 10;
		int numBer = bNumber;
		
		System.out.println(numBer);
		
		long lNum = 10;
		float fNumber = lNum;
		
		System.out.println(fNumber);
		
		double dNumber = fNumber+numBer;
		System.out.println(dNumber);
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		
		System.out.println(iNum);
		
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum;//int로 변환하고 더하였다.
		int num2 = (int)(dNum + fNum);//더한 다음 int로 변환하였다.
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
