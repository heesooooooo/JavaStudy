package day3;

public class Ex01 {

	public static void main(String[] args) {
		int i =1;
		int sum1=0;
		int sum2=0;
		int total=0;
		for (i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.print((i) + " ");
				sum1+=i;
			} else {
				System.out.print("-" + i + " ");
				sum2-=i;
			}
		}
	
		
		total=sum1+sum2;
		System.out.println();
		System.out.println("결과 : " +total);

		
		
		
	}

}
