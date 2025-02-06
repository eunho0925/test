package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx2 {

	public static void main(String[] args) {
		//커피 주문
		// 아아 or 아메리카노 :3000
		// 카푸치노 :4500
		// 밀크티 :5000 만약 메뉴가 없으면 "메뉴 없습니다".출력
		
		
		
		
		//1.주문받기
		Scanner sc =new Scanner(System.in);
		System.out.println("어떤걸 드릴까요?");
		String order =sc.nextLine();
		int price = 0;
		//2 조건문
		if (order =="아아 or 아메리카노") {
			 price =3000;
		}else if (order =="카푸치노"){
			 price =4500;
		}else if(order.equals("밀크티")){
			price =5000;
		}
			
		
		switch (price) {
		case 3000 :
		System.out.println("아아 or 아메리카노");
			break;
		case 4500 :
			System.out.println("카푸치노");
			break;
		case 5000 :
			System.out.println("밀크티");
			break;
		 default:
             System.out.println("알 수 없는 주문입니다.");
             break;
//			
//			
//		
//		}
		//3해당 조건의 값 할당
		//4 출력
		
	}

}
