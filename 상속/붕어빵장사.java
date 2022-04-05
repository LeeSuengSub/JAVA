package 상속;

public class 붕어빵_장사 {

	public static void main(String[] args) {
		붕어빵 B = new 붕어빵("팥붕어빵", 10);
		붕어빵 F = new 붕어빵("슈크림붕어빵",20);
		붕어빵 I = new 붕어빵("피자붕어빵",30);
		
		System.out.println(B.type+"은 "+B.count+"개 주문");
		System.out.println(F.type+"은 "+F.count+"개 주문");
		System.out.println(I.type+"은 "+I.count+"개 주문");
	}

}
