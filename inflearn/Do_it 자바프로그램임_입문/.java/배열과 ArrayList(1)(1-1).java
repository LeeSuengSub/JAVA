package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] number = new int[3];//
//		int number[] = new int[10]; //가능
//		int[] number = new int[] {0,1,2};// 초기화를 할때는 대괄호에 숫자를 쓰면 안되고 중괄호에 대입숫자를 입력한다.
		
		int[] numbers = {0,1,2};
		
		System.out.println(number.length);
		System.out.println(numbers.length);
		
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	
		int[] number0 = new int[] {1,2,3};
		
		double[] studentIDs = new double[5];
		for(int i=0; i<studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}
		
		int[] number1 = new int[] {1,2,3};
		
		for(int i=0; i<3;i++) {//i<3 : <=2를 적어도 결과값은 같으나 <3을 선호함
			System.out.println(number1[i]);
		}
	}
}
