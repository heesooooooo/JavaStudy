package d01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bonus05오름차순 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		
		for(int i =0; i<array.length; i++) {
		System.out.print((i+1)+"번째 수 입력 : ");
		array[i]= sc.nextInt();
		}
		System.out.println("정렬 후");
		
		for(int i =0 ; i<array.length; i++) {
			for(int j =0 ; j<array.length-1;j++) {
				if(array[j]>array[j+1]) {  //***
					int tmp = array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
					
				}
				
			}
			
			
		}
		System.out.println(Arrays.toString(array));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5];
//		
//		// 입력받은 값을 배열에 저장
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print((i+1) + "번째 수 입력 : ");
//			int num = sc.nextInt();
//			arr[i] = num;
//		}
//		
//		System.out.println("정렬 후");
//		for(int i = 0; i<arr.length; i++) {		//왜 -1?
//			// 첫번째 배열부터 마지막 배열까지 하나씩 비교하며 순회
//			for(int j = 0; j<arr.length-1; j++) {
//				// 임시로 값을 저장하기 위한 tmp을 선언 후, 저장한 후에 조건이 맞다면 앞과 뒤의 배열을 교체
//				if(arr[j] > arr[j+1]) {
//					int tmp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = tmp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
		
		
		
		


		
		
		
	}

}
