package interfaceEx;
//다 구현하지 않아서 추상 메소드가 된다.
public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}


}
