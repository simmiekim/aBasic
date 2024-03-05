package c_control;

import java.util.Scanner;

public class Ex11_dowhile연습 {

	public static void main(String[] args) {
		
		// 구구단의 단수를 입력받아서 해당 구구단을 출력
		Scanner input = new Scanner(System.in);
		
		// [3] do~while 문이용 : 반복횟수가 정해지지 않을 때
		String answer = "";
		do {			
			System.out.println("구구단의 단수->");			
			int dan = input.nextInt();
			
			for(int i=1; i<=9; i++) {
				System.out.println(dan +"*" + i + "=" + dan*i );
			}	
			System.out.println("계속하시겠습니까?(Y|N)");
			answer = input.next();
		} while( answer.equals("Y") | answer.equals("y") );
		
		
		
//		// [2] while 문이용 : 반복횟수가 정해지지 않을 때
//		while( true ) {
//			
//			System.out.println("구구단의 단수->");			
//			int dan = input.nextInt();
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan +"*" + i + "=" + dan*i );
//			}	
//			System.out.println("종료를 원하십니까?(Y|N)");
//			String answer = input.next();
//			if( answer.equals("Y") | answer.equals("y")  ) break;
//		}
		
		
//		// [1] for 문이용 : 반복횟수가 정해진 경우
//		System.out.println("구구단 몇 번 반복할까요?");
//		int  num = input.nextInt();
//		
//		for( int j=0; j<num; j++) {			
//			System.out.println("구구단의 단수->");
//			
//			int dan = input.nextInt();
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan +"*" + i + "=" + dan*i );
//			}	
//		}
		
		
		
		
			
		
	}

}
