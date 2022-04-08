package 상속;


public class Cafe {
	int count;
	
	public void buyCafe(int count) {
		int sum = this.count += count;
		if(10<sum && sum<=20) {
			System.out.println("브론즈");
		}
		if(20<sum && sum<=30) {
			System.out.println("실버");
		}
		if(sum>30) {
			System.out.println("골드");
		}
	}
	
	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		cafe.buyCafe(13);
		cafe.buyCafe(8);
		cafe.buyCafe(9);
		cafe.buyCafe(1);
	}

}
