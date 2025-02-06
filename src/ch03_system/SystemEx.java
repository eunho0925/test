package ch03_system;

import java.util.Scanner;

public class SystemEx {
	public static void main(String[] args) {
		/*
		 *  사용자의 이름: 나이를 입력받아
		 *  이름 출력
		 *  나이 출력
		 *  2사용자의 이름:나이를 입력받아
		 *  변수에 각각 할당후
		 *  해당 변수로 사용자의 이름 나이를 출력
		 */
	
		
		Scanner scan=new Scanner(System.in);
		System.out.printf("이름:나이를 입력하세요=");
		String userInput = scan.next());
		
		String[] parts = userInput.split(":");
		
		String name =parts[0];
		String age =parts[1];

		System.out.println("이름: " + name + ", 나이: " + age);
		//System.out.println("이름"+ name);
		//System.out.println("나이"+ age);

		

		System.out.println(userInput);
		
		
	
		
		
				
	}

}





