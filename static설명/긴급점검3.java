package test;

import java.util.ArrayList;
import java.util.List;

//class Singer{
//	public String SingerName; //���� �̸�
//	
//	public Singer(String singerName) {
//		this.SingerName = singerName;
//	}
//}
//
//public class �������3 {
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
//			if(list.get(i).SingerName.equals("������")) {
//				System.out.println(list.get(i).SingerName);
//			}
//		}
//		return null;
//	}
//	
//	public static void main(String[] args) {
//		ArrayList<Singer> list = new ArrayList<Singer>();
//		list.add(new Singer("������"));
//		list.add(new Singer("���α�"));
//		list.add(new Singer("��뱹"));
//		//1. getListSinger()�̿��ؼ� ������, ���α�, ��뱹 list ���!
//		getListSinger(list);
//		System.out.println("-----------");
//		//2. getSinger()�̿��ؼ� �������� ���!
//		getSinger(list);
//		
//	}
class Singer{
	public String SingerName; //���� �̸�
	public Singer(String singerName) {
		this.SingerName = singerName;
	}
}


public class �������3 {
	
	//����Ÿ���� ���� ����!
	public static List<Singer> getListSinger(){
		//�Ķ���Ͱ� ���� �ֵ��� �޼ҵ�ȿ��� �����.
		List<Singer> list = new ArrayList<Singer>();//���� ����
		list.add(new Singer("������"));
		list.add(new Singer("���α�"));
		list.add(new Singer("��뱹"));
		return list;
	}
	
	public static List<Singer> getListSinger(List<Singer> list){
		//�Ķ���Ͱ� �ִ� �ֵ��� �޼ҵ� �ۿ��� �����.
		list.add(new Singer("������"));
		list.add(new Singer("���α�"));
		list.add(new Singer("��뱹"));
		
		return list;
	}
	
	public static Singer getSinger(Singer s) {
		s = new Singer("������");
		return s;
	}
	
	public static Singer getSinger(){
		return new Singer("������");
	}
	
	public static void main(String[] args) {
		//1. getListSinger()�̿��ؼ� ������, ���α�, ��뱹 list ���!
		ArrayList<Singer> list = new ArrayList<Singer>();
		list.add(new Singer("������"));
		list.add(new Singer("���α�"));
		list.add(new Singer("��뱹"));
		getListSinger(list);
		
		//2. getSinger()�̿��ؼ� �������� ���!
//		System.out.println(getSinger().SingerName);
		Singer s = new Singer("������");
//		String singerName = 
	}
}

