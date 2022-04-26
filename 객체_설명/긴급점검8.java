package test;

import java.util.ArrayList;
import java.util.List;

class Chef{
	private int chefAge;

	public int getChefAge() {
		return chefAge;
	}

	public void setChefAge(int chefAge) {
		this.chefAge = chefAge;
	}
	
}

public class 긴급점검8 {
	
	public static List<Chef> getChefLList(){
		List<Chef> list = new ArrayList<Chef>();
		Chef chef1 = new Chef();
		chef1.setChefAge(30);
		Chef chef2 = new Chef();
		chef2.setChefAge(40);
		Chef chef3 = new Chef();
		chef3.setChefAge(50);
		Chef chef4 = new Chef();
		chef4.setChefAge(60);
		
		list.add(chef1);
		list.add(chef2);
		list.add(chef3);
		list.add(chef4);
//		for(Chef chef : list) {
//			System.out.println(chef.getChefAge());// list에 제대로 들어갔는지 확인
//		}
		
		return list;
	}
	public static int getChefListCount(List<Chef> list) {
		int count = 0;
		for(Chef chef : list) {
			if(chef.getChefAge() >= 50) {
				count++;
			}
		}
		System.out.println("나이가 50이상인 요리사의 수 : "+count);
		return count;
	}

	public static void main(String[] args) {
		List<Chef> list = getChefLList();
		getChefListCount(list);
	}

}
