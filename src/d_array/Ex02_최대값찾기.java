package d_array;

public class Ex02_최대값찾기 {

	public static void main(String[] args) {
		
		 int [] su = { 8, 4, 20, 88, 57, 9, 5 };
		 int max = su[0];
		 
		 for(int i=1; i< su.length ; i++) {
			 if( max < su[i]) {
				 max = su[i];
			 }
		 }
		 System.out.println("가장 큰 값: " + max);
	}

}
