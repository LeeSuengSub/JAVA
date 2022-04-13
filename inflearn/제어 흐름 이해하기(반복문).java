package inflearn;

public class WhileExample {

	public static void main(String[] args) {
		//while문
		int num = 1;
		int sum = 0;
		while(num <10) {
			sum += num;
			num++;
		}
		//System.out.println("1부턴 10까지의 합은 "+sum+"입니다.");
		
		//do-while문
		int num1 = 0;
		int sum1 = 0;
		do{
			sum1 += num1;
			num1++;
		}while(num1<=1);
		
		System.out.println("1부터 10까지의 합은 "+ sum1+"입니다.");
		
		//for문
		 int num2 = 1;
		 int sum2 = 0;
		 while(num2 <= 10) {
			 sum2 += num2;
			 num2++;
		 }
		 System.out.println(sum2);
		 System.out.println(num2);
		 for(num2 = 1; num2 <=10; num2++) {
			 sum2 +=num2;
		 }
		 System.out.println(sum2);
		 System.out.println(num2);
		 
		 //for문 구구단
		 int dan = 2;
		 int time = 1;
		 
		 for(dan = 2;dan<=9;dan++) {
			 for(time = 1; time<=9; time++) {
				 System.out.println(dan + "X"+ time+"="+dan*time);
			 }
			 System.out.println();
		 }
		 //while 구구단 짝수단만 출력
		 while(dan <=9) {
			 if((dan%2)!=0) {
				 continue;
			 }
			 time = 1;
			 while(time<=9) {
				 System.out.println(dan + "X"+ time+"="+dan*time);
				 time++;
			 }
			 dan++;
			 System.out.println();
		 }
		 //for설명
		 for(int i=0;i<10;i++) {
			 System.out.println("hello world");
		 }
		 System.out.println();
		 
		 for(int i= 1;i<=10;i++) {
			 System.out.println("Hello,World");
		 }
		 
		 //continue문
		 int total = 0;
		 int num3;
		 
		 for(num3 = 1; num3<=100; num3++) {
			 if((num3 % 2) == 0) {
				 continue;
			 }
				 total += num3;
		 }
		 System.out.println(total);
		 
		 int sum4 = 0;
		 int num4 = 0;
		 
		 while(true) {
			 sum4 += num4;
			 if(sum4>100 ) 
				 break;
			 num4++;
		 }
		 System.out.println(sum4);
		 System.out.println(num4);
	}

}
