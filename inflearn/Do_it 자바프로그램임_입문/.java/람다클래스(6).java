package innerClass;

public class TestStringConcat {

	public static void main(String[] args) {

		StringConcatImpl sIml = new StringConcatImpl();
		sIml.makeString("Hello", "Java");
		
		StringConcat concat = (s1,s2) -> System.out.println(s1 + " ,"+s2);
		concat.makeString("hello", "java");
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " ,"+s2);
				
			}
	};
	concat2.makeString("HELLO", "JAVA");

}
}