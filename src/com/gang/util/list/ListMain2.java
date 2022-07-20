package com.gang.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListView listView = new ListView();
		
		ArrayList <String> ar = new ArrayList();
		ar.add("first");
		//ar.add(2); //Integer auto boxing
		//ar.add('c');
		//ar.add(2.123); //Double auto boxing
		ar.add(null);
		
		listView.view(ar);
		
		//get -> 특정 index의 요소를 반환
		String n1 = ar.get(0);
		//int n2 = (int) ar.get(1);
		//char ch = (char) ar.get(2);
		//double d = (double) ar.get(3);
		
		System.out.println(n1);
		//System.out.println(n2);
		//System.out.println(ch);
		//System.out.println(d);
	}

}
