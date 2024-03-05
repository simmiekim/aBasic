package c_control;

public class Ex10_dowhile개념 {

	 public static void main(String[] args) {
		
		 // 1부터 10까지의 합을 구하기
		 // 		for 문이용
		 //		while 변경
		 /*
		 int sum = 0;
		 for( int i=1; i<=10; i++) {
			 sum += i;
		 }		 
		 System.out.println("합:" + sum); */
		 
		 /*
		 int sum = 0;
		 int i=1;
		 while(      i<=10    ) {
			 sum += i;
			 i++;
		 }			 
		 System.out.println("합:" + sum); 		  
		  */
		 
		 int sum = 0;
		 int i=1;
		 do {
			 sum += i;
			 i++;
		 }	while(      i<=10    );
		 
		 System.out.println("합:" + sum); 
		 
	}

}
