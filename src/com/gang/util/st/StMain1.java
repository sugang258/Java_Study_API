package com.gang.util.st;

import java.util.StringTokenizer;

public class StMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "samsung-500-lg-600-google-900-kakao-700";
		
		StringTokenizer st = new StringTokenizer(str,"-");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			//parsing
			System.out.println(st.nextToken());
			
		}
		

	}

}
