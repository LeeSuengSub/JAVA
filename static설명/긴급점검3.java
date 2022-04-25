package test;

import java.util.ArrayList;
import java.util.List;

//class Singer{
//	public String SingerName; //가수 이름
//	
//	public Singer(String singerName) {
//		this.SingerName = singerName;
//	}
//}
//
//public class 긴급점검3 {
//	
//	public static List<Singer> getListSinger(ArrayList<Singer> list){
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).SingerName);
//		}
//		return list;
//	}
//	
//	public static Singer getSinger(ArrayList<Singer> list){
//		for(int i=0; i<list.size();i++) {
//			if(list.get(i).SingerName.equals("김종국")) {
//				System.out.println(list.get(i).SingerName);
//			}
//		}
//		return null;
//	}
//	
//	public static void main(String[] args) {
//		ArrayList<Singer> list = new ArrayList<Singer>();
//		list.add(new Singer("김종국"));
//		list.add(new Singer("서인국"));
//		list.add(new Singer("방용국"));
//		//1. getListSinger()이용해서 김종국, 서인국, 방용국 list 출력!
//		getListSinger(list);
//		System.out.println("-----------");
//		//2. getSinger()이용해서 김종국만 출력!
//		getSinger(list);
//		
//	}
class Singer{
	public String SingerName; //가수 이름
	public Singer(String singerName) {
		this.SingerName = singerName;
	}
}


public class 긴급점검3 {
	
	//리턴타입을 먼저 봐요!
	public static List<Singer> getListSinger(){
		//파라미터가 없느 애들은 메소드안에서 만든다.
		List<Singer> list = new ArrayList<Singer>();//강한 관계
		list.add(new Singer("김종국"));
		list.add(new Singer("서인국"));
		list.add(new Singer("방용국"));
		return list;
	}
	
	public static List<Singer> getListSinger(List<Singer> list){
		//파라미터가 있는 애들은 메소드 밖에서 만든다.
		list.add(new Singer("김종국"));
		list.add(new Singer("서인국"));
		list.add(new Singer("방용국"));
		
		return list;
	}
	
	public static Singer getSinger(Singer s) {
		s = new Singer("김종국");
		return s;
	}
	
	public static Singer getSinger(){
		return new Singer("김종국");
	}
	
	public static void main(String[] args) {
		//1. getListSinger()이용해서 김종국, 서인국, 방용국 list 출력!
		ArrayList<Singer> list = new ArrayList<Singer>();
		list.add(new Singer("김종국"));
		list.add(new Singer("서인국"));
		list.add(new Singer("방용국"));
		getListSinger(list);
		
		//2. getSinger()이용해서 김종국만 출력!
//		System.out.println(getSinger().SingerName);
		Singer s = new Singer("김종국");
//		String singerName = 
	}
}

