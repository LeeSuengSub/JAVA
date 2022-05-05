package interfaceEx;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		Calc calc = new CompleteCalc();
//		Calc clac1 = new Calc();
//		Calc calc2 = new Calculator(); 추상클래스이기에 불가능
		
		
		System.out.println(calc.add(num1, num2));
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}
}
