package ch02_variable;

public class Constant {
	
	public static void main(String[] args) {
		
		// 상수 Constant 변경불가!
		 final double MATH_PI =3.14;    //변경을 안할 변수다
		  // 상수 변경오류 (변수는 변경가능)
		
		//문자열 String 타입은 클래스로 관리되어짐(다양한 함수[메소드] 를 내장
		String fruits ="Apple, Banana, Cherry";
		System.out.println(fruits.length());
		String trimfruits =fruits.trim();
		System.out.println(trimfruits.length());
		//.indexof(키워드) 키워드 문자열을 찾아서 첫번쨰 인덱스를 리턴
		// 문자열의 인덱스는 0부터 시작
		System.out.println(trimfruits.indexOf("Banana"));
		System.out.println(trimfruits.indexOf("바나나") );
	
		//substring(시작,종료) 인덱스 : 시작인덱스 부터 종료인덱스 전까지 자름
		//substring(시작) 인덱스     : 시작인덱스 부터 끝까지
		
		System.out.println(trimfruits.substring(15));
		System.out.println(trimfruits.substring(7,13));
		
		String pangsu ="팽수:10";
		//이름과 니이를 가각 출력하세요
		System.out.println(pangsu.substring(0,2));
		System.out.println(pangsu.substring(3));
	
		
		
		
		
		//shift +alt +j [자동주석]class,method .. 등등 위체에서 누르면됨.
	
		
		
	
		
		
		
		
		
		
	}


}
