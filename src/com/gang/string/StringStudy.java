package com.gang.string;

public class StringStudy {
	
	public void studyCharAt() {
		//문자열 = 문자배열
		char [] ch = {'H', 'e' ,'l','l','o',' ','W','o','r','l','d'};
		String str = " Hello World";
		
		System.out.println(ch[0]);
		
		char c = str.charAt(0);
		System.out.println(c);
		c = str.charAt(1);
		System.out.println(c);
		
		System.out.println(str.length());
		
		System.out.println("===========");
		//str문자열을 하나씩 꺼내서 출력
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		

		
	}

}
