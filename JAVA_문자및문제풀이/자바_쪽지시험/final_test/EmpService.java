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
			System.out.println("�μ���ȣ�� : "+list.get(i).getEmpno()+", ����̸��� : "+list.get(i).getEname()+", �޿��� : "+list.get(i).getSal());
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
		System.out.println("�ְ�޿��� �޴� ����� : "+list.get(temp).getEname()+", �ְ� �޿��� : "+list.get(temp).getSal());
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
		System.out.println("�޿��� 300���Ϸ� �ް� �ִ� ��� �� : "+count+"��");
		return count;
	}

	@Override
	public EmpVO setDept(EmpVO empVO) {
		List<DeptVO> list = new ArrayList<DeptVO>();
		DeptVO vo = new DeptVO(10,"SALES");
		list.add(vo);
		empVO.setList(list);
			System.out.println("�����ȣ�� : "+empVO.getEmpno()+", ����μ���ȣ�� : "+empVO.getList().get(0).getDeptno()+", ����̸��� : "+empVO.getEname()+", ����μ����� : "+empVO.getList().get(0).getDname());
		return empVO;
	}

}