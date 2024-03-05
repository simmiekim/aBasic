package c_control;

import java.util.Scanner;

public class Ex07_for연습2 {

	public static void main(String[] args) {
		
		/**
		 * 문제2)  문자열처리하기 

				문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 
				N이 대문자이면 문자 N부터  Z까지 출력하라 
				그 밖의 문자가 입력되면 Error 를 출력하라 
				
				입력 	    출력
				f       abcdef
				X       XYZ
				6       Error 
		 */		
		
		
		// 소문자 하나를 입력받기
		Scanner input = new Scanner(System.in);
		System.out.println("소문자를 입력하세요->");

		String str = input.nextLine(); 	// str="f"
		char ch = str.charAt(0);  		// ch='f'
		
		for( char alpha='a' ; alpha<=ch  ; alpha++ ) {
			System.out.print(alpha);
		}
		System.out.println();
		
		// 입력한 문자부터 'z'까지 출력하세요
		for( char alpha=ch ; alpha<='z'  ; alpha++ ) {
			System.out.print(alpha);
		}
		System.out.println();
		
		
		
		
	}

}
