package ch06_method;


/**
 *class Name :methodmain
 *Author      :EH
 *Created Date:2025. 1. 31.
 *Version     :1.0
 *Purpose     :{java 기초}
 *Description :{클래스에 종속되어 있는 method}
 */
public class methodmain {
	
	//메인 메소드 public 이며 static 하여 어디서든 사용가능하고
	//void라 리턴이 없으면 매개변수 한개 String []배열타입

	public static void main(String[] args) {
		returnSum(1, 100);
		System.out.println();
	}
	//2개의 정수를 입력 받아 리턴 출력하는 함수
	public static int returnSum(int from, int to) {
		int sum = 0;
		for (int i =from ; i <=to; i++) {
			sum+=i;
					
		}
		
		
	}System.out.printf("from :%d 부터 to: %d 꺼지 합은 : %d \n",from ,to,sum);

}
