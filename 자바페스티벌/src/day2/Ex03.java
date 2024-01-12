package day2;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
			
			int num = 1;
			while(num<6) {
				num++;
				//****5번 반복
				
			int ranNum1 = ran.nextInt(9);
			int ranNum2 = ran.nextInt(9);
			System.out.print(ranNum1 + " + " + ranNum2 + " = ");
			int input = sc.nextInt();
			if(ranNum1+ranNum2==input) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
			}
			
		} 
		
		

	}

}
