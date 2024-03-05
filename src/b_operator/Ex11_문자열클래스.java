package b_operator;

/*
 *   문자열 처리 클래스
 *   	- String
 *   	- StringBuffer
 *   	- StringBuilder 
 */
public class Ex11_문자열클래스 {

	public static void main(String[] args) {
		
//		String s = new String("홍길동");
//		System.out.println("String :" + s);
//		
//		// String 특권 : new 생략가능
//		String s2 = "홍길동2";
//		System.out.println("String :" + s2);
		
		String s3 = "홍길동3";
		// + 산술연산 - 숫자연산
		// String 특권 : + 연산가능
		s3 += "화이팅";  // s3=s3+"화이팅";
		System.out.println("String :" + s3);
		
		// ------------------------
		StringBuffer sb = new StringBuffer("홍길순");
		//sb += "화이팅";
		sb.append("화이팅");
		System.out.println("SB : " + sb);
		
		//StringBuffer sb2 = "홍길순2";
		//System.out.println("SB : " + sb2);
	}

}
