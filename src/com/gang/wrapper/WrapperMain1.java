package com.gang.wrapper;

public class WrapperMain1 {

	public static void main(String[] args) {

		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String num = "10";
		
		Integer integer = new Integer(num);
		int n = integer.intValue();
		
		n = 50;
		integer = new Integer(n);
		
		integer = n;
		n = integer;
		
		long l = 10;
		long ll = 1;
		
		integer = (int)l;
		
		String num1 = null;
		String num2 = "3.12";
		String num3 = "60";
		
		int n1 = Integer.parseInt(num1);
		double n2 = Double.parseDouble(num2);
		long n3 = Long.parseLong(num3);
		System.out.println(n1*2);
		System.out.println(n2*2);
		System.out.println(n3*2);
		
		
	}

}
