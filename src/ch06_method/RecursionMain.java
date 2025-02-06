package ch06_method;

/**
 *class Name :RecursionMain
 *Author      :EH
 *Created Date:2025. 1. 31.
 *Version     :1.0
 *Purpose     :{자바기초}
 *Description :{재귀함수}
 */
public class RecursionMain {
	public static void main(String[] args) {
		System.out.println(refactorial(3));
	}
	// factorial 재귀함수 활용
	public static long refactorial(int num) {
		if (num ==1) { // num 1이 되면 1을 리턴
			return 1;
		}
		// 3을 입력하면
		//3 * refactorial(2)
		return num * refactorial(num-1);
	}
	// 재귀함수는 멈추는게 중요함
	public static void Func(int num) {
		if (num == 0) {
			return ;
		}
		System.out.println("hi");
		Func(num-1);
	}
}
