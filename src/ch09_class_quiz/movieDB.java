package ch09_class_quiz;

import java.util.ArrayList;

public class movieDB {
	
	private ArrayList<movie> movieList =new ArrayList<>();
	
	//private 생성자 -> 해당 클래스에서만 생성할수 있음
	//인스턴스를 1개만 만들게 하는 방법으로 최초에 한번만 메모리에 할당하여
	//메모리 낭비를 방지 할수 있으며 단 하나의 객체로 존재해도 되는 클래스에 적용
	//이와 같은 방법을 싱글톤 패던이라함
	
	private movieDB(){
		movieList.add(new movie("신세계", "거기 딱 죽기 좋은 날씨네", "박성웅"," 신세계") );
		movieList.add(new movie("기생충", "넌 계획이 다 있구나", "송강호"," 기생충") );
	
	}
	private static movieDB instance =new movieDB();
		
	 public static movieDB getInstanceDb() {
	        return instance;
	    }
	 
	 
	    public ArrayList<movie> getmovieList() {
	        return movieList;
	    }
	 
	 
	 
	 
	 
}
	


