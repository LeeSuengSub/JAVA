package ?;

public class Chef {

	private static Chef chef = null;//?  ? 
	
	public static Chef getInstance() { //  ??
		if(chef ==null) {
			chef = new Chef();
		}
		return chef;
	}
	
	public void printHello() {
		System.out.println("Hello world");
	}
}
