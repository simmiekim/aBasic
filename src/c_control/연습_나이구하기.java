package c_control;

import java.util.Calendar;

/*
 * [참고]
 * 
 * 		9 	: 숫자 
 * 		'9' : 문자
 * 		"9"	: 문자열
 */
public class 연습_나이구하기 {

	public static void main(String[] args) {
		
		String id = "241212-3234567";
		
		String nai_str = id.substring(0,2); // "90"
		
		// String -> int 형으로 변환
		// "90"   -> 90
		// int nai = (int)nai_str;
		int nai = Integer.parseInt(nai_str);
		
		// 올해년도 구하기
		Calendar c 	= Calendar.getInstance();
		int year 	= c.get(Calendar.YEAR);
		
		// 성별값 얻어오기
		char sung = id.charAt(7);
		
		int age = 0;
		
		if( sung == '1' | sung == '2') {
			age = year - (1900 + nai) + 1;
		}else if( sung == '3' | sung == '4') {
			age = year - (2000 + nai) + 1;
		}
		
		System.out.println("나이:" + age);
		
		
	}

}
