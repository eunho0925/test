package ch08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setex {

	public static void main(String[] args) {
	// 행운의 로또생성기를 만들어주세요
	//1 사용자에게 수량을 받아서 해당 수량만큼 로또번호를 생성해주세요
    //input :수량
	//output :ArrayList<Hashset> (로또번호)
	
		
		System.out.println("행운의 로또 번호 생성기");
		Scanner sc =new Scanner(System.in);
		System.out.println("몇개");
		System.out.println(">>>");
		int cnt =sc.nextInt();
		ArrayList<Set<Integer>> result =happyLotto(cnt);
		for(Set<Integer>sets:result) {
			ArrayList<Integer> lottoArrayList =new ArrayList<>(sets);
			Collections.sort(lottoArrayList);
			System.out.println(lottoArrayList);
		}
		System.out.println("행운이 가득하시길");
	}
	public static ArrayList<Set<Integer>>  happyLotto(int num){
		
		
		ArrayList<Set<Integer>> lotto = new ArrayList<>();
		for (int i =0 ; i<num ; i++) {
			lotto.add(makeLotto());
		}
		
		
		return lotto;
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


