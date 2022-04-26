package test;

import java.util.ArrayList;
import java.util.List;

class FruitVO{
	private String fruitName;

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	
}
class FruitService{
	public FruitVO getFruit(List<FruitVO> list, String fruitName) {

		for(FruitVO vo : list) {
			if(vo.getFruitName().equals(fruitName)) {
				System.out.println(vo.getFruitName());
				return vo;
			}
		}
		return null;
	}
}

public class 긴급점검9 {

	public static void main(String[] args) {
//		List에 포도, 수박, 참외 추가.
//		getFruit을 이용해서 수박 출력!

		FruitVO vo1 = new FruitVO();
		vo1.setFruitName("포도");
		FruitVO vo2 = new FruitVO();
		vo2.setFruitName("수박");
		FruitVO vo3 = new FruitVO();
		vo3.setFruitName("참외");
		
		List<FruitVO> list = new ArrayList<FruitVO>();
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		
		FruitService service = new FruitService();
		FruitVO result = service.getFruit(list, "수박");
		System.out.println(result.getFruitName());
	}

}
