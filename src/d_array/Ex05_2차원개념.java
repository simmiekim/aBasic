package d_array;

public class Ex05_2차원개념 {

	public static void main(String[] args) {
		
		int[][] data = new int[3][2];
		//int data[][] = new int[3][2];
		//int []data[] = new int[3][2];
		
		// 값지정(저장)
		for( int i=0; i< 3; i++ ) {
			for(int j=0; j< 2; j++ ) {
				// 각각의 배열값에 임의수를 저장
				data[i][j] = (int)(Math.random()*10);
			}
		}
		
		// 출력
		for( int i=0; i< data.length; i++ ) {
			for(int j=0; j< data[i].length; j++ ) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}

}
