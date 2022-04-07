package 컬렉션즈;

import java.util.ArrayList;

public class ArrayList_study {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();//ctrl +Shift+o
		
//		add: 데이터를 list에 삽입.
//		문제: list에 저장된 곱창 파스타는 몇개?
		list.add("시금치 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		
		int len = list.size(); //list 길이 호출
		System.out.println("list의 길이는 ==>"+len);
		
		String value = list.get(0);
		System.out.println(value);
		String value2 = list.get(1);
		System.out.println(value2);
		
		
		int count =0;
		for(int i=0; i<len; i++) {
			if(list.get(i).equals("곱창 파스타")) {
				++count;
			}
		}
		System.out.println("곱창 파스타의 갯수는 "+count);
		
		//int를 담는 ArrayList
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //생성자
		list2.add(10);
		list2.add(40);
		list2.add(60);
		list2.add(80);
		list2.add(30);
		System.out.println(list2.size());
//		list2.remove(1); 제거하는 방법
//		배열과 다르게 내용이 삭제되면 공간이 비는게 아니라 뒤에있는 내용들이 앞으로 당겨진다.
//		삭제되는 내용들이 고유주소를 다음 내용들에게 넘겨주고 삭제된다.그러면 다음 내용들은 고유주소를 보고 위치를 변경한다.
		
		//문제1. list애 추가된 숫자 총합 구하기
		int sum = 0;
		for(int i=0; i<list2.size();i++) {
			sum += list2.get(i);
		}
		System.out.println(sum);
		int sum2 = 0;
		for(int i=0; i< list2.size();i++) {
			if(list2.get(i)!=40) {
				sum2 += list2.get(i);
			}
		}
		System.out.println(sum2);
				
		
		
		
	}

}
