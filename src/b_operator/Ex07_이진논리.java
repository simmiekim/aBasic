package b_operator;

public class Ex07_이진논리 {

	public static void main(String[] args) {
		
		int a = 15; // 00000000 00000000 00000000 00001111
		int b = 10; // 00000000 00000000 00000000 00001010
		
		int and = a & b;
				// a 	00001111
				// b 	00001010
				// ---------------
				// &    00001010
		System.out.println(and);
		
		int or = a | b;
		System.out.println(or);
		// a 	00001111
		// b 	00001010
		// ---------------
		// |    00001111
		
		
		int xor = a ^ b;
		System.out.println(xor); // ?
		// xor : 둘 다 신호가 다른경우에만 결과발생
		//		 0과 1인 경우에 결과 1이 발생
		// a 	00001111
		// b 	00001010
		// ---------------
		// ^    00000101
		
	}

}
