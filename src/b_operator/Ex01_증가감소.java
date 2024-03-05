package b_operator;

public class Ex01_증가감소 {

	public static void main(String[] args) {
		
		int a = 5, b = 7;
		
		// [0]
		System.out.println("A=" + a + ",B=" + b); // A=5,B=7
		System.out.println("A=" + a + 1 + ",B=" + b+1 ); // ???		
		System.out.println("A=" + (a + 1) + ",B=" + (b+1) );
		
		a = a + 1;
		b = b - 1;
		System.out.println("A=" + a + ",B=" + b); // 
		
		//***********************
		// 증가연산자 ++
		// 감소연산자 --
		
		// [1]
		++a;
		--b;
		System.out.println("A=" + a + ",B=" + b); 
		
		a++;
		b--;
		System.out.println("A=" + a + ",B=" + b); 
		
		
		// [2] 앞에 경우와 뒤에 경우 다릅니다
		int c = 10;
		int result = ++c;
		// c = c + 1;
		// int result = c;		
		System.out.println("결과:" + result); // 11
		System.out.println("c=" + c);
		
		int d = 10;
		int result2 = d++;
		// int result2 = d;
		// d = d + 1;
		System.out.println("결과2:" + result2); // ?
		System.out.println("d=" + d);
		
		// [3] 
		int x = 5, y = 9;
		System.out.println("X="+ ++x + ",Y=" + --y);	
		System.out.println("X="+ x++ + ",Y=" + y--);
		System.out.println("X="+ x + ",Y=" + y);
		
		
		
		
		
		
		
		
		
		
		
	}

}
