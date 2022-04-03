import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("0. 종료");
			
			int num = scan.nextInt();
			if(num == 0) {
				break;
			}else {
				if(num>4) {
					System.out.println("번호를 잘못입력했습니다.");
					continue;
				}
				System.out.println("첫번째 번호를 입력하신 후 엔터를 클릭해주세요.");
				int firstNum = scan.nextInt();
				
				System.out.println("두번째 번호를 입력하신 후 엔터를 클릭해주세요.");
				int secondNum = scan.nextInt();
				
				if(num == 1) {
					int plus = firstNum + secondNum;
					System.out.println("더하기: "+plus);
				}
				
				if(num == 2) {
					int minus = firstNum - secondNum;
					System.out.println("빼기: "+minus);
				}
				
				if(num == 3) {
					int multiply = firstNum*secondNum;
					System.out.println("곱하기: "+multiply);
				}
				
				if(num ==4) {
					int division = firstNum/secondNum;
					System.out.println("나누기: "+division);
					
					int rest_share = firstNum%secondNum;
					System.out.println("나머지: "+rest_share);
				}
			}
		}
		System.out.println("계산을 종료합니다.");
		
	}

}
