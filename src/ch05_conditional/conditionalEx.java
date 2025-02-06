package ch05_conditional;

import java.util.Scanner;

public class conditionalEx {

	public static void main(String[] args) {
		/*사용자로 부터 숫자를 입력 받아 짝수인지 홀수인지 판별
		 *조건1정수만 입력
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("숫자를 입력하세요(정수)");
		System.out.println(">>>");
		// if 문을 사용하여 짝수면 짝수 홀수면 홀수를 선택
		String userInput=scan.nextLine();
		int su = Integer.parseInt(userInput);
		if(su%2 ==0) {
			System.out.println("짝수입니다");			
		}else {
			System.out.println("홀수입니다");
		}
		
		
		
		
		
		

	}

}
