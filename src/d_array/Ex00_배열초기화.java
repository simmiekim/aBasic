package d_array;

public class Ex00_배열초기화 {
/*
 *     변수선언
 *     	int  a;
 *     
 *     값지정
 *     a = 10;
 *     
 *     초기화
 *     int b = 5;
 */
	public static void main(String[] args) {
		
		 // 배열변수 선언 +  배열객체 생성
		 //int [] kor = new int[5];
		 
		 // 배열초기화
		// int [] kor = new int[] {99,88,77,66,55};
		int [] kor = {99,88,77,66,55}; 
		
		 // 값지정
//		 kor[0] = 99;
//		 kor[1] = 88;
//		 kor[2] = 77;
//		 kor[3] = 66;
//		 kor[4] = 55;
		 
		 int total = 0;
		 for( int i=0; i < 5 ; i++) {
			 total += kor[i];
		 }
		 
		 System.out.println("총점:" + total);
		 
	} 

}
