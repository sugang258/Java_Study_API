package com.gang.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		
		//ca.roll(Calendar.MINUTE, 20);
		ca.add(Calendar.MINUTE, 20);
		System.out.println(ca.getTime());
		
		System.out.println("================");
		ca = Calendar.getInstance();
		String pattern = "yyyy년 MM월 dd일 E";
		SimpleDateFormat sd = new SimpleDateFormat();
		String time = sd.format(ca.getTime());
		System.out.println(time);

	}

}
