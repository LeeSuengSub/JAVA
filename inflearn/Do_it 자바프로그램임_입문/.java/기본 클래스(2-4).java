package object;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//Class c
		
		String str = new String("abc");
		
		Person person = new Person();
		
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("object.Person");// 동적로딩
		System.out.println(pClass3.getName());
		
		Person p = new Person();
		
		Class pClass00 = Class.forName("object.Person");
	
		Person p2 = (Person)pClass00.newInstance();
		System.out.println(p);
		System.out.println(p2);
	}
}
