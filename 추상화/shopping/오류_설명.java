package shopping;

import java.util.ArrayList;
import java.util.List;

class Members{
	private String name;
	private List<String> stone;

	public List<String> getStone() {
		return stone;
	}

	public void setStone(List<String> stone) {
		this.stone = stone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Avengers {
	
	public static Members printMemberName(Members member) {
		//방법1.
//		try {
//			if(member == null) {
//				member = new Members();
//				member.getName();
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}//try,catch가 좋은 코드이나 잘 세밀한 코드가 아닌 이상 잘 사용하지 않는다.(이유로는 중괄호가 너무 많아진다.) 그래서 대체로 throw를 사용한다.
		
		//방법2.
		if(member ==null) {
			member = new Members();
		}
		member.setName("토르");
		//멤버 클래스에 stone을 추가하려면 ?
		List<String> list = new ArrayList<String>();
		list.add("파워스톤");
		member.setStone(list);
		//member.setStone 을 해주지 않으면 에러가 남.
		return member;
	}

	public static void main(String[] args) {
		
		Members m = new Members();
		m.setName("토르");
		String name = m.getName();
		System.out.println("m => "+name);
		
		//m과 m2는 다르다.
		Members m2 = new Members();
		String name2 = m2.getName();
		//모든 클래스의 초기값은 null이다. 그래서 String도 초기값은 null이다.
		System.out.println("m2 => "+name2);
		
		//m과 m3가 같다.
		Members m3 = m;
		String name3 = m3.getName();
		System.out.println("m3 => "+name3);
		
		
		//방법1.
		printMemberName(m);
		//방법2.
		printMemberName(new Members());
		
		//예시)
//		int x=10;
//		int y =x;

		//방법3.
		Members m4 = new Members();
		printMemberName(m4);
		List<String> list = new ArrayList<String>();
		list.add("파워스톤");
		m4.setStone(list);
		String powerStone = m4.getStone().get(0);
		System.out.println(powerStone);
		
	}

}
