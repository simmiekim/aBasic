package c_control;

public class Ex03_switch_주민번호 {

	public static void main(String[] args) {
		/*
		 *  출신지값이
		 *  0이라면 서울출신
		 *  1이라면 인천/부산출신
		 *  2라면  경기출신
		 */
		
		String id = "800102-0234567";

		//--------------------------
		/*
		 *  주민번호에서 7번째 문자에 의해 성별을 출력
		 *  단, switch 문장으로 완성
		 */
		char sung = id.charAt(7);
		String gender = "";
		switch(sung) {
		case '9': 
		case '1': 
		case '3': gender = "남자"; break;
		case '0': 
		case '2': 
		case '4': gender = "여자"; break;
		}
		System.out.println("당신은 " + gender + "입니다");
		
		
		char ch = id.charAt(8); // 
		System.out.println(ch);

		String chul = "";
		switch(ch) {
		case '0' : chul = "서울";
					break;
		case '1' : chul = "인천/부산";
					break;
		case '2' : chul = "경기";
					break;
		default : chul = "한국인";		 			
		}
		System.out.println(chul +"출신입니다");
		
		/*
		if( ch == '0') {
			System.out.println("서울출신");
		}else if( ch == '1') {
			System.out.println("인천/부산출신");
		}else if( ch == '2') {
			System.out.println("경기출신");
		}*/
		
		
		
		
	}

}
