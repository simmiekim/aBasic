package e_method;

public class Ex01_인자2 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		method( a, b);
		System.out.println("가:A="+a +",B=" +b); // A=?, B=?
	}
	
	static void method(int a, int b) {
		a += b;
		System.out.println("나:A="+a +",B=" +b); // A=?, B=?
	}
	

}
