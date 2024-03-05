package y_useful;

/*
 * 날짜 관련 클래스 : java.util 패키지안에
 * 
 * 		` Date
 * 		` Calendar
 * 		` LocalDate
 * 		` LocalDateTime
 */

import java.util.*;

public class Calendar샘플 {

	public static void main(String[] args) {
		
		Calendar c 	= Calendar.getInstance();
		int year 	= c.get(Calendar.YEAR);
		// ****************************
		// 월개념 : 1월 == 0 
		int month 	= c.get(Calendar.MONTH) + 1;
		int day 	= c.get(Calendar.DATE);  
		
		System.out.println(year+"/" + month + "/" + day);
		
		// 시,분,초 구해서 출력
		
	}

}
