package com.gang.string;

public class StringMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("==============");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		StringStudy ss = new StringStudy();
		ss.studyCharAt();
		//System.out.println(c);
		//c = str.charAt(0);
		//System.out.println(c);
		/*
		StringStudy2 s2 = new StringStudy2();
		s2.studyIndexOf();
		
		s2.studyIndexOfEx1();
		s2.ex2();
		*/
		StringStudy3 s3 = new StringStudy3();
		s3.studySplit3();
	}

}

