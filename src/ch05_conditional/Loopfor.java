package ch05_conditional;

/**
 *class Name :Loopfor
 *Author      :EH
 *Created Date:2025. 1. 24.
 *Version     :1.0
 *Purpose     :{자바 기초}
 *Description :{반복문 for}
 */
public class Loopfor {
	public static void main(String[] args) {
		//for문 (1 초기화식 2 조건식 4증감)
		// 3실행문    순서 1234
		for(int i=1;i<=10; i++) {
			System.out.println(i);
		}
		//1부터 10까지의 합 
		int sum =0;
		for(int i=1;i<=10; i++) {
			System.out.println(sum +=i);
			
		}
		int sum2 =0;
		for(int i=21;i<=45; i++) {
			System.out.println(sum2 +=i);
		}
		//1부터 40까지 중에 짝수만 더한 값은
		int sum3=0;
		//1.1 ~40 반복문 만들기
		for (int i=2; i<=40; i+=2) {
			System.out.println(sum3+=i);
			
		}
		System.out.println("1부터 40까지의 중 짝수의 합은"+sum3);
	
		//2 조건식 (짝수일때만 더하기)
		//3 출력
		
		
		//구구단 출력

		int dan =9;
		for(int i=1; i<=9; i++) {
			if (i==5) {
				break;
			}
			System.out.printf("%d x %d= %d\n",dan,i,dan*i);
		}
		//2 ~9단 출력 
		
		for(int dan1 = 2; dan1 <= 9; dan1++) {
			if (dan1==5) {
				//continue;
				break;
			}
		System.out.println(dan1);
		for (int j=1; j<=9 ; j++) {
			System.out.printf("%dx%d=%d\n",dan1,j,dan*j);
		}
		}
		//각단마다 1~9까지 곱하기
		//단 증가 for문 
		//1~9 곱하기for문 
		//3 출력
		
		
		//1~n 까지 더한 값이 100 이상이 되는 지점의 n을 구하시오
		int num5 =0;
		for(int i= 1; i<9999; i++) {
			num5+=i;
			if(num5 >= 100) {
				System.out.println("100 이상이 되는 n:"+i);
				break;
			}
		}
		//중첩 for문에서 서브 for문 시점에 특정 시점의 반복을 중단하는
		//label (for문의 제어 흐름을 전달)
		int sum6=0;
		outer:
			for(int i =2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					sum6 = i*j;
					System.out.printf("i:%d,j:%d,i*j=%d\n",i,j,sum6);
					if (sum6 >= 50) {
						break outer;
					}
					
					
					
					
					
				
					
							
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
			
}
