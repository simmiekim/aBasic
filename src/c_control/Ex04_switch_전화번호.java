package c_control;

public class Ex04_switch_전화번호 {

	public static void main(String[] args) {
		
		String tel = "02-123-1234";
		int idx = tel.indexOf('-');
		System.out.println(idx);
		
		String localNum = tel.substring(0, idx);
		System.out.println(localNum);
		
		/* switch 문장을 이용 
		 
		 지역번호가 02라면 "서울입니다" 출력
		 지역번호가 032라면 "인천입니다" 출력
		 나머지는 "한국입니다" 출력		 
		*/
		String local = "";
		switch(localNum) {
			case "02":  local = "서울";            
						break;
			case "032": local = "인천";
						break;
			default: local = "한국";			
		}
		System.out.println(local +"입니다");
		
	}

}
