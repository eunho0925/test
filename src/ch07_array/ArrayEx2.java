package ch07_array;

public class ArrayEx2 {

	public static void main(String[] args) {
		// Q.월리를 찾아라
		// findWally 문자열에 '윌리가' 몇개 있는지 출력
		String findWally ="윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int cnt =0;
		String a = null;
		
		 
		for (int i=0; i<findWally.length(); i+=2) {
		    a=findWally.substring(i,i+2);  
		     //System.out.println(a);
		     if(a.contains("월리")) {
		    	cnt++;
		    	
		     }
		      
			
		     
		
			
		}
		System.out.println(cnt);
		
		
	
		
	
	
	
	}
	

}
