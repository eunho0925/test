package ch09_class_typing;

import java.util.ArrayList;
import java.util.Scanner;

public class TypingGames {

	public static void main(String[] args) {
		int num;
		if(args.length > 0) {
			num=Integer.parseInt(args[0]);
		}else {
			num = dictionary.OPTION_STUDENT;
		}
		System.out.println(num);
		System.out.println("=== typing game===(0.names 1.coding  2.random)");
		System.out.println(num+"select");
		Scanner sc =new Scanner(System.in);
		ArrayList<String> wordList = dictionary.makeWordList(num);
		//현재시간
		long before =System.currentTimeMillis();
		int s = 0;
		int f = 0;
		int cnt = 0;
		//1. wordList 단어 중 랜덤하데 선택 출력
		 int idx=(int)(Math.random()*wordList.size());
		 
	        System.out.println("랜덤 단어 목록: " + wordList.get(idx));
	        System.out.println(">>>>");
	        
	        String input = sc.nextLine();
		//2. 입력 단어와 문제 단어가 일치하면 a증가
	        if (wordList.get(idx).equals(input)) {
	        	wordList.remove(idx);
	        s++;
	        }else {
	        	f++;
	        }
	        cnt++;
	        if (cnt==2) {
	        	System.out.println(cnt +"회시도");
				System.out.printf("s:%d f:%d",s,f);
	        		
				
	        }
	        long after =System.currentTimeMillis();
	        long diff =after-before;
	        	
	        
		//3 틀리면 f증가
		//4. 게임이 끝나면 끝난시간과 before 사용하여 소요시간 구하여 출력(총,맞춘 틀린것도)
		while (true) {
			cnt++;
			if (cnt==2) {
				System.out.println(cnt +"회시도");
				break;
			}
		} System.out.println("\n게임 종료");
        System.out.println("걸린 시간: " + diff/1000 + "초");
        System.out.printf("맞춘 개수: %d, 틀린 개수: %d\n", s, f);

	}

}
