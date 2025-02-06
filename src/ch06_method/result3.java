package ch06_method;

import java.util.Scanner;

public class result3 {

	public static void main(String[] args) {
		randomm();

	}
	public static int randomm() {
		int num =  (int) (Math.random() * 50 + 1);
		Scanner sc =new Scanner(System.in);
		for (int a=1 ; a<=5 ; a++) {
			
			System.out.println("숫자를 입력하세요");
			int input=sc.nextInt();
			
			if(num>input) {
				System.out.printf("업 기회가 %d 남았습니다",5-a);
				System.out.println("     ");
			}else if (num<input) {
				System.out.printf("다운 기회가 %d 남았습니다",5-a);
				System.out.println("     ");
			}else if(num == input){
				System.out.println("정답입니다");
				break; 
			}
				
			if (a==5) {
				System.out.printf("실패하였습니다 정답은 %d",num);
				
			}
			
			
			
			
		}
		
		return num;
		
		
	}

}
