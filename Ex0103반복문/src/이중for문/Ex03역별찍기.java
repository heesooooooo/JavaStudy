package 이중for문;

public class Ex03역별찍기 {

	public static void main(String[] args) {
		
		
		// *****
		// ****
		// ***
		// **
		// *
		
		// --안쪽 i>5로 원래 시작했기 때문에 j=5로 시작
		for ( int j =5; j>0; j-- ) {
			for(int i =0; i<j; i++) {
				System.out.print("*");
			} System.out.println();
		}
		
		
		
		
		
		
//		for(int j=0; j<5; j++) {
//		for(int i =5; i>j; i--) {
//		System.out.print("*");}
//	
//		System.out.println();
//		
//		}
//		
		
		
		
	}

}
