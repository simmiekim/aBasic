package e_method;

public class Ex02_반환2 {

	public static void main(String[] args) {
		
		int[] data = add();
		// 합산후 출력
		int sum = data[0] + data[1];
		System.out.println("합:" + sum);
	}

	static int[] add() {
		int a= 10, b = 20;
		int [] data = {a, b};
		
		return data; // 리턴값은 단 1개
	}
}
