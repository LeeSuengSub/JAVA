package user;

import java.util.List;

/**
 * @author lss
 * @Date 2022. 4. 20.
 * commet : 
 */
public class UserService implements UserServiceImple{


	@Override
	public List<UserVO> updateSal(List<UserVO> list, String dname) {
/*		for(int i=0; i< list.size(); i++) {
			if(list.get(i).getDname().equals("DEVELOP")) {
				int sal = list.get(i).getSal()*2;
				System.out.println("DEVELOP의 급여는 "+sal);
			}
		}
		return list;
*/
		for(int i=0; i<list.size();i++) {
			String temp = list.get(i).getDname();
			if(temp.equals(dname)) {
				int sal = list.get(i).getSal();
				sal *= 2;
				list.get(i).setSal(sal);
				System.out.println(list.get(i).getSal());
			}
		}
		
		return list;
	}

	@Override
	public List<UserVO> updateLv(List<UserVO> list) {
		for(int i=0; i<list.size(); i++) {
			if(0<=list.get(i).getSal() && 100>= list.get(i).getSal()) {
        		list.get(i).setLv(1);
        	}
        	if(100<list.get(i).getSal() && 1000>= list.get(i).getSal()) {
        		list.get(i).setLv(2);
        	}
        	if(1001<=list.get(i).getSal()) {
        		list.get(i).setLv(3);
        	}
        	System.out.println("급여를 레벨로 나타내면 "+list.get(i).getLv()+" 레벨");
        }
		return list;
	}

	@Override
	public List<UserVO> deleteUser(List<UserVO> list, int lv) {
/*		for(int i= 0; i<list.size(); i++) {
			if(list.get(i).getLv() == 3) {
				list.remove(i);
			}
			System.out.println("해고당하지 않은 사람의 레벨은 "+list.get(i).getLv()+" 레벨");
		}
		return list;
 */
		for(int i=0; i<list.size(); i++) {
			int tempLv = list.get(i).getLv();
			if(tempLv >= lv) {
				list.remove(i);
				System.out.println(list.get(i).getLv());
			}
		}
		return list;
	}

	@Override
	public UserVO selectUserByEname(List<UserVO> list, String ename) {
/*		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getEname().equals("King")) {
				System.out.println("직무는 "+list.get(i).getDname());
        		System.out.println("이름은 "+list.get(i).getEname());
        		System.out.println("레벨은 "+list.get(i).getLv());
        		System.out.println("급여는 "+list.get(i).getSal());
			}
		}
		return null;
 */
		for(int i=0; i<list.size();i++) {
			String tempEname = list.get(i).getEname();
			if(ename.equals(tempEname)) {
				return list.get(i);
			}
		}
		return null;
	}
	
}
