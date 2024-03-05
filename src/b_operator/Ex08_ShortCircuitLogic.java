package b_operator;

public class Ex08_ShortCircuitLogic {

	/*
	 *  ShortCircuitLogic
	 *  	- 일반논리 연산자에서 발생하는 개념
	 *  
	 *  	- 앞의 조건에 의해 결과가 정해지면 뒤에 조건을 실행하지 않음
	 *  
	 *  
	 */
	public static void main(String[] args) {
		
		int a = 3;
		
		// 일반논리연산자 대신 이진논리연산자 사용한다면???
		// 		-> 
		if( a>3 & ++a>3) {
			System.out.println("조건만족");
		}
		
		System.out.println("A=" + a); // 자바만 3이고 결과
		
		
		if( a>1 | ++a>3 ) {
			System.out.println("조건만족2");			
		}
		System.out.println("A="+ a);
		
		
		// 일반논리연산자
		
//		if( a>3 && ++a>3) {
//			System.out.println("조건만족");
//		}
//		
//		System.out.println("A=" + a); // 자바만 3이고 결과
//		
//		
//		if( a>1 || ++a>3 ) {
//			System.out.println("조건만족2");			
//		}
//		System.out.println("A="+ a);

	}

}
