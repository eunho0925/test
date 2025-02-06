package ch09_class_utill;

/**
 *class Name :utillClass
 *Author      :EH
 *Created Date:2025. 2. 5.
 *Version     :1.0
 *Purpose     :{자바 기초}
 *Description :{static 메소드}
 */
public class utillClass {
	/*
	 *  public static 정적 메소드는 어디서든 사용할수 있는 메서드 
	 *  공통기능 같은 부분을 정의해서 사용할때 만드는 클래스
	 * 
	 * 
	 * */
	public static double weRound (double num, int n) {
		int len=1;
		for(int i=0; i<n ; i++) {
			len*=10;
			
		}
		num*=len;
		long temp =Math.round(num);
		double result =(double) temp/len;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(weRound(75.59794613213, 3));
	}
	

}
