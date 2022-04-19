package staticEx;

public class Company {

	private static Company instance = new Company();
	
	private Company(){};
	
	public static Company getInstance() {
		//바보적인 코드
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
