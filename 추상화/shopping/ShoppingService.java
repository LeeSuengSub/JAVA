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

			//8. �����̷��� �ִ� ȸ���� ��ȸ.
	
	@Override
	public List<UserVO> getUserList(List<UserVO> list) {
		//1. ȸ�� �� ����Ʈ�� ���� ���� ȸ�� ���� ��ȸ.(��, �ߺ������ʹ� ���ٰ� ����)
		int max = 0;
		int temp = 0;
		for(int i=0; i<list.size(); i++) {
			if(max < list.get(i).getPoint()) {
				max = list.get(i).getPoint();
				temp = i;
			}
		}
		System.out.println("����� No."+list.get(temp).getUserNo()+" , ����� ����Ʈ."+list.get(temp).getPoint()+" , ����� �̸�."+list.get(temp).getUserName()+" ,����� �ֱ� ������."+list.get(temp).getVisitAt());
		return list;
	}

	@Override
	public List<UserVO> getFindByName(List<UserVO> list, String word) {
		//2. ȸ�� �� �ձ��ڿ� S�� �� ȸ�� ���� ��ȸ.
		
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
		//4. �޸հ��� �ο� �� ��ȸ.
		int count = 0;
		for(int i=0; i<list.size();i++) {
			if(list.get(i).isSleeper()) {
				++count;
			}
		}
		System.out.println("�޸� ������ �� "+count+"�� �Դϴ�.");
		return count;
	}

	@Override
	public List<UserVO> updateNotSleeperToSleeper(List<UserVO> list, int days) {
//		//3. ���糯¥ �������� 90�ϵ��� �湮 ������ ȸ�� �޸� �������� ����.
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
//			System.out.println("�̸��� "+list.get(i).getUserName()+", �޸��������: "+list.get(i).isSleeper());
//		}
//		return list;
		
		Date d = new Date();
		//1. ���ó�¥�� ���ؾ� ��.
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd",Locale.KOREA);
		String strToday = formatter.format(Calendar.getInstance().getTime());//���ó�¥ ����
		Date today = null;//���� ��¥
		Date visit = null;//�湮 ��¥
		try {
			for(int i=0; i<list.size();i++) {
				String strVisitAt = list.get(i).getVisitAt();
			today = formatter.parse(strToday);
			visit = formatter.parse(strVisitAt);
			long diffDay = (today.getTime() - visit.getTime()) / (1000*60*60*24); //�� ���ϱ�
			if(diffDay >= days) {
				list.get(i).setSleeper(true);
			}else {
				list.get(i).setSleeper(false);
			}
			System.out.println(list.get(i).getUserName()+", "+list.get(i).isSleeper());
			}
		} catch (ParseException e) {
			e.printStackTrace(); //������ �����ϰڴ�!
		}
		return list;
	}

	@Override
	public List<UserVO> updatePoint(List<UserVO> list, int point) {
		//5. �޸հ����� �ƴ� ȸ������ 100����Ʈ �߰� ����.
		int getPoint = 0;
		for(int i=0; i<list.size(); i++) {
			if(!list.get(i).isSleeper()) {
				getPoint = list.get(i).getPoint() + point;
			}
			System.out.println(getPoint);
		}
		return list;
	}

	@Override
	public UserVO getPointRankerUser(List<UserVO> list) {
		//6. ����Ʈ�� ���� ���� ȸ�� ��ȸ.(��, �ߺ������ʹ� ���ٰ� ����)
		int max = 0;
		int temp = 0;
		for(int i=0; i<list.size(); i++) {
			if(max < list.get(i).getPoint()) {
				max = list.get(i).getPoint();
				temp = i;
			}
		}
		System.out.println("����� No."+list.get(temp).getUserNo()+" , ����� ����Ʈ."+list.get(temp).getPoint()+" , ����� �̸�."+list.get(temp).getUserName()+" ,����� �ֱ� ������."+list.get(temp).getVisitAt());
		return null;
	}

	@Override
	public List<UserVO> getPurchaseRankerUser(List<UserVO> list, ProductVO vo, int userNo) {
		//7. Ư�� ȸ������ ��ǰ���� �߻�.
	    //   ������ ��ǰ�� ���� 5%�� ����Ʈ�� ����.
		double plusPoint = 0.05;
		for(int i=0; i<list.size();i++) {
			int totalPoint = list.get(i).getPoint();
			double pricePoint = vo.getPrice()*plusPoint;
			if(list.get(i).getUserNo()==userNo) {
//				System.out.println(pricePoint);
				totalPoint = list.get(i).getPoint()+(int)pricePoint;
			}
//			System.out.println(list.get(i).getPoint());
			System.out.println("ȸ���̸��� : "+list.get(i).getUserName()+", �� ����Ʈ�� "+totalPoint);
		}
		return list;
	}

	

}
