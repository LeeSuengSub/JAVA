package test;

import java.util.ArrayList;
import java.util.List;

class MemberVO{
	private String memberNo;//멤버 번호
	private int sal;//급여
	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
}

class MemberCode{
	public static final double BONUS = 0.1;
	public static final int MAX_VALUE = 300;
}

class MemberService implements MemberServiceImpl{

	@Override
	public List<MemberVO> getMemberList(List<MemberVO> list) {
		for(int i=0; i<list.size();i++) {
		String memberNo = list.get(i).getMemberNo();
		if(memberNo.equals("200")) {
			int sal = list.get(i).getSal();//멤버 200의 급여
			sal = sal + (int)(sal * MemberCode.BONUS);//double에서 int로 데이터 변환
			list.get(i).setSal(sal);//10% 인상된 급여를 set 해준다.
		}
	}
	return list;
}

	@Override
	public String getMemberNo(List<MemberVO> list) {
		for(int i=0; i<list.size();i++) {
		if(list.get(i).getSal()>=MemberCode.MAX_VALUE) {
			System.out.println(list.get(i).getMemberNo());
			return list.get(i).getMemberNo();
		}
	}
	return null;
}
// 오버라이딩을 위한 주석 처리
//	public List<MemberVO> getMemberList(List<MemberVO> list){
//
//		for(int i=0; i<list.size();i++) {
//			String memberNo = list.get(i).getMemberNo();
//			if(memberNo.equals("200")) {
//				int sal = list.get(i).getSal();//멤버 200의 급여
//				sal = sal + (int)(sal * MemberCode.BONUS);//double에서 int로 데이터 변환
//				list.get(i).setSal(sal);//10% 인상된 급여를 set 해준다.
//			}
//		}
//		return list;
//	}
//	
//	public String getMemberNo(List<MemberVO> list) {
//		for(int i=0; i<list.size();i++) {
//			if(list.get(i).getSal()>=MemberCode.MAX_VALUE) {
//				System.out.println(list.get(i).getMemberNo());
//				return list.get(i).getMemberNo();
//			}
//		}
//		return null;
//	}
}

public class 긴급점검10 {

	public static void main(String[] args) {
		//1. member 번호,급여 100,200,300 추가
		//2. member 번호가 200인 member 급여 10% 인상된 list 리턴하는 로직 구현
		//3. member 100,200,300 번호, 급여 출력
		//4. getMemberNo를 이용해서 급여가 300이상인 멤버의 번호를 리턴하시오.
		//5. MemberService 안에 있는 메소드 2개를 MemberServiceImpl이라는 Interface를 생성 후 오버라이딩으로 수정할 것
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo1 = new MemberVO();
		vo1.setMemberNo("100");
		vo1.setSal(100);
		MemberVO vo2 = new MemberVO();
		vo2.setMemberNo("200");
		vo2.setSal(200);
		MemberVO vo3 = new MemberVO();
		vo3.setMemberNo("300");
		vo3.setSal(300);
		
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		
		MemberService service = new MemberService();
		service.getMemberList(list);
		service.getMemberNo(list);
		
		for(MemberVO v : list) {
			System.out.println("멤버 번호 : "+v.getMemberNo()+", 멤버 급여 : "+v.getSal());
		}
		
	}

}
