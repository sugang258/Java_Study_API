package com.gang.string;

public class StringStudy2 {
	
	public void studyIndexOf() {
		String str = "Hello Java";
		char c = 'p';
		
		for(int i=0;i<str.length();i++) {
			if(c == str.charAt(i) ) {
				System.out.println(i);
				break;
			}
			}
		}
	}


