package c_control;

public class Ex05_switch_성적 {

	public static void main(String[] args) {
		
		int kor =100, eng = 100, math = 100;
		
		int total = kor + eng + math;
		
		int avg = total / 3;
		System.out.println("평균:" + avg);

		char score = '0';		
		
		/*
		 *  9	- 정수
		 *  '9'	- 문자
		 *  "9"	- 문자열
		 */
		switch( avg / 10 ) {
			case 10: 
			case 9 : score ='A'; break;
			case 8 : score ='B'; break;
			case 7 : score ='C'; break;
			default : score='F';
		}
		
		System.out.println("학점 :" + score);
		
		int  a = 10;
		switch (  a  / 3 ) {
		  case 1 : System.out.println("일" );  
		  case 2 : System.out.println("이" );  
		  case 3 : System.out.println("삼" );  
		  case 4 : System.out.println("사" );  
		}
		
	}

}


/*
다음 switch 문을 실행하여 출력되는 문장은?

int  a = 10;
switch (  a  / 3 ) {
  case 1 : System.out.println("일" );  
  case 2 : System.out.println("이" );  
  case 3 : System.out.println("삼" );  
  case 4 : System.out.println("사" );  
}

//----------------------------------

		int i =1, j=0;
		switch ( i ) {
		   	case 2 : j += 6;
			case 4 : j += 1;
			default : j += 2;
			case 0 : j += 4;
		}
		System.out.println( j ); // 6
 
 
 
*/












