package ch05_conditional;

import java.util.Scanner;

/**
 *class Name :LoopWhile
 *Author      :EH
 *Created Date:2025. 1. 24.
 *Version     :1.0
 *Purpose     :{java 기초}
 *Description :{반복문 while}
 */
public class LoopWhile {

	public static void main(String[] args) {
		//while (조건식) 조건식이 True 이면 반복(주의 무한루프)
		int i=1;
		while(i <=10) {
			System.out.println(i);
			i++;
			
		}
		Scanner sc= new Scanner(System.in);
		boolean flag =true;
		while(flag) {
			System.out.println("=====================");
			System.out.println("이름을 입력하세요(종료q)");
			String nm =sc.nextLine();
			//문자열 == 문자열 같은지 비교 함수 equals
			if(nm.equals("q")) {
				flag=false;
				
			}else {
				System.out.println(nm+"님 환영합니다");
			}
			System.out.println("=============");
			
			
			
			
			
		}
		//while 문으로 구구단 2~9단 출력
		//1.2 ~9단 whie문 작성
		int dan =2;
		
		while (dan<=9) {
			int j=1;
			
		while (j<=9) {
			System.out.printf("%dx%d=%d\n",dan,j,dan*j);
			j++;
		 	
		}
		dan++;
		
		}
		
		
			
		//2.1 ~9수에 해당되는 while 문 작성
	}

}
