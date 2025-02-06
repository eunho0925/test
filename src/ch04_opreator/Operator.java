package ch04_opreator;

import java.util.Scanner;

/**
 *class Name :Operator
 *Author      :EH
 *Created Date:2025. 1. 23.
 *Version     :1.0
 *Purpose     :{java 기초}
 *Description :{연산자 연습문제}
 */
public class Operator {

	public static void main(String[] args) {
		//사용자에게 이메일 주소를 입력받으세요
		//이메일 형식이 아니면 "이메일 형식이 아닙니다!")
		// email 형식이면 사용가능 출력 (기준은 @ 있냐 없냐)
		Scanner scan =new Scanner(System.in);
		System.out.println("이메일 주소 입력");
		System.out.println(">>>");
		
		//1 입력받기		//2 이메일 형식체크 틀린 방법 이딴걸 틀리다니
		//String userInput= scan.nextLine();
		//String email=String userInput.indexOf(userInput == "@" || userInput != "@") ? "이메일 가능":"이메일 불가능"
		// (a) ? (b) : (c) a가 참이면 b 참이 아니면 c
		String userInput= scan.nextLine();
		String message =(userInput.indexOf("@") == -1) ? 
				"형식이 아닙니다" :"사용가능";
		
		System.out.printf("고객님의 입력은 :%s 은 %s",userInput,message);
		
		
		
	}

}
