package 컬렉션즈;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {

	public static ArrayList<EmpVO> getEmpList(ArrayList<EmpVO> list){//EmpVO를 담고있는 ArrayList를 파라미터로 받고 있다.

		for(int i=0; i<list.size();i++) {
			System.out.println("메소드 "+list.get(i).empno);
			System.out.println("메소드 "+list.get(i).ename);
		}
		return list;
	}
	
	public static String getValue(String name1) {
		System.out.println("너의 이름은 "+name1);
		return name1;
	}
	
	public static void main(String[] args) {
		String name1 = "아이유";//메소드 이해를 위한 예제
		getValue(name1);//메소드 호출을 위한 예제
		
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		list.add(new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20,0));
		list.add(new EmpVO(7499,"ALLEN","SALESMAN","1981-02-20",1600,30,300));
		list.add(new EmpVO(7521,"WARD","SALESMAN","1981-02-22",1250,30,500));
		list.add(new EmpVO(7566,"JONES","MANAGER","1981-04-02",2975,20,0));
		list.add(new EmpVO(7654,"MARTIN","SALESMAN","1981-09-28",1250,30,1400));
		list.add(new EmpVO(7698,"BLAKE","MANAGER","1981-05-01",2850,30,0));
		list.add(new EmpVO(7782,"CLARK","MANAGER","1981-06-09",2450,10,0));
		list.add(new EmpVO(7788,"SCOTT","ANALYST","1987-06-28",3000,20,0));
		list.add(new EmpVO(7839,"KING","PRESIDENT","1981-11-17",5000,10,0));
		list.add(new EmpVO(7844,"TURNER","SALESMAN","1981-09-08",1500,30,0));
		list.add(new EmpVO(7876,"ADAMS","CLERK","1987-07-13",1100,20,0));
		list.add(new EmpVO(7900,"JAMES","CLERK","1981-12-03",950,30,0));
		list.add(new EmpVO(7902,"FORD","ANALYST","1981-12-03",3000,20,0));
		list.add(new EmpVO(7934,null,"CLERK","1982-01-23",1300,10,0));

		
		getEmpList(list);//메소드로 호출
		
		//일반 for문
		//문제1. 모든 사원 번호, 이름 출력
		int empno = 0;
		String name = "";
		for(int i=0; i< list.size();i++) {
			System.out.println("사원번호 "+ list.get(i).empno);
			System.out.println("사원이름 "+ list.get(i).ename);			
			}
		System.out.println("-----------------------------------");
		//문제2. 1300달러 이상 받는 사원 이름, 직업조회
		for (int i=0; i<list.size();i++) {
			if(list.get(i).sal >= 1300) {
				System.out.println("1300달러 이상 받는 직원 : "+list.get(i).ename);
				System.out.println("1300달러 이상 받는 직무 : "+list.get(i).job);
			}
		}
		System.out.println("-----------------------------------");
		//문제3. SALESMAN인 사원중 급여가 1400달러 이상 받는 사원의 번호, 이름 조회
		for(int i=0; i<list.size();i++) {
			//JAVA는 문자를 비교할 때 equals()를 사용. 자바에서는 문자를 비교할 때 == 사용하면 문자를 비교하는게 아님.
			if(list.get(i).job.equals("SALESMAN")) {
				if(list.get(i).sal >= 1400) {
					System.out.println("직업이 SALESMAN이면서 급여가 1400달러 이상인 직원 : "+list.get(i).empno);
					System.out.println("직업이 SALESMAN이면서 급여가 1400달러 이상인 직원 : "+list.get(i).ename);
				}
			}
		}
		System.out.println("-----------------------------------");
		//문제4. 입사년도가 1981년도 인 사원의 번호, 이름조회 ***********(보류)

		for(int i=0; i<list.size();i++) {
			String year = list.get(i).hiredate.split("-")[0];
//			System.out.println(year);
			if(year.equals("1981")) {
			System.out.println("입사년도가 1981인 사원은 :  "+list.get(i).empno);
			System.out.println("입사년도가 1981인 사원은 :  "+list.get(i).ename);
		}
		}

		System.out.println("-----------------------------------");
		//문제5. 직업이 MANAGER인 사람 수 조회
		int count = 0;
		for(int i=0; i<list.size();i++) {
			if(list.get(i).job.equals("MANAGER")) {
				++count;
			}
		}
		System.out.println("직업이 MANAGER인 사람은 총 : "+count+"명 입니다.");
		System.out.println("-----------------------------------");
		//문제6. 사원 중 급여를 가장 많이 받는 사원의 번호,이름,입사년도 조회
		int max = 0;
		int temp = 0;
		for(int i=0; i<list.size();i++) {
			if(max < list.get(i).sal) {
				max = list.get(i).sal;
				temp = i;
				
			}
		}
		System.out.println("급여를 많이 받는 사원은 : "+list.get(temp).empno);
		System.out.println("급여를 많이 받는 사원은 : "+list.get(temp).ename);
		System.out.println("급여를 많이 받는 사원은 : "+list.get(temp).hiredate);
		
		System.out.println("-----------------------------------");
		//문제7. 부서번호별 수 조회 EX) 20 : 2명, 30 : 3명
		int count10 = 0;
		int count20 = 0;
		int count30 = 0;
		for(int i=0; i<list.size();i++) {
			if(list.get(i).deptno == 10) {
				++count10;
			}
			if(list.get(i).deptno == 20) {
				++count20;
			}
			if(list.get(i).deptno == 30) {
				++count30;
			}
		}
		System.out.println("부선번호가 10 : "+count10);
		System.out.println("부서번호가 20 : "+count20);
		System.out.println("부서번호가 30 : "+count30);
		System.out.println("-----------------------------------");
		//문제8. 입사월이 02월인 사원 수 조회
		int hiredateCount = 0;
		for(int i=0; i<list.size();i++) {
			String month = list.get(i).hiredate.split("-")[1];
			if(month.equals("02")) {
				++hiredateCount;
			}
		}
		System.out.println("입사월이 2월인 사원의 수는 : "+hiredateCount);
		System.out.println("-----------------------------------");
		//문제B
		//1. comm을 받은 사원 수와 직업,이름을 조회하시오.
		int commCount = 0;
		for (int i=0; i<list.size();i++) {
			if(list.get(i).comm !=0) {
				++commCount;
				System.out.println("사원의 직업은 "+list.get(i).job);
				System.out.println("사원의 이름은 "+list.get(i).ename);
			}
		}
		System.out.println("comm을 받은 사원은 총 "+commCount);
		System.out.println("-----------------------------------");
		////2. emp에 있는 급여 평균을 구하시오.
		int sum = 0;
		int avg = 0;
		for(int i=0; i<list.size();i++) {
			sum += list.get(i).sal;
			avg = sum/list.size();
		}
		System.out.println(avg);
		System.out.println("-----------------------------------");
		////3. 사원번호가 7844, 7876인 사원에게 comm 200을 지급하시오.
		for(int i=0; i<list.size();i++) {
			if(list.get(i).empno == 7844 || list.get(i).empno ==7876) {
				list.get(i).comm += 200;
			}
		}
		System.out.println("empno: "+list.get(9).empno+"  comm: "+list.get(9).comm);
		System.out.println("empno: "+list.get(10).empno+"  comm: "+list.get(10).comm);
		System.out.println("-----------------------------------");

		////4. 사원이름이 null인 사원이름에 '데이터 없음' 으로 수정하시오. 
		for(int i=0; i<list.size();i++) {
			if(list.get(i).ename ==null) {
				list.get(i).ename = "데이터_없음";
			}
		}
		System.out.println(list.get(13).ename);
		System.out.println("-----------------------------------");
		
		//5. 20번 부서가 올해 실적이 좋지 않습니다. 20번부서를 모두 해고(제거) 하십시오.
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).deptno == 20) {
				list.remove(i);
			}
			System.out.println("해고당하지 않은 부서는 : "+list.get(i).deptno);
		}
		
		//for-each
//		for(EmpVO vo : list) {}
	}

}
