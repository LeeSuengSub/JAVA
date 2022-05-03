package template;

public class CarTest {

	public static void main(String[] args) {
		
		Car mycar = new ManuelCar();
		mycar.run();
		
		System.out.println("============");
		
		Car yourcar = new AICar();
		yourcar.run();
	}
}
