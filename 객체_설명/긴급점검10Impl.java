package test;

import java.util.List;

public interface MemberServiceImpl {

		/**
		 * @param list
		 * @return
		 * @date : 2022. 4. 27.
		 * @author : lss
		 */
		public List<MemberVO> getMemberList(List<MemberVO> list);
		
		/**
		 * @param list
		 * @return
		 * @date : 2022. 4. 27.
		 * @author : lss
		 */
		public String getMemberNo(List<MemberVO>list);
	
}
