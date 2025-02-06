package ch05_conditional;

/**
 *class Name :conditional
 *Author      :EH
 *Created Date:2025. 1. 23.
 *Version     :1.0
 *Purpose     :{JAVA 기초}
 *Description :{조건문 IF}
 */
public class conditional {

	public static void main(String[] args) {
		int score =85;
		String grade ="";
		if(score >= 90) {
			grade ="A";	
		}else if (score >= 80) {
			grade ="B";
		}else {
			grade ="C";
		}
		System.out.println(score +"는"+grade);
		
		
		//변수의 scope
		int price =3000;
		int myMoney =1000;
		String msg ="";
		if( price > myMoney) {
			System.out.println("돈이 부족");	
			 msg ="돈이 부족";
		}else {
			System.out.println("돈이 충분");
			 msg = "돈이 충분";
		}
		System.out.println(msg);
		
		
		// 중첩 if 가능 if문 안에 if문 
		// 조건1 :이름은 1글자 이상
		// 조건2:전화번호는 10or 11자리
		//조건1이 만족하지 않으면 가입실패
		String nm ="닉";
		String phone = "0101234567";
		//조건1
		if(nm.length() >=1) {
			if(phone.length() ==10 || phone.length() ==1) {
				System.out.println("환영합니다");
				
				
			}else {
				System.out.println("가입실패");
		    }
		    else {
				System.out.println("가입실패!");
				
		}
		
		
		
		
		
		
		
		
		}
	
	
}
	
	
	

	
