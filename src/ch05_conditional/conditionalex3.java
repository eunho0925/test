package ch05_conditional;

public class conditionalex3 {

	public static void main(String[] args) {
		/*거꾸로 트리를 5층 만들어 주세요
		 * 실행 결과
		 * 
		 * 
		 * 
		 * 
		 */

		//String b ="******";
		//for (int i =5; i>0 ; i--) {
			//String result=b.substring(0,i);
			//System.out.println(result);
		//}
		
		//2.중첩  for문
		for (int i =5; i>0 ; i--) {
			for (int j =0; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
