package switch문;

import java.util.Scanner;

public class 자바페스티벌 {

	public static void main(String[] args) {

		// 1일차
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("일한시간을 입력하세요 : ");
//		int hour = sc.nextInt();
//		int money = 0;
//		if(hour<=8) {
//			money = (int) (5000*hour);
//		} else {
//			money = (int) (5000 * 8 + (5000*1.5*(hour-8)));
//		}
//		System.out.println("총 임금은 "+money+"원 입니다.");
//		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("총금액 입력 : ");
//		int money = sc.nextInt();
//		System.out.println("");
//		System.out.println("잔돈 : "+money);
//		System.out.println("10000원 : " + money/10000 +"개");
//		System.out.println("5000원 : " + money%10000/5000 +"개");
//		System.out.println("1000원 : " + money%10000%5000/1000 +"개");
//		System.out.println("500원 : " + money%10000%5000%1000/500 +"개");
//		System.out.println("100원 : " + money%10000%5000%1000%500/100 +"개");

		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int num = sc.nextInt();
//		int result =0;
//		if (num%10 >=5) {
//			result = num/10*10+10;
//		} else {
//			result = num/10*10;
//		}
//		System.out.println("반올림 수 : "+ result );
		
		//result 안하고 num = num/10*10 + 10
		//반올림 수: +num
		// if (num>0)
//		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		System.out.println(num1* (num2%10));
		System.out.println(num1* (num2%100/10));
		System.out.println(num1* (num2/100));
		System.out.println(num1*num2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
