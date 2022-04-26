package test;

import java.util.ArrayList;
import java.util.List;

class Food{
//	private String foodName;
	private String foodName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

//	public List<String> getFoodName() {
//		return foodName;
//	}
//
//	public void setFoodName(List<String> foodName) {
//		this.foodName = foodName;
//	}

	
//	public String getFoodName() {
//		return foodName;
//	}
//
//	public void setFoodName(String foodName) {
//		this.foodName = foodName;
//	}
	
}

class School{
	
}

public class 긴급점검5 {

	public static void main(String[] args) {
//		Food food = new Food();
//		food.setFoodName("카레");
//		System.out.println("음식이름은 : "+food.getFoodName());
		
		List<Food> list = new ArrayList<Food>();
		list.add(new Food());
		
		
		//컬렉션 : List
		//배열!! 배열하고 다르게 길이를 유동적으로 컨트롤
		//List<Integer> li = new ArrayList<Integer>();
		
		//방법1.
		Food f = new Food();
		list.add(f);//null을 넣을 수 없다.
		//방법2.
		list.add(new Food());//list안에 데이터를 담으려고 불러온것.
		
		Food fo = new Food();
		//Food 클래스 안에 변수나 메소드를 사용하려고 new(인스턴스화)
		Food f2 = null;
		
		//1. list안에 데이터 타입 확인
		List<Food> ls = new ArrayList<Food>();
		//2. 클래스 타입이면 클래스를 호출해준다.
		Food f3 = new Food();// 무한정으로 사용가능
		new Food();// 일회용
		//3. 호출한 클래스를 list에 담는다.
		f3.setFoodName("김치우동");
		ls.add(f3);
		
		Food f4 = new Food();
		f4.setFoodName("우동");
		ls.add(f4);
		
		Food f5 = ls.get(0);//get(0)은 리턴 타입이 Food이다
		String f9 = ls.get(0).getFoodName();//getFoodName은 리턴타입이 String이다
		
		//for문 이용해서 출력하기
		for(int i =0; i<ls.size(); i++) {
			//add : 추가
			//get : 가져오는
			//remove : 삭제
			System.out.println(ls.get(i).getFoodName());
		}
		System.out.println();
		//for-each문
		
		Food f6 = ls.get(0);//Food food : ls와 같다. 단지 get(0)이 생략되었다.
		for(Food food : ls) {//Food f6 = ls.get(0);와 같다
			System.out.println(food.getFoodName());
		}
	}

}