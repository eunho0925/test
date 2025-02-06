package paratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class resutl03 {

	public static void main(String[] args) {
		ArrayList<Set<Integer>> weekLotto = new ArrayList<>();
		weekLotto.add(makeLotto());
		  for (Set<Integer> set : weekLotto) {
	            List<Integer> sortedList = new ArrayList<>(set);  
	            Collections.sort(sortedList);  
	            System.out.println(sortedList);
	            }
		
	}
	public static Set<Integer> makeLotto(){
		Set<Integer> lotto = new HashSet<>();
		
				//1 ~45 사이 랜덤값 6개 생성
		
		while(lotto.size()<6) {
			int num = (int) ((Math.random() *45)+1);
			lotto.add(num);
		}
		
		return lotto;
		
		
	}

}
