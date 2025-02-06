package ch08_collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 *class Name :collectionmap
 *Author      :EH
 *Created Date:2025. 2. 5.
 *Version     :1.0
 *Purpose     :{java 기초}
 *Description :{map}
 */
public class collectionmap {
	public static void main(String[] args) {
		//Map은 가장 많이 사용 데이터 구조중 하나
		//Key 와 value 한쌍인 데이터
		HashMap<String, String> stuMap= new HashMap<>();
		//<key 문자열 value 문자열>
		stuMap.put("첫째", "길동");
		stuMap.put("둘째", "동길");
		stuMap.put("셋째", "길수");
		System.out.println(stuMap);
		System.out.println(stuMap.get("둘째")); //key로 value찾기
		stuMap.put("둘쩨","동수");//동일 key이면 수정이됨 
		System.out.println(stuMap.size());//순서는 보장하지않지만 사이즈는 가쟈옴
		System.out.println(stuMap.containsKey("첫째")); //key값이 있으면 true
		System.out.println(stuMap.containsValue("동길"));//value값이 있으면 true
		
		
		//map은 keyset으로 for문 사용
		Set<String> keys =stuMap.keySet(); //키 정보만 반환
		System.out.println(keys);
		for(String key: keys) {
			System.out.println(stuMap.get(key));
		}
		//entrySet 사용 for문
		Set<Entry<String,String>> entrySet =stuMap.entrySet();
		for(Entry<String,String> entry :entrySet) {
			String  key= entry.getKey();
			String value=entry.getValue();
			System.out.println(key +":"+value);
					
		}
		
		HashMap<String, Integer> coinMap =new HashMap<>();
		coinMap.put("비트코인", 142872834);
		coinMap.put("이더리움", 142872834);
		
		for(String coin:coinMap.keySet()) {
			System.out.println(coin+":"+coinMap.get(coin));
		}

		
		
		
		
		
		
		
		
	}
}
