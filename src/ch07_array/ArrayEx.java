package ch07_array;

public class ArrayEx {

	public static void main(String[] args) {
		// 1.우리반 학생들의 이름이 담긴 String [] 선언
		// 단축키 shift + all + a
		String[] student = { "강지석", "김도래", "김병준", "김서영", "김소연", "김원진", "박정단", "박종욱", "송은호", "신미정", "이예성", "이예은", "정지나",
				"최보석", "한수정" };
		//학생출력
		for (int i=0; i<student.length ; i++) {
			System.out.printf("%d.%s\s",i+1,student[i]); 
		}
		//학생들의 이름에 출석부 순서를 붙여주세요 1.강지석 2.김도래 ...
		//같은 성 찾기 메소드를 작성
		// input :String , String[]
		//output 없음
		//호출 searchNum("이",student);
		// 출력 '이씨' 성을 가진 학생은 총 2명 있습니다/
		// 이예성, 이예은씨
		
		//비어있는 메소드 만들기
		//반복문
		//3 이름 첫자리가 찾고자 하는 성과 같은지 (문자열도 인덱스로 접근가능) or substring 같은면 카운트
		//증가
		//4. 반복이 종료되고 성과 카운트 출력
		
		SearchNm("김",student);

		
		
		
		
		
	}
	public static void SearchNm(String a , String[] arr) {
		String[] student = arr;
		int count=0;
		String nm =""	;
			for(int i =0 ; i<student.length; i++) {
				
					if(student[i].substring(0,1). contains(a)) {
						count++;
						nm+= arr[i] +" 씨 ";
						
				
					
				}
						
			}
			
			System.out.printf("%s 의 성을 가진 동기분은 총 %d 명 있습니다 ",a,count);
			System.out.println(nm);
			
			
		}
}
