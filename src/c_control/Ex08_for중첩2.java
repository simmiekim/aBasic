package c_control;

public class Ex08_for중첩2 {

	public static void main(String[] args) {
		
		for( int i=0; i<26 ; i++) { // 26번 반복
			
			// A~Z 한줄출력
			for( char alpha='A'; alpha<='Z'; alpha++) {
				System.out.print(alpha);
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		System.out.println("----------------------");
		
		for( int i=0; i<26 ; i++) { // 26번 반복
			
			// A~Z 한줄출력
			for( char alpha='A'; alpha<='A'+i; alpha++) {
				System.out.print(alpha);
			}
			System.out.println();
			
		}
		

	}

}
