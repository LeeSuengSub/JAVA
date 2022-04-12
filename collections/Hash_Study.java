package 컬렉션즈;
//Ctrl + Shift + O
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Onesoju{//원소주도 Object의 자식
	
}

public class Hash_Study {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//왼쪽에 부모가 온다. 부모는 자식을 받을 수 있어서.
		List<String> list2 = new ArrayList<String>();
		list2 = new LinkedList<String>();
		
		//이해를 위한 예시
//		int x = 10;
//		x = 20;
		
		Onesoju onesoju = new Onesoju();
		
		
		
		HashMap<String,Object> map = new HashMap<String,Object>();//import해줘야 함.
		// <앞: key, 뒤: value>.
		Map<String,Object> map2 = new HashMap<String,Object>();
		map.put("1", "참이슬");//HashMap에 데이터 넣기!
		map.put("2", "처음처럼");
		map.put("a", 13);//Object를 적으면 문자도 오고 숫자도 온다.

		System.out.println(map.get("1"));//key이름으로 value 접근.
		//문제1. 한라산 출력하기
		System.out.println(map.get("a"));
	}

}
