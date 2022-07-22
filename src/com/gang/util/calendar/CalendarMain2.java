package com.gang.util.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		
		birth.set(Calendar.YEAR, 2000);
		birth.set(Calendar.MONTH, 11);
		birth.set(Calendar.DATE, 24);
		/*
		future.set(Calendar.MINUTE, 15);
		
		long n = now.getTimeInMillis();
		long f = future.getTimeMillis();
		
		long result = f - n;
		System.out.println(result);
		System.out.println(result/(1000*60));
		*/
		
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		long result = n - b;
		result = result / (1000*60*60*24);
		result = result / 365;
		System.out.println(result);
		
		Date date = now.getTime();
		System.out.println(date);
		
		

	}

}
