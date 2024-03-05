package c_control;

public class Ex06_for개념 {

	public static void main(String[] args) {
		
		// 1부터 10까지의 합을 구하기 
//		int hap = 0;
//		for(int i=1; i<=10 ; i++) {
//			hap += i;
//		}
//		System.out.println("합:" + hap);
		
		
		
		
		// 1부터 100까지의 홀수의 합과 짝수의 합을 구하기
		int odd=0, even=0;
		for( int i=1; i<=100 ; i+=2 ) {
			odd += i;
			even += (i+1);
		}
		System.out.println("홀수:" + odd);
		System.out.println("짝수:" + even);
		
		
		
		
		
		
		
		// 10부터 1까지 출력
//		for(int i=10; i>=1 ;i-- ) {
//			System.out.println(i);
//		}

		// 1부터 30까지 수에서 3개씩 출력하려면?
//		for(int i=1 ; i<=30 ; i+=3 ) {
//			System.out.println(i);
//		}
		
//
//		for( char ch='A'; ch<='C'; ch++ ) {
//			System.out.print(ch);
//		}
//		
//		System.out.println();
//		
//		for( char ch='Z'; ch>='A' ; ch-- ) {
//			System.out.print(ch);
//		}
//		System.out.println();
//		
//		// A ~ S
//		for( char ch='A' ;  ch<='S' ; ch+=2 ) {
//			System.out.print(ch);
//		}
//		
	}

}
