package test;

import java.util.ArrayList;
import java.util.List;

class Lunch{
//	private String foodName;
	private List<String> foodName;

	public List<String> getFoodName() {
		return foodName;
	}

	public void setFoodName(List<String> foodName) {
		this.foodName = foodName;
	}

//	public String getFoodName() {
//		return foodName;
//	}
//
//	public void setFoodName(String foodName) {
//		this.foodName = foodName;
//	}
	
	
}

public class 긴급점검6 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("칼국수");
		list.add("스바라시라멘");
		
		Lunch lunch = new Lunch();
		lunch.setFoodName(list);

		for(String foodName : lunch.getFoodName()) {
			System.out.println(foodName);
		}
		
		List<String> li = new ArrayList<String>();
		li.add("치킨");
		li.add("피자");
		
		Lunch lun = new Lunch();
		lun.setFoodName(li);
		
		for(String l : lun.getFoodName()) {
			System.out.println(l);
		}
		
		
		
//		List<Lunch> list = new ArrayList<Lunch>();
//		Lunch lunch = new Lunch();
//		lunch.setFoodName("칼국수");
//		
//		Lunch lunch2 = new Lunch();
//		lunch2.setFoodName("스바라시라멘");
//
//		list.add(lunch);
//		list.add(lunch2);
//		
//		//for-each 표현
//		for(Lunch lun : list) {
//			System.out.println(lun.getFoodName());
//		}
		
		
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		
//		//for-each를 사용해서 list안에 있는 원소 (인덱스 값) 출력!
//		for(int i : list) {
//			System.out.println(i);
//		}
}
}
