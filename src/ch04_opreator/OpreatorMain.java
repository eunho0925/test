package ch04_opreator;

import java.util.Scanner;

// shift+ alt+ j 
/**
 *class Name :OpreatorMain
 *Author      :EH
 *Created Date:2025. 1. 23.
 *Version     :1.0
 *Purpose     :{Java 기초}
 *Description :{기본연산자}
 */
public class OpreatorMain {

	public static void main(String[] args) {
		
		//1 증감연산자 ++ or --
		int num =10;
		num++;
		num++;
		num++;
		//"문자열" + "문자열" = 문자열
		//"문자열" + "숫자형태" = 문자열	
		System.out.println("++이후" + num);
		num--;
		System.out.println("--이후"+num);
		//주의(연산자의 전, 후에 따라 다름)
		int a,b;
		a =num++; //후
		b =++num;  //전
		System.out.printf("a:%d, b:%d \n", a ,b);
		
		//2 대입연산자 +=.-=,*=,/=,%=
		int c =1;
		c+=2;
		System.out.println("c:" +c);
		c*=10;
		System.out.println("c:"+c);
		
		//3.산술 연산자 +,-,*,/,%(나머지를 반환)
		System.out.println(10+5);		
		// (a%b)=a를 b로 나눈 나머지를 반환
		System.out.println(10%5);
		
		
		//비교연산자 >,<,>=,<=,!=,== (!= 같지않다)
		int num1 =10;
		int num2 =20;
		System.out.println("==비교 연산자==");
		System.out.printf("num1:%d  vs num2:%d", num1, num2);
		//비교연산자는 연산후 True, False 를 리턴 (boolean타입)
		
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 != num2);
		System.out.println(num1 == num2);
		
		
		
		//5.삼항 연산자(조건 연산자)
		//(a) ?(b) :(c) a의 조건식이 true이면 b아니면 c
		
		String msg = (a>9) ? "a가 9보다 큼" : "9보다 작음";
		System.out.println(msg);
		System.out.println("아이디를 입력해주세요(4자리 이상)");
		System.out.println(">>>");
		Scanner scann = new Scanner(System.in);
		//사용자의 입력을 받아서 조건이 맞으면 (사용 가능합니다.)
		//                       맞지않으면(4자리 이상으로 다시 입력하세요.)출력
		
		String userInput =scann.nextLine();
		int len = userInput.length();//문자열 길이
		System.out.println("문자열 길이:" + len);
		String output =
				len >= 4 ? "사용 가능합니다." : "4자리 이상으로 다시 입력!";
		System.out.println(output);
		
		
		//6. 논리 연산자 &&(and) 둘다 True 일때 True
		//              || (or) 둘중 1개만 True 이면 True
		
		
		// 아이디를 (8자 14자 사이) 길이만 사용가능
		System.out.println("=== 논리연산 ===");
		System.out.println("아이디를 입력하세요 (8~14 길이)");
		System.out.println(">>>");
		String userInput2 =scann.nextLine();
		int len2 =userInput2.length();
		String output2 = (len2 >= 8 && len2 <15)? "가능":"불가능";
		System.out.println(output2);
		
		
		//성적이 90이상 A, 80 이상 B 나머지는 C
		System.out.println("성적을 입력하세요:");
		System.out.println(">>>");
		
		//결과 A 입니다 , B 입니다 , C 입니다
		//String userInput3 =scann.nextLine();
		//int output3 = userInput3 ;
		//int output3 = (output3 >= 90 and output3 <= 80) ? "A":"B";
		// 틀린식
		
		String userInput3 =scann.nextLine();
		int score = Integer.parseInt(userInput3);
 		String grade=(score >= 90) ? "A" :
 									(score >=80 ? "B":"C");
 		
 		System.out.println(grade + "입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
