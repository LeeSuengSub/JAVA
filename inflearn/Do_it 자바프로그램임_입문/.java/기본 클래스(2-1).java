package object;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");//한번 선언한 문자열은 변하지 않는다.(abc => abcd X)
		String str2 = new String("abc");
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);
		
		String str01 = new String("java");
		String str02 = new String("android");
		
		System.out.println(System.identityHashCode(str01));
		
		str01 = str01.concat(str02);
		
		System.out.println(str01);
		System.out.println(System.identityHashCode(str01));
	}

}
