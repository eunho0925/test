package ch09_class_student;

import java.util.ArrayList;

public class studentmain {

	public static void main(String[] args) {
		students stu1= new students("팽수"); //new 클래스를 사용하기 위해 인스턴스화
		students stu2= new students("팽순");
		students stu3 =new students();
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu2.getName());
		stu1.setName("김팽수");
		System.out.println(stu1.getName());
		
		stu1.setKor(90);
		System.out.println(stu1);
		stu1.setEng(75);
		System.out.println(stu1);
		stu1.nm();
		students.check();//정적 메소드 호출
//      students.nm() // class 기본 메소드는 인스턴스 메소드임(인스턴스화 이후 사용가능)		
		
		
		ArrayList<students> classmate =new ArrayList<>();
		classmate.add(stu1);
		classmate.add(stu2);
		for (students st: classmate) {
			System.out.println(st.getName());
		}
	}

}
