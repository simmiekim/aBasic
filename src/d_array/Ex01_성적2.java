package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 5명의 국어점수를 입력하세요 ( 입력예시 : 10/10/10/10/10 ) -> 55/66/75/69/72
총점은 xxxx이고, 평균은 oooo입니다.
 */
public class Ex01_성적2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("5명의 국어점수를 입력하세요 ( 입력예시 : 10/10/10/10/10 ) -> ");
		String score_str = input.nextLine();
		 
		 StringTokenizer st = new StringTokenizer(score_str,"/");
		 int cnt = st.countTokens();
		 System.out.println("갯수:" + cnt);
		 int [] score = new int[cnt];
		
			for(int i=0;  i<cnt ; i++) {
				score[i] = Integer.parseInt( st.nextToken() );
			}
			
			int total = 0;
			for(int i=0;  i< cnt ; i++) {
				total += score[i];
			}
		System.out.println("총점: " + total);
		 
	}

}
