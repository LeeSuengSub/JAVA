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
	//공유가 목적이기 때문에 private하지 않는다.
}

class MemberService{
	public List<MemberVO> getMemberList(List<MemberVO> list){
		
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
	
}

public class 긴급점검10_선생님식 {

	public static void main(String[] args) {
		
		//1. member 번호,급여 100,200,300 추가
		MemberVO memberA = new MemberVO();
		memberA.setMemberNo("100");
		memberA.setSal(100);
		MemberVO memberB = new MemberVO();
		memberB.setMemberNo("200");
		memberB.setSal(200);
		MemberVO memberC = new MemberVO();
		memberC.setMemberNo("300");
		memberC.setSal(300);
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		list.add(memberA);
		list.add(memberB);
		list.add(memberC);
		
		//2. member 번호가 200인 member 급여 10% 인상된 list 리턴하는 로직 구현
		MemberService service = new MemberService();
		service.getMemberList(list);
		
		//3. member 100,200,300 번호, 급여 출력
		for(MemberVO vo : list) {
			System.out.println(vo.getMemberNo()+", "+vo.getSal());
		}
	}

}
