package com.gang.util.calendar;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calender ca = new GregorianCalendar();
		//현재 년 월 일 시 분 초 밀리세컨즈
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);
		ca.set(Calendar.YEAR, 2002);
		ca.set(Calendar.MONTH, 11);
		ca.set(Calendar.DATE, 25);
		
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DAY_OF_MONTH);
		int h = ca.get(Calendar.HOUR_OF_DAY);
		int min = ca.get(Calendar.MINUTE);
		int sec = ca.get(Calendar.SECOND);
		
		long milis = ca.getTimeInMillis();
		
		System.out.println(y);
		System.out.println(m+1);
		System.out.println(d);
		System.out.println(h);
		System.out.println(min);
		System.out.println(sec);
		System.out.println(milis);

	}

}
