package b_operator;

/*
 *  문자 하나를 입력받아서 그 문자가 대문자인지 소문자인지 출력
 *  
 *  [예]
 *  	문자입력 -> a
 *  	소문자입니다
 *  
 *  [예]
 *  	문자입력 -> Y
 *  	대문자입니다 
 *  
 *  [힌트] 비교연산자와 일반논리연산자 활용
 *  
*/
import java.util.*;

public class 연습2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("문자입력 ->");
		//char a = (char)input.nextInt();
		
		//char ch = (char)input.next(); // String -> char 형변환 안됨
		String str = input.next();
		// str : "a"
		char ch = str.charAt(0); // 0번째가 첫번째
		System.out.println("입력확인:" + ch);
		// A :65
		// B :66
		// ㄱ < ㅎ
		if('A' <= ch &  ch <= 'Z') {
			System.out.println("대문자");
		}
		
		
	}

}
