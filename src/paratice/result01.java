package paratice;

import java.util.Scanner;

public class result01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = sc.nextInt();
		double sum =math + eng +kor;
		double di =sum/3;
	
		
		if (di>=90) {
			
			System.out.printf("평균 :%s",di);
			System.out.println("    ");
			System.out.println("등급: A 등급");
		}else if (di>=80) {
			System.out.printf("평균 :%s",di);
			System.out.println("    ");
			System.out.println("등급: B 등급");
			
		}else if (di>=70) {
			System.out.printf("평균 :%s",di);
			System.out.println("    ");
			System.out.println("등급: C 등급");
			
		}else {
			System.out.printf("평균 :%s",di);
			System.out.println("    ");
			System.out.println("등급: D 등급");
			
		}
		int result1 =1;
		
		for(int i=10; i>=1 ;i--) {
		result1*=i;	     }
		System.out.println(result1);
		
		long result2 =1;
		for(int j=15; j>=1 ;j--) {
			result2*=j;	     }
			System.out.println(result2);
		
		
			
			
		}
		
		
		

	

}
