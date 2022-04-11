package 상속;

class coffee{
	int drink;
	
	public void rank(int drink) {
		int count = this.drink+=drink;
		
		if(count >=10 && count <20) {
			System.out.println("브론즈");
		}
		if(count >=20 && count <30) {
			System.out.println("실버");
		}
		if(count > 30) {
			System.out.println("골드");
		}
	}

}

public class 카페 {

	public static void main(String[] args) {
		coffee c = new coffee();
		c.rank(5);
		c.rank(6);

}
}