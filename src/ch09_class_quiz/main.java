package ch09_class_quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
	public static void main (String[] args) {
		//movieDB 는 싱글톤 패던 -> 외부 new할수 없음
		movieDB db1 = movieDB.getInstanceDb();
		movieDB db2 = movieDB.getInstanceDb();
		System.out.println(db1);
		System.out.println(db2);
		
		
		//영화 맞추기 게임
		//1 명대사 출력 맞추면 score +3
		//2 틀리면 배우출력 +2
		//3 틀리면 영화명 초성 출력 +1
		ArrayList<movie> movieList =db1.getmovieList();
		System.out.println(movieList);
		//순서를 랜덤하게 섞음
		Collections.shuffle(movieList);
		int score = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("영화 맞추기 게임");
		for (int i=0 ; i<movieList.size(); i++) {
			System.out.println(movieList.get(i).getQuote());
			System.out.println(">>>");
			String answer =sc.nextLine();
			if(answer.equals(movieList.get(i).getTitle())) {
				System.out.println("정답입니다+3");
					score+=3;
					continue;
			}
			System.out.println(movieList.get(i).getActor());
			System.out.println(">>>");
				answer =sc.nextLine();
				if(answer.equals(movieList.get(i).getTitle())) {
				System.out.println("정답입니다");
						score+=2;
						continue;
				}
				//영화 초성
				System.out.println(movieList.get(i).getWord());
				System.out.println(">>>");				
					answer=sc.nextLine();
				if(answer.equals(movieList.get(i).getWord())) {
					
					System.out.println("정답입니다");
					score+=1;
					continue;
				}
				
				System.out.println("떙 ! 다음문제로");
			
				
		}
		System.out.println("점수는 :"+score);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
