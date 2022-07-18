package com.gang.lang;

public class LangMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj = new Object();
		String str = obj.toString();
		Member member = new Member();
		str = member.toString();
		
		System.out.println(member);
		
		obj = member;
		
		

	}

}
