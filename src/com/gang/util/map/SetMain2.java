package com.gang.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random
		//1-45 중복되지 않는 숫자 6개 Set에 담아서 출력
		Random random = new Random();
		HashSet<Integer> hashSet = new HashSet<>();
		
		
		for(int i =0; i<6 ; i++) {
			int num = random.nextInt(45)+1;
			hashSet.add(num);
		}
		
		Iterator<Integer> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

		

	}

}
