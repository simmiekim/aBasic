package e_method;

public class Ex02_반환 {

	public static void main(String[] args) {
		
		int sum = add();
		// 출력
		System.out.println("합 : "  +  sum);
	}
	
	static int add() {
		// 데이타
		int a =10, b =20;
		int sum = a+b;
		return sum;		
	}
	
	// return : 제어권 반환
	//		반환시 데이타를 딱 한개를 가지고 넘어갈 수 있음
}
