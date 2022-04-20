package user;

import java.util.List;

public interface UserServiceImple {
	
	/**
	 * @param list
	 * @param dname
	 * @return List
	 * @date : 2022. 4. 20.
	 * @author : lss
	 */
	public List<UserVO> updateSal(List<UserVO> list, String dname);
	/**
	 * @param list
	 * @return
	 * @date : 2022. 4. 20.
	 * @author : lss
	 */
	public List<UserVO> updateLv(List<UserVO> list);
	/**
	 * @param list
	 * @param lv
	 * @return
	 * @date : 2022. 4. 20.
	 * @author : lss
	 */
	public List<UserVO> deleteUser(List<UserVO> list, int lv);
	/**
	 * @param list
	 * @param ename
	 * @return
	 * @date : 2022. 4. 20.
	 * @author : lss
	 */
	public UserVO selectUserByEname(List<UserVO> list, String ename);
}
