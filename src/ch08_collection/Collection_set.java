package ch08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Collection_set {

	/**
	 * class name :CollectionSet
	 * Author     :EH
	 * Version :1.0
	 *Create date:2025 .02.4
	 *purpose : 자바 기초
	 *description:Set
	 */
	public static void main(String[] args) {
		Set<String> sets=new HashSet<>();
		sets.add("a");
		sets.add("b");
		sets.add("c");
		sets.add("a");
		System.out.println(sets);
		
		
		
		//for 문
		for (String str :sets) {
			System.out.println(str);
		}
		System.out.println(makeLotto());
		Set<Integer> myLotto = makeLotto();
		ArrayList<Integer> lotto =new ArrayList<>(myLotto);
		System.out.println(lotto);
		Collections.sort(lotto);
		System.out.println(lotto);
		
	}
	public static Set<Integer> makeLotto(){
		Set<Integer> lotto = new HashSet<>();
				//1 ~45 사으이 랜덤값 6개 생성
		while(lotto.size()<6) {
			int num = (int) ((Math.random() *45)+1);
			lotto.add(num);
		}
		
		return lotto;
	}

}
