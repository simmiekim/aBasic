package c_control;

/*
 *  for   : 주로 반복횟수가 정해진 경우
 *  while : 주로 반복횟수가 고정적이지 않은 경우 
 */

public class Ex09_while개념 {

	public static void main(String[] args) {
		
//		int sum = 0;
//
//		// 1부터 10까지 합을 sum 변수에 누적하기
//		int i=1;
//		//for(   ; ;  ) {
//		while( i<=10 ) {
//			sum+=i; 
//			i++;
//		}
//		
//		System.out.println("합=" + sum);
		
		
		int dan = 3;
		// 구구단의 3단을 출력
		// for 문
		//	-> while 변경
		/*
		for(int i=1; i<=9; i++ ) {
			System.out.println( dan +"*" + i + "=" + dan*i );
		}
		*/
		int i=1;
		while( i<=9  ) {
			//System.out.println( dan +"*" + i + "=" + dan*i );
			System.out.printf("%d * %d = %d \n", dan, i, dan*i);
			i++;
		}
		
		
		
		
		
		
	}

}
