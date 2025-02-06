package ch06_method;

public class methodex {

	public static void main(String[] args) {
		//이름 국어점수 수학점수 영어점수를 입력받아 
		// 평균과 등급을 출력하는 메소드를 작성
		// input : String int int int
		// output: 없음
		// 등급은 90 이상 a 80 이상 b 나머지 c 
		// 출력 )xxx님의 평균은 95.0으로 a등급
		
		ave("은호", 100,80, 70);

	}
	public static void ave(String name, int a ,int b,int c) {
		float di = (a+b+c)/3;
		if (di>=90)  {
			System.out.printf("%s 님의 평균은 %.2f 이므로 A 등급 입니다",name,di);
		
		}else if (di>=80) {
		    System.out.printf("%s 님의 평균은 %.2f 이므로 B 등급 입니다",name,di);	
		}else {
			System.out.printf("%s 님의 평균은 %.2f 이므로 c 등급 입니다",name,di);
		}
	}
	
	
	
	
	
	
	
	
	

}
