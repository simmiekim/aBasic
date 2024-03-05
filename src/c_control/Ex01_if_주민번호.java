package c_control;

/*
 * 자료형
 * 	- 기본형 : boolean / char / int / double
 *  - 참조형 : 클래스 / 배열
 *  		(*)String
 */

public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		
		//String id = "";
		String id = new String("880102-1234567");

		char sung = id.charAt(7);
		
		if( sung == '1' ||  sung == '3' || sung == '9' ) {
			System.out.println("당신은 남정네");
		}else if( sung == '0' ||  sung == '2' || sung == '4' ) {
			System.out.println("당신은 여인네");
		}
		
	}

}
