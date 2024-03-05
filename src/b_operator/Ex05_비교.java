package b_operator;

/*
 *  비교연산자
 *  
 *  	> >= < <=  ==  !=
 */
public class Ex05_비교 {

	public static void main(String[] args) {
		//  국, 영, 수  점수를 입력받아서 총점(total)을 구해서 출력
		//	평균(avg)을 구해서 출력
		
		int kor = 100;
		int eng = 100;
		int math = 100;
		
		int total = kor + eng + math;
		System.out.println("총점:" + total);
		double avg = (double)total / 3; // 80.123 -> 80
		System.out.println("평균:" + avg);
		
		if( avg >= 70) {
			System.out.println("C학점");
		}else if( avg >= 80) {
			System.out.println("B학점");
		}else if( avg >= 90) {
			System.out.println("A학점");
		}
		
//		if( avg >= 90) {
//			System.out.println("A학점");
//		}else if( avg >=80 ) {
//			System.out.println("B학점");
//		}else if( avg >=70 ) {
//			System.out.println("C학점");
//		}else {
//			System.out.println("F학점");
//		}
		
		
		
		
		
		
		
		
	}

}
