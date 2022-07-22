package com.gang.exception;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public void t3() {
		
	}
	
	public void t2() {
		String [] str = {"10", "five", "3.14","0"};
		Scanner sc = new Scanner(System.in);
		
		
		for(String s:str) {
			try {
				System.out.println("숫자를 입력하세요");
				
				int n = sc.nextInt();
			int num = Integer.parseInt(s);
			num = n/num;
			System.out.println(num);
			}catch(NumberFormatException e) {
				System.out.println("예외처리");		
			}catch(ArithmeticException e) {
				System.out.println("수학 오류 해결");
			}catch(Throwable e) {
				
			}
		}
	}
	
	public void t1() {
		Random random = new Random();
		String str = null;
		
		if(random.nextInt(10)%2 == 0) {
			str = "10";
		}
		int num = Integer.parseInt("10"); // New NumberException
		
		try {
		num = num / 0;
		System.out.println(num);
		}catch(ArithmeticException e) {
			System.out.println("예외처리");
			
		}
		System.out.println(str.toString());
		new NullPointerException();
	}

}
