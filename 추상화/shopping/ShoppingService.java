package shopping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ShoppingService implements ShoppingServiceImpl {

			//8. 구매이력이 있는 회원만 조회.
	
	@Override
	public List<UserVO> getUserList(List<UserVO> list) {
		//1. 회원 중 포인트가 가장 많은 회원 정보 조회.(단, 중복데이터는 없다고 가정)
		int max = 0;
		int temp = 0;
		for(int i=0; i<list.size(); i++) {
			if(max < list.get(i).getPoint()) {
				max = list.get(i).getPoint();
				temp = i;
			}
		}
		System.out.println("사용자 No."+list.get(temp).getUserNo()+" , 사용자 포인트."+list.get(temp).getPoint()+" , 사용자 이름."+list.get(temp).getUserName()+" ,사용자 최근 구매일."+list.get(temp).getVisitAt());
		return list;
	}

	@Override
	public List<UserVO> getFindByName(List<UserVO> list, String word) {
		//2. 회원 중 앞글자에 S가 들어간 회원 정보 조회.
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i).getUserName().substring(0,1);
			if(str.equals(word)) {
				System.out.println(list.get(i).getUserName());
			}
		}
		return list;
	}

	@Override
	public int getSleeperUserCount(List<UserVO> list) {
		//4. 휴먼계정 인원 수 조회.
		int count = 0;
		for(int i=0; i<list.size();i++) {
			if(list.get(i).isSleeper()) {
				++count;
			}
		}
		System.out.println("휴먼 계정은 총 "+count+"개 입니다.");
		return count;
	}

	@Override
	public List<UserVO> updateNotSleeperToSleeper(List<UserVO> list, int days) {
//		//3. 현재날짜 기준으로 90일동안 방문 없었던 회원 휴먼 계정으로 수정.
//		LocalDate currentDate = LocalDate.now();
////		System.out.println(currentDate);
//		LocalDate date = currentDate.minusDays(days);
////		System.out.println(date);
//		for(int i=0; i<list.size();i++) {
//			String listVisit = list.get(i).getVisitAt();
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//			LocalDate time = LocalDate.parse(listVisit,formatter);
//			if(date.isAfter(time)) {
//				list.get(i).setSleeper(true);
//			}
//			System.out.println("이름은 "+list.get(i).getUserName()+", 휴면계정여부: "+list.get(i).isSleeper());
//		}
//		return list;
		
		Date d = new Date();
		//1. 오늘날짜를 구해야 함.
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd",Locale.KOREA);
		String strToday = formatter.format(Calendar.getInstance().getTime());//오늘날짜 리턴
		Date today = null;//오늘 날짜
		Date visit = null;//방문 날짜
		try {
			for(int i=0; i<list.size();i++) {
				String strVisitAt = list.get(i).getVisitAt();
			today = formatter.parse(strToday);
			visit = formatter.parse(strVisitAt);
			long diffDay = (today.getTime() - visit.getTime()) / (1000*60*60*24); //일 구하기
			if(diffDay >= days) {
				list.get(i).setSleeper(true);
			}else {
				list.get(i).setSleeper(false);
			}
			System.out.println(list.get(i).getUserName()+", "+list.get(i).isSleeper());
			}
		} catch (ParseException e) {
			e.printStackTrace(); //에러를 추적하겠다!
		}
		return list;
	}

	@Override
	public List<UserVO> updatePoint(List<UserVO> list, int point) {
		//5. 휴먼계정이 아닌 회원에게 100포인트 추가 지급.
		for(int i=0; i<list.size(); i++) {
			int getPoint = list.get(i).getPoint();
			if(!list.get(i).isSleeper()) {
				getPoint = list.get(i).getPoint() + point;
			}
			System.out.println(getPoint);
		}
		return list;
	}

	@Override
	public UserVO getPointRankerUser(List<UserVO> list) {
		//6. 포인트가 가장 높은 회원 조회.(단, 중복데이터는 없다고 가정)
		int max = 0;
		int temp = 0;
		for(int i=0; i<list.size(); i++) {
			if(max < list.get(i).getPoint()) {
				max = list.get(i).getPoint();
				temp = i;
			}
		}
		System.out.println("사용자 No."+list.get(temp).getUserNo()+" , 사용자 포인트."+list.get(temp).getPoint()+" , 사용자 이름."+list.get(temp).getUserName()+" ,사용자 최근 구매일."+list.get(temp).getVisitAt());
		return null;
	}

	@Override
	public List<UserVO> getPurchaseRankerUser(List<UserVO> list, ProductVO vo, int userNo) {
		//7. 특정 회원에게 상품구매 발생.
	    //   구매한 상품의 가격 5%가 포인트로 지급.
		double plusPoint = 0.05;
		for(int i=0; i<list.size();i++) {
			int totalPoint = list.get(i).getPoint();
			double pricePoint = vo.getPrice()*plusPoint;
			if(list.get(i).getUserNo()==userNo) {
//				System.out.println(pricePoint);
				totalPoint = list.get(i).getPoint()+(int)pricePoint;
			}
//			System.out.println(list.get(i).getPoint());
			System.out.println("회원이름은 : "+list.get(i).getUserName()+", 총 포인트 : "+totalPoint);
		}
		return list;
	}

	

}
