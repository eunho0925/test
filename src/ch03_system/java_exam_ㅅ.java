package ch03_system;

import java.util.Scanner;

public class java_exam_ㅅ {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("이름 나이");
	String userString =scan.nextLine();
	System.out.println("1번문제");
	int idx =userString.indexOf(":");  // 이걸 잘 이용하면 풀수 있을텐데..
  	System.out.println(idx);
  	System.out.println(userString.substring(0,idx));
  	System.out.println(userString.substring(idx+1));
  	String nm =userString.substring(0,idx);
  	String age =userString.substring(idx+1);
	//콘솔입력 String타입
  	//숫자형태로 사용하려면 casting 형변환 해야함.
  	int userAge = Integer.parseInt(age);
  	System.out.println("입력하신 이름은"+nm+"나이는"+age);
  	System.out.println("입력하신 이름은"+nm+"나이는"+userAge);
}
}