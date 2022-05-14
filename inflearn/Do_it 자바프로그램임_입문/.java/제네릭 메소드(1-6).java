package Generic;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		
		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();//printer는 Object여서 Powder에 대입하려면 앞에 (Powder)를 붙여야 한다.
		System.out.println(printer);
		
		TreeDPrinter<Plastic> printer01 = new TreeDPrinter<Plastic>();
		
		printer01.setMaterial(new Plastic());
		Plastic plastic = printer01.getMaterial();//printer는 Object여서 Powder에 대입하려면 앞에 (Powder)를 붙여야 한다.
		System.out.println(printer01);
		
//		TreeDPrinter<Water> printerWater = new TreeDPrinter<Water>();
		
//		printerWater.setMaterial(new Water());
//		System.out.println(printerWater);
		
		printer01.printing();
	}
}
