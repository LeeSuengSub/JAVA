package inflearn;

public class ifExemple {

	public static void main(String[] args) {
		// if문, if-else문
		int age =10;
		if(age >=8) {
			System.out.println("학교에 다닙니다.");
		}else {
			System.out.println("학교에 다니지 않습니다.");
		}
		//else-if문
		int age1 = 9;
		int chage = 0;
		if(age1 <=8) {
			chage = 1000;
			System.out.println("미취학 아동입니다.");
		}else if(age1 < 14) {
			chage = 2000;
			System.out.println("초등학생입니다.");
		}else if(age1 <20) {
			chage = 2500;
			System.out.println("중, 고등학생입니다.");
		}else {
			chage = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 "+chage+"원 입니다.");
		//if-else와 else-if의 차이
		int age2 = 9;
		int chage1 = 0;
		
		if(age2 <=8) {
			chage1 = 1000;
			System.out.println("미취학 아동입니다.");
		}if(age2 < 14) {
			chage1 = 2000;
			System.out.println("초등학생입니다.");
		}if(age2 <20) {
			chage1 = 2500;
			System.out.println("중, 고등학생입니다.");
		}else {
			chage1 = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 "+chage+"원 입니다.");
		//switchcase문
		int rank = 1;
		String medalColor;
		
		switch(rank) {
		case 1: medalColor = "G";
				break;
				
		case 2 : medalColor = "S";
				break;
		
		case 3 : medalColor = "B";
				break;
		
		default : medalColor = "A";
		}
		System.out.println(rank + "등 메달의 색깔은 "+ medalColor+" 입니다.");

		int month = 10;
		int day;
		
		switch(month) {
		case 1 : case 3: case 5 : case 7 : case 8 : case 10 : case 12 : day = 31;
			break;
		case 2 : day = 28;
			break;
		case 4 : case 6 : case 9: case 11 : day = 30;
			break;
		default :
			day = 0;
			break;
		}
		System.out.println(month+" 월은"+ day+"일 까지 있습니다.");
	}
}
