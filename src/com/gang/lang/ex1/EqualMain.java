package com.gang.lang.ex1;

public class EqualMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone();
		p1.setPrice(100);
		p1.setSize(50);
		
		Phone p2 = new Phone();
		p2.setPrice(100);
		p2.setSize(50);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println();

	}

}
