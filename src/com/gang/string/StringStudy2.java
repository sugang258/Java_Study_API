package com.gang.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringStudy2 {
	
	public void ex2() {
		//키보드로부터 파일명을 입력 받음, abc.txt
		//파일이 이미지파일인지 아닌지 구별
		//확장자 jpg, png, gif, jpeg
		Scanner sc = new Scanner(System.in);
		String file = sc.next();
		
	
		//int index = file.lastIndexOf(".");
		String ex = file.substring(file.lastIndexOf(".") + 1);
		
		switch(ex) {
		case "jpg":
		case "png":
		case "gif":
		case "jpeg":
			System.out.println("이미지파일 확인");
			break;
			
		default:
				System.out.println("이미지파일 아님");
			
		}
		
		
		/*
		if((ex == "jpg") && (ex == "png") && (ex == "gif") && (ex == "jpeg")  ) {
			System.out.println(ex);
		}else {
			System.out.println("이미지 파일 확인");
		}
		*/
		
		
	}
	
	
	public void studyIndexOf() {
		String str = "Hello Java";
		char c = 'l';
		
		for(int i=0;i<str.length();i++) {
			if(c == str.charAt(i) ) {
				System.out.println(i);
				break;
			}
			}
		}
	
	public void studyIndexOfEx1() {
		String names = "iu, suji, choa, hani";
		//1. names에는 몇개의 쉼표가 있는가?
		//2. 총 몇명입니까?
		int num =0;
		String c =",";
		int index = names.indexOf(c);
		
		
		while(index != -1) {
			index = names.indexOf(c, index+1);
			num++;
			
		}
		System.out.println(num);
		System.out.println(num+1);
		
	}
	}


