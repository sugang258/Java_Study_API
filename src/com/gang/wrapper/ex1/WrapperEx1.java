package com.gang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		//String jumin = sc.next();
		String jumin = "971224-2234567";
		//this.check1(jumin):
		//this.age(jumin);
		this.season(jumin);
		
	}
	
	private void check1(String jumin) {
		//1. 남자 여자 판단
		char ch = jumin.charAt(7);
		if(ch =='1' || ch == '3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
	
	public void age(String jumin) {
		String year = jumin.substring(0,2);
		char ch = jumin.charAt(7);
		String cen = "20";
		if(ch == '1' || ch == '2') {
			cen="19";
		}
		year = cen + year;
		
		int y = Integer.parseInt(year);
		
		y = 2022 - y;
		
		System.out.println("Age : " + y);
	}
	
	private void season(String jumin) {
		
		//메서드 안에 선언된 변수들 있음 매개변수만 주민은 주민번호가 들어올 예정
		//주민번호를 가지고 서브스트링할거임
		//주민으로 선언할 변수를 가공하고 안쓸거면 재활용해서 가능 스트링타입이면 다른 스트링이 필요할때
		jumin = jumin.substring(2,4);
		
		int month = Integer.parseInt(jumin);
		System.out.println(month);
		
		if(month > 2 && month < 6) {
			System.out.println("봄");
		}else if (month > 5 && month < 9) {
			System.out.println("여름");
			
		}else if(month > 8 && month < 12) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
	}

}
