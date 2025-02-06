package ch09_class_typing;

import java.util.ArrayList;

public class dictionary {
	//전역적으로 사용하는 상수
	public static final int OPTION_STUDENT =0; //상수는 보통 대문자로
	public static final int OPTION_CODING_WORD =1;
	public static final int OPTION_RANDOM =2;
	
	
	//타자연습 게임을 위한 단어 메소드
	public static ArrayList<String> makeWordList(int option){
		ArrayList<String> result =new ArrayList<>();
		if (option == OPTION_STUDENT) {
			result.add("kang jisuk");
			result.add("song eunho");
		}else if (option == OPTION_CODING_WORD) {
			result.add("class");
			result.add("if");
		}else if(option == OPTION_RANDOM) {
			// 랜덤 알파벳 6자리로 단어설정
			 
			String [] alphabet ="qwerreyutyfsdfgsg".split("");
			//10개 담기 
			for (int i=0; i<10 ;i++) {
				String word="";
				for (int j=0; j<6; j++) {
					int idx =(int)(Math.random()*alphabet.length);
					word+=alphabet[idx];
				}
				result.add(word);
			}
		}
		return result;
		
		
		
		
	}
}
