package final_test;

import java.util.ArrayList;
import java.util.List;

public class EmpService implements EmpServiceImpl{

	@Override
	public List<EmpVO> getEmpList(List<EmpVO> list) {
		int sal = 0;
		for(int i=0; i<list.size(); i++) {
			sal = list.get(i).getSal();
			sal += EmpCode.SPECIAL_BONUS;
			list.get(i).setSal(sal);
			System.out.println("부서번호는 : "+list.get(i).getEmpno()+", 사원이름은 : "+list.get(i).getEname()+", 급여는 : "+list.get(i).getSal());
		}
		return list;
	}

	@Override
	public EmpVO getEmp(List<EmpVO> list) {
		int max = 0;
		int temp = 0;
		for(int i=0; i<list.size(); i++) {
			if(max<list.get(i).getSal()) {
				max = list.get(i).getSal();
				temp = i;
			}
		}
		System.out.println("최고급여를 받는 사람은 : "+list.get(temp).getEname()+", 최고 급여는 : "+list.get(temp).getSal());
		return list.get(temp);
	}

	@Override
	public int getCount(List<EmpVO> list, int sal) {
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getSal() <=sal) {
				count++;
			}
		}
		System.out.println("급여를 300이하로 받고 있는 사원 수 : "+count+"명");
		return count;
	}

	@Override
	public EmpVO setDept(EmpVO empVO) {
		List<DeptVO> list = new ArrayList<DeptVO>();
		DeptVO vo = new DeptVO(10,"SALES");
		list.add(vo);
		empVO.setList(list);
			System.out.println("사원번호는 : "+empVO.getEmpno()+", 사원부서번호는 : "+empVO.getList().get(0).getDeptno()+", 사원이름은 : "+empVO.getEname()+", 사원부서명은 : "+empVO.getList().get(0).getDname());
		return empVO;
	}

}